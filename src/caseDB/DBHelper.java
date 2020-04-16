package caseDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import Bean.BusinessModule;
import Bean.CaseEntity;
import Bean.ExpectEntity;

public class DBHelper {
	public static final String url = "jdbc:mysql://192.168.1.136:3306/autocase";
//	public static final String name ="com.mysql.cj.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "Hbqy@1234";
	private static DBHelper dbhelper = null; 
	private Logger logger = Logger.getLogger("record");  

	public Connection conn = null;
	public PreparedStatement pst = null;
	public ResultSet ret = null;
	String sqlStr = "";

	private DBHelper() {
			try {
				/*Class.forName(name);*///指定连接类型
				conn = DriverManager.getConnection(url, user, password);//获取连接
				System.out.println("数据库连接成功");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			}
			
	}
	
	//单例，全局访问
	public static synchronized DBHelper getInstance(){
		
		if(dbhelper == null){
			synchronized(DBHelper.class){
				if(dbhelper == null){
					dbhelper = new DBHelper();
				}
			}
		}
		return dbhelper;
	}

	//设置用例通过
	public void setCasePass(int moduleid,CaseEntity caseentity){
		
		/*  moduleid
		 * 
		 * QQ安装登录---8	 
		 */
		
		switch (moduleid) {
		case 8:
			sqlStr = "update MPM_SubmitAwardBuckle set results = '1' where id = "+caseentity.getId();
			break;
		default:
			break;
		}
		try {
			pst = conn.prepareStatement(sqlStr);
			pst.execute();
			logger.warning("编号"+caseentity.getId()+":"+caseentity.getDescription()+"验证通过！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<CaseEntity> getCaselistData(int modelnumber){
		/*
		 * QQ安装登录---8
		 */
		List<CaseEntity> caselist = new ArrayList();
		CaseEntity caseentity;
		
		switch (modelnumber) {
		
		case 8:
			sqlStr = "select * from MPM_SubmitAwardBuckle";
			break;
		default:
			break;
		}
		try {
			pst = conn.prepareStatement(sqlStr);
			ret = pst.executeQuery();
			System.out.println("获取测试用例数据成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(ret.next()){
				caseentity= new CaseEntity();
				caseentity.setId(ret.getInt(1));
				caseentity.setLocaltype(ret.getInt(2));
				caseentity.setValuestr(ret.getString(3));
				caseentity.setDescription(ret.getString(4));
				caseentity.setExpectresid(ret.getInt(5));
				caseentity.setResult(ret.getInt(6));
				caseentity.setBusinessid(ret.getInt(7));
				caseentity.setExtendvalue(ret.getString(8));
				caselist.add(caseentity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return caselist;
	}
	
	public ExpectEntity getExpectData(int expectcontentid){
		
		ExpectEntity expectentity = new ExpectEntity();
		sqlStr = "select * from MPM_SubmitAwardBuckle where id =" + expectcontentid;
		try {
			pst = conn.prepareStatement(sqlStr);
			ret = pst.executeQuery();
			System.out.println("获取预期结果实例数据成功！");
			expectentity.setId(expectcontentid);
			while(ret.next()){
				expectentity.setLocaltype(ret.getInt(2));
				expectentity.setValuestr(ret.getString(3));
				expectentity.setDescription(ret.getString(4));
				expectentity.setVertifyvalue(ret.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return expectentity;
	}
	
	public BusinessModule getBusiness(int id){
		BusinessModule module = new BusinessModule();
		
		sqlStr = "select * from MPM_SubmitAwardBuckle where id =" + id;
		try {
			pst = conn.prepareStatement(sqlStr);
			ret = pst.executeQuery();
			System.out.println("获取业务数据成功");
			module.setId(id);
			while(ret.next()){
				module.setDescription(ret.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return module;
	}
	
	public void initModuleCaseResults(int modelnumber){
		
		switch (modelnumber) {
		case 8:
			sqlStr = "update MPM_SubmitAwardBuckle set results = '1'";
			break;
		default:
			break;
		}
		
		try {
			pst = conn.prepareStatement(sqlStr);
			pst.execute();
			System.out.println("初始化测试用例结果！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initAllCaseResults(){
		for(int i = 1 ; i < 8 ; i++){
			initModuleCaseResults(i);
		}
	}
	
	public void setCaseExtendvalue(int moduleid,CaseEntity caseentity){
		/*moduleid
		 * 
		 * QQ登录---8
		 */
		
		switch (moduleid) {
		case 8:
			sqlStr = "update MPM_SubmitAwardBuckle set extendvalue = '"+caseentity.getExtendvalue()+"' where id = '"+caseentity.getId()+"'";
			break;
		default:
			break;
		}
		try {
			pst = conn.prepareStatement(sqlStr);
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setExpectVertifyValue(CaseEntity caseentity,String vertifyvalue){
		sqlStr = "update MPM_SubmitAwardBuckle set vertifyvalue = '"+vertifyvalue+"' where id = "+ caseentity.getExpectresid();
			try {
			pst = conn.prepareStatement(sqlStr);
			pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.ret.close();
			this.conn.close();
			this.pst.close();
			System.out.println("关闭数据库资源");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package MainBase;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import Bean.CaseEntity;

public class DataHandler {

	private static List<CaseEntity> caselist ;

	public DataHandler() {
		// TODO Auto-generated constructor stub
	}

	public static List<String> getStrByTypevalue(CaseEntity caseentity){
		
		List<String> typevalue_strlist = new ArrayList();
		String str = caseentity.getExtendvalue();
		
		StringTokenizer st = new StringTokenizer(str,"#");
         while(st.hasMoreTokens()){//看看此 tokenizer 的字符串中是否还有更多的可用标记。
        	 typevalue_strlist.add(st.nextToken());//返回此 string tokenizer 的下一个标记。
         }
       
		return typevalue_strlist;
	}
	
	public static List<String> getValueList(CaseEntity caseentity){
		
		List<String> valuestr_strlist = new ArrayList();
		String str = caseentity.getValuestr();
		
		StringTokenizer st = new StringTokenizer(str,"#");
        while(st.hasMoreTokens()){//看看此 tokenizer 的字符串中是否还有更多的可用标记。
        	valuestr_strlist.add(st.nextToken());//返回此 string tokenizer 的下一个标记。
        }
		
		return valuestr_strlist;
	}
	
	public static List<CaseEntity> getCaseListByValuestr(CaseEntity caseentity){
		caselist = new ArrayList();
		
		String str = caseentity.getValuestr();
		List<String> valuestr_list = new ArrayList();
		
		StringTokenizer st = new StringTokenizer(str,"#");
        while(st.hasMoreTokens()){//看看此 tokenizer 的字符串中是否还有更多的可用标记。
        	valuestr_list.add(st.nextToken());//返回此 string tokenizer 的下一个标记。
        }
		
		for(int i = 0;i < valuestr_list.size();i++){
			
			CaseEntity caseentity1 = new CaseEntity();
			caseentity1.setValuestr(valuestr_list.get(i));
			caseentity1.setLocaltype(1);
			caselist.add(caseentity1);
		}
		
		return caselist;
	}
	
	
}

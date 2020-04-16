package Bean;

public class CaseEntity {
	
	private int id;
	private int localtype;
	private String valuestr;
	private String description;
	private int expectresid;
	private int result;
	private int businessid;
	private String extendvalue;
	
	public CaseEntity(){
		
	}
	
	public CaseEntity(int id, int localtype, String valuestr,
			String description, int expectresid, int result,
			int businessid, String extendvalue) {
		
		super();
		this.id = id;
		this.localtype = localtype;
		this.valuestr = valuestr;
		this.description = description;
		this.expectresid = expectresid;
		this.result = result;
		this.businessid = businessid;
		this.extendvalue = extendvalue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLocaltype() {
		return localtype;
	}

	public void setLocaltype(int localtype) {
		this.localtype = localtype;
	}

	public String getValuestr() {
		return valuestr;
	}

	public void setValuestr(String valuestr) {
		this.valuestr = valuestr;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExpectresid() {
		return expectresid;
	}

	public void setExpectresid(int expectresid) {
		this.expectresid = expectresid;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public void setBusinessid(int businessid){
		this.businessid = businessid;
	}

	public int getBusinessid(){
		return this.businessid;
	}

	public String getExtendvalue() {
		return extendvalue;
	}

	public void setExtendvalue(String typevalue) {
		this.extendvalue = typevalue;
	}
	
	
}

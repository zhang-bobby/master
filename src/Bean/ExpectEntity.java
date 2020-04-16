package Bean;

public class ExpectEntity {
	
	private int id;
	private int localtype;
	private String valuestr;
	private String description;
	private String vertifyvalue;
	
	public ExpectEntity(){
		
	}
	
	public ExpectEntity(int id, int localtype, String valuestr,
			String description, String vertifyvalue) {
		super();
		this.id = id;
		this.localtype = localtype;
		this.valuestr = valuestr;
		this.description = description;
		this.vertifyvalue = vertifyvalue;
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

	public String getVertifyvalue() {
		return vertifyvalue;
	}

	public void setVertifyvalue(String vertifyvalue) {
		this.vertifyvalue = vertifyvalue;
	}

	
}

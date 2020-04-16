package Bean;

public class Coordinate {

	int x;
	int y;
	String name;
	
	public Coordinate(){

	}
	public Coordinate(int x,int y,String name){
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	public void setCoX(int x){
		this.x = x;
	}
	
	public void setCoY(int y){
		this.y = y;
	}
	
	public void setCoXY(int x,int y){
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getCoX(){
		return this.x;
	}
	
	public int getCoY(){
		return this.y;
	}
	
	public String getName(){
		return this.name;
	}
}

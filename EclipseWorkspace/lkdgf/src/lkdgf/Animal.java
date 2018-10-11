package lkdgf;

public abstract class Animal {
	
	String color;
	
	public Animal(){
		this.color = "";
	}
	public Animal(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}

}

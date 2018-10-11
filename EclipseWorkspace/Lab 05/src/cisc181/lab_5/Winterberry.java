package cisc181.lab_5;

public class Winterberry extends Berry{

//	constructor
	public Winterberry(){
		super("red",0.117);
	}
	
	@Override//returns the harvest method for this berry
	public String harvestBerry() {
		return "Branch Cutting";
	}
	//toString method
	public String toString(){
		return "Winterberry";
	}
	
	

}

package cisc181.lab_5;

public class Blueberry extends Berry implements Edible{

//	default constructor
	public Blueberry(){
		this(1);
	}
//	constructor
	public Blueberry(double grams){
		super("blue", grams);
	}
	
	 
	@Override//returns calorie count of blueberry dependent on grams
	public double getCalories() {
		return 0.57 * getGrams();
	}
	@Override//returns the harvest method for this berry
	public String harvestBerry() {
		return "Picking";
	}
	@Override//toString method
	public String toString(){
		return "Blueberry";
	}
	
	
}

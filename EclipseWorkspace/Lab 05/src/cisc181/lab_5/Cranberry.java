package cisc181.lab_5;

public class Cranberry extends Berry implements Edible {

//	default constructor
	public Cranberry(){
		this(1);
	}
//	constructor
	public Cranberry(double grams){
		super("red",grams);
	}

	@Override//returns calorie count of blueberry dependent on grams
	public double getCalories() {
		// TODO Auto-generated method stub
		return 0.46 * getGrams();
	}

	@Override//returns the harvest method for this berry
	public String harvestBerry() {
		return "Wet Harvesting";
	}
	//toString method
	public String toString(){
		return "Cranberry";
	}
}

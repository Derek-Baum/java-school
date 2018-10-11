package cisc181.lab_5;

public class WildBlueberry extends Blueberry{

	public WildBlueberry() {
		super();
	}

	public WildBlueberry(double grams) {
		super(grams);
	}
	
	@Override
	public double getCalories(){
		return 0.35 * getGrams();
	}
	public String toString(){
		return "Wild Blueberry";
	}

	
	
	
}

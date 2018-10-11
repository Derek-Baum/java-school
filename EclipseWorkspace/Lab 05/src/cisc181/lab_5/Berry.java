package cisc181.lab_5;

public abstract class Berry {
	
	private String color;
	private double grams;
	
	// default constructor
	public Berry(){
		this("black", 1);
	}
	// constructor
	public Berry(String color, double grams){
		this.color = color;
		this.grams = grams;
	}
	/**
	 * Color Accessor 
	 * @return color
	 */ 
	public String getColor() {
		return color;
	}
	/**
	 * Grams Accessor
	 * @return grams
	 */
	public double getGrams() {
		return grams;
	}
	
	// Will return the method in which the respective berry type is harvested
	public abstract String harvestBerry();
	
	/**
	 * equals override
	 * @param b
	 * @return true, if color and grams are equal
	 */
	public boolean equals(Berry b){
		return grams == b.getGrams() && color.equals(b.getColor());
	}
	
}
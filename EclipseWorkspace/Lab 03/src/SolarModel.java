
public class SolarModel {
	
	private double tickLength;
	private Sun sun;
	private Planet planet;
	private Planet otherPlanet;
	
	
	public SolarModel(double tickLength,Sun sun,Planet planet,Planet otherPlanet){
		this.tickLength = tickLength;
		this.sun = sun;
		this.planet = planet;
		this.otherPlanet = otherPlanet;
	}
	public SolarModel(double tickLength,Sun sun,Planet planet){
		this(tickLength,sun,planet,null);
	}
	
	public double getTickLength() {
		return tickLength;
	}


	public Sun getSun() {
		return sun;
	}


	public Planet getPlanet() {
		return planet;
	}
	
	public Planet getOtherPlanet(){
		return otherPlanet;
	}
	
	public void onTick(){
		planet.updatePosition(tickLength);
		planet.updateDirectionFromSun(sun, tickLength);
		
		if(otherPlanet != null){
			otherPlanet.updatePosition(tickLength);
			otherPlanet.updateDirectionFromSun(sun, tickLength);
		}

		
		
	}
	

}

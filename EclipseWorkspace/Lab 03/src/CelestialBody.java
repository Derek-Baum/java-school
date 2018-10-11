/**
 * 
 * Group Members:
 * Derek Baum : 702438712
 * Max Manfre : 702435817
 *
 */
public abstract class CelestialBody {
	
	private Position position;
	private DirectionVector direction;
	private double mass;
	
	public CelestialBody(double mass, Position position,DirectionVector direction){
		this.position = position;
		this.direction = direction;
		this.mass = mass;
	}
	
	public Position getPosition() {
		return position;
	}
	public DirectionVector getDirection() {
		return direction;
	}
	public double getMass() {
		return mass;
	}	
}

public class Planet extends CelestialBody {

	public Planet(double mass, Position position, DirectionVector direction) {
		super(mass, position, direction);
	}

	public void updateDirectionFromSun(Sun s, double t) {
		double dx = s.getPosition().getX() - getPosition().getX();
		double dy = s.getPosition().getY() - getPosition().getY();
		double dist = Math.sqrt(dx * dx + dy * dy);
		// Newton's gravitational constant in N m^2 kg^-2
		double force = 6.67384E-11 * s.getMass() / (dist * dist * dist);
		getDirection().setX(getDirection().getX() + t * force * dx);
		getDirection().setY(getDirection().getY() + t * force * dy);
	}

	public void updatePosition(double t){
		getPosition().move(getDirection(), t);
	}
	
}

import org.junit.Test;

import static org.junit.Assert.*;
public class Lab3Test {

    @Test
    public void test_Position_move() {
        System.out.println("Testing move");
        Position p = new Position(1, 1, 1);
        DirectionVector v = new DirectionVector(2, -1, 1);
        p.move(v, 0.5);
        assertEquals(2.0, p.getX(), 0.01);
        assertEquals(0.5, p.getY(), 0.01);
        assertEquals(1.5, p.getZ(), 0.01);
    }

    @Test
    public void test_CelestialHierarchy1() {
        System.out.println("Testing Celestial Hierarchy 1");
        Sun s = new Sun();
        assertTrue(s instanceof CelestialBody);
        Planet planet = new Planet(1.3391E15,new Position(0, 0), new DirectionVector(0, 0) );
        assertTrue(planet instanceof CelestialBody);
        assertEquals(planet.getMass(), 1.3391E15, 0.000001);

    }


    @Test
    public void test_CelestialHierarchy2() {
        System.out.println("Testing Celestial Hierarchy 2");
        Sun s = new Sun();
        assertTrue(s instanceof CelestialBody);
        assertEquals(new DirectionVector(0, 0), s.getDirection());
        assertEquals(new Position(0, 0), s.getPosition());
        assertEquals(1.9891E30, s.getMass(), 0.01);

        Planet imaginary = new Planet(1, new Position(10000000000.0, 5000), new DirectionVector(-100, 200));
        assertTrue(imaginary instanceof CelestialBody);
        // test to make sure Planet is not a Sun
        assertFalse(imaginary.getClass().isAssignableFrom(Sun.class));
        // test to make sure Sun is not a Planet
        assertFalse(s.getClass().isAssignableFrom(Planet.class));
        assertEquals(new DirectionVector(-100, 200), imaginary.getDirection());
        assertEquals(new Position(10000000000.0, 5000), imaginary.getPosition());
        assertEquals(1.0, imaginary.getMass(), 0.01);
    }

    @Test
    public void test_updatePosition() {
        System.out.println("Testing updatePosition");
        // create a Sun and a Planet object
        Sun s = new Sun();
        Planet imaginary = new Planet(1, new Position(10000000000.0, 5000), new DirectionVector(-100, 200));
        // call update Position
        imaginary.updatePosition(100);
        // compare Position object's x and y values
        assertEquals(new Position(9999990000.0, 25000), imaginary.getPosition());
        // compare Direction Vectors x & y values
        assertEquals(new DirectionVector(-100, 200), imaginary.getDirection());
        // call updateDirectionFromSun
        imaginary.updateDirectionFromSun(s, 100);
        assertEquals(new Position(9999990000.0, 25000), imaginary.getPosition());
        DirectionVector updatedDV = imaginary.getDirection();
        assertEquals(-232.7496, updatedDV.getX(), 0.01);
        assertEquals(199.99967, updatedDV.getY(), 0.01);
    }



    @Test
    public void test_solarModel() {
        System.out.println("Testing SolarModel with one Planet");
        Sun s = new Sun();
        Planet imaginary = new Planet(1, new Position(10000000000.0, 5000), new DirectionVector(-100, 200));
        SolarModel solarModel = new SolarModel(100.0, s, imaginary);
        solarModel.onTick();
        assertEquals(new Position(9999990000.0, 25000), imaginary.getPosition());
        DirectionVector updatedDV = imaginary.getDirection();
        assertEquals(-232.7496, updatedDV.getX(), 0.01);
        assertEquals(199.99967, updatedDV.getY(), 0.01);
    }
}


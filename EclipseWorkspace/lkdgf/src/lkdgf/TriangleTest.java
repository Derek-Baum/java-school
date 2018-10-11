package lkdgf;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void getArea() {
		System.out.println("Testing getArea()");
		Triangle testTriangle = new Triangle(5.5,3.4,8.7);
		assertEquals(3.96, testTriangle.getArea(),0.00001);
	}
		
	@Test
	public void getPerimeter() {
		System.out.println("Testing getPerimeter()");
		Triangle testTriangle = new Triangle(3.0,4.0,5.0);
		assertEquals(12.0,testTriangle.getPerimeter(),0.00001);
		testTriangle = new Triangle(1.0,2.0,3.0);
		assertEquals(6.0,testTriangle.getPerimeter(),0.00001);
		testTriangle = new Triangle(1.0,2.0,43.0);
		assertEquals(46.0,testTriangle.getPerimeter(),0.00001);
	}
	@Test
	public void makeIsosRightTri(){
		System.out.println("Testing makeIsosRightTri()");
		Triangle myIsosRightTri = Triangle.makeIsosRightTri(6.5);
		assertEquals(6.5,myIsosRightTri.getSideA(),0.00001);
		assertEquals(6.5,myIsosRightTri.getSideB(),0.00001);
		assertEquals(9.19,myIsosRightTri.getSideC(),0.01);

		myIsosRightTri = Triangle.makeIsosRightTri(1);
		assertEquals(1.0,myIsosRightTri.getSideA(),0.00001);
		assertEquals(1.0,myIsosRightTri.getSideB(),0.00001);
		assertEquals(Math.sqrt(2),myIsosRightTri.getSideC(),0.01);
		
		myIsosRightTri = Triangle.makeIsosRightTri(2);
		assertEquals(2,myIsosRightTri.getSideA(),0.00001);
		assertEquals(2,myIsosRightTri.getSideB(),0.00001);
		assertEquals(Math.sqrt(8),myIsosRightTri.getSideC(),0.01);
		
		myIsosRightTri = Triangle.makeIsosRightTri(4);
		assertEquals(4,myIsosRightTri.getSideA(),0.00001);
		assertEquals(4,myIsosRightTri.getSideB(),0.00001);
		assertEquals(Math.sqrt(32),myIsosRightTri.getSideC(),0.01);
		
	}

}

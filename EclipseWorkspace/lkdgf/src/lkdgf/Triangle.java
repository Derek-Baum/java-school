package lkdgf;

//A triangle Class represents a triangle with 3 sides stored as sideA,sideB,and sideC
public class Triangle {
	
	private double sideA;
	private double sideB;
	private double sideC;
	
	
	//Default Constructor
	public Triangle(){
		sideA = sideB = sideC = 1;
	}
	//Assignment Constructor
	public Triangle(double a, double b, double c){
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	//returns sideA
	public double getSideA(){
		return sideA;
	}
	//returns sideB
	public double getSideB(){
		return sideB;
	}
	//returns sideC
	public double getSideC(){
		return sideC;
	}
	//returns the Perimeter of the triangle
	public double getPerimeter(){
		return sideA + sideB + sideC;
	}
	//returns the area of the triangle
	public double getArea(){
		double s = (sideA + sideB + sideC)/2;
		
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}
	//returns a new Triangle that is right and isosceles using the given side
	public static Triangle makeIsosRightTri(double side){
		
		double hyp = Math.sqrt(2 * (side * side));
		
		return new Triangle(side,side,hyp);
	}
	

}

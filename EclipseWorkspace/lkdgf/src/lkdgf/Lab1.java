package lkdgf;

import java.util.Random;

public class Lab1 {
	
	public static void main(String... args){	

		double a,b,c;
		a = 5.5;
		b = 3.4;
		c = 8.7;
		System.out.println("The triangle with sides " + a + ", " + b + ", and " + c 
				+ " makes a scalene triangle with area " + areaScalene(a,b,c));
		
		
		
		System.out.println("Simulating the average of 100,000 rolls: " + simulate(100000));
		
	}

//	This will return the area of the scalene triangle formed by sides of length a,b and c.
	public static double areaScalene(double a,double b, double c){
		
		double semi = (a+b+c)/2;
		
		return Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
	}
	public static int increaseLevel(int numRounds, int numPoints){
		
		if(numRounds < 5){
			if(numPoints < 10){
				return 0;
			}else if(numPoints < 21){
				return 1;
			}else{
				return 2;
			}
		}else{
			if(numPoints < 6){
				return 0;
			}else{
				return 1;
			}
		}
	}
	// a is 65  b is 53
	public static boolean shareDigit(int a, int b){
		int a2 = a%10;
		int b2 = b%10;
		a/= ((b/=10)-b + 10); //I did this for fun please dont take points off
		
		return (a == b || a == b2 || a2 == b || a2 == b2);
	}
	public static int closestFactorToSqrt(int a){
		int output = (int)Math.sqrt(a) + 1;
		
		while(a % --output != 0){} //Isn't this cool
		
		return output;
	}
	/**
	* Scoring rule for a simple dice game.
	* 3 of a kind – score 25
	* 2 of a kind – add the dice
	* otherwise score is the largest die roll
	*/
	public static int score(int d1, int d2, int d3) {
	 
		if (d1 == d2 && d2 == d3) {
			return 25;
		} else if (d1 == d2 || d2 == d3 || d1 == d3) {
			return d1 + d2 + d3;
		} else {
			return Math.max(Math.max(d1, d2), d3);
		}
		
	}
	
	public static int scoreTurn(){
		Random r = new Random();
		int d1 = r.nextInt(6) + 1;
		int d2 = r.nextInt(6) + 1;
		int d3 = r.nextInt(6) + 1;
		
		return score(d1,d2,d3);
	}
	public static double simulate(int rolls){
		int sum = 0;
		for(int i = 0;i < rolls;i++){
			sum+=scoreTurn();
		}
		
		return sum/(double)rolls;
	}


}
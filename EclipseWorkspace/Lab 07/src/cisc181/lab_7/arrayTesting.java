package cisc181.lab_7;

import java.util.Arrays;

public class arrayTesting {
	
	public static void main(String[] args){
		
		int[][] output = new int[3][0];
		
		
		int[] tester1 = new int[10];
		int[] tester2 = new int[12];
		int[] tester3 = new int[4];
		
		output[0] = tester1;
		output[1] = tester2;
		output[2] = tester3;
		
		System.out.println(Arrays.deepToString(output));
	}

}

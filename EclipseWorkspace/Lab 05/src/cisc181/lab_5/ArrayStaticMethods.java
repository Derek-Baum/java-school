package cisc181.lab_5;

import java.util.Arrays;

public class ArrayStaticMethods {
	/**
	 * Loop through data, sum, sum/length = mean
	 * @param data
	 * @return the mean of all values within data
	 */
	public static double mean(double[] data){
		double sum = 0;
		for(double x : data)
			sum += x;
		return sum/data.length;
	}
	/**
	 * Loop through array and count all 'm' or 'M'
	 * @param data
	 * @return the count of 'm' and 'M'
	 */
	public static int countM(char[] data){
		int output = 0;
		for(char c : data){
			if(c == 'm' || c == 'M')
				output++;
		}
		return output;
	}
	/**
	 * Loop through values, if current element is value1, set array
	 * at current position to value2
	 * @param values
	 * @param value1
	 * @param value2
	 * @return values where all instances of value1 is replaced with value2
	 */
	public static int[] replace(int[] values, int value1, int value2){
		int[] output = new int[values.length];
		
		for(int i = 0; i < values.length;i++){
			if(values[i] == value1)
				output[i] = value2;
			else
				output[i] = values[i];
		}
		
		return output;
	}
	/**Loop through data, count Zeros.
	 * Create an output array of same size as data
	 * For loop through data again:
	 *    - If i < zero count, set output[i] to 0.
	 *    - Otherwise, set output[i] to next nonzero value from data.
	 * 
	 * @param data
	 * @return Data in which all zero values have been moved to the front of the array.	
	 */
	public static int[] padZeros(int[] data){
		int[] output = new int[data.length];
		int count = 0;
		for(int x : data)
			if(x == 0)
				count++;
		int j = 0;
		for(int i = 0;i < data.length;i++){
			if(i < count){
				output[i] = 0;
			}else{
				while(data[j] == 0){
					j++;
				}
				output[i] = data[j];
				j++;	
			}
		}
		return output;
		
		
	}
}

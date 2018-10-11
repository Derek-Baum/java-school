package testet;

import java.util.Arrays;

public class Book {
	
	private int x,y,z;
	
	public Book(){
		x=10;
		y=20;
		z=30;
	}
	public String toString(){
		return "" + x + " " + y + " " + z;
	}

	
	public static void main(String[] args){
		int[] a = {1,2,3};
		int[] b = a;
		
		a[0] = 5;
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(b));
		
		
		
		
	}
}

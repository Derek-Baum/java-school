package lkdgf;

public class testtest {
	public static void m(int number, int[] numbers){
		number = 2;
		numbers[number] = 30;
	}
	public static void main(String[] args){
		int x = 4;
		int[] y = {0,1,2,3,4,5};
		
		m(x,y);
		
		for(int value : y){
			System.out.println(value + ", ");
		}
	}

}

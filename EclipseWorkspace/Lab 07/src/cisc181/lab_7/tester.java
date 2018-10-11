package cisc181.lab_7;

import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class tester{
	
	public static void main(String[] args){
		List<Integer> test1 = new ArrayList<Integer>();
		test1.add(5);
		test1.add(6);
		test1.add(7);
		
		map(test1, i -> (int)i * 6);
		
		
		
		for(int i = 0; i < test1.size(); i++){
			System.out.print(test1.get(i) + ", ");
		}
	}
	
	public static <T> void map(List<T> list, I myMethodsInterface){
		for(int i = 0; i < list.size();i++){
			list.set(i,(T) myMethodsInterface.myMethod(list.get(i)));
		}
	}
}
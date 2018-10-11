package lkdgf;

public class DogRunner {
    public static void main(String[] args){

        Dog d = new Dog();

        Dog d2 = new Dog("black",10);

        System.out.println(d);
        System.out.println(d2);
        
        System.out.print(RandomMethod());

    }
    public static int RandomMethod(){
    	return 0;
    }
}
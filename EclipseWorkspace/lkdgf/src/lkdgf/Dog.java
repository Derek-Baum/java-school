package lkdgf;

public class Dog extends Animal {

    int height,feet;
    
    public Dog(){
    	super.color = "white"; 
        height = 0;
        feet = 4;
    }
    
    public Dog(String color,int height){
    	super.color = color;
        this.height = height;
    }
    public String getColor(){
        return super.color;
    }
    public int getHeight(){
        return this.height;
    }

    public String toString(){
        return "this is a " + getColor() + " dog that is " + getHeight() + " feet tall.";
    }
    
    public static void main(String[] args){
    	Dog d = new Dog();
    	System.out.println(d instanceof Dog);
    }


}

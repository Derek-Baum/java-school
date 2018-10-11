

public class Horse extends Pet{
	

    Horse(String name, String furColor, int age){
    	super(name,furColor,age);
    }

    public void eat(){
        System.out.println("hay");
    }

    public void speak(){
        System.out.println("neigh");
    }

    public void play() {
        gallop();
        jump();
        gallop();
    }

    public void gallop(){
        System.out.println("Clippity Clop");
    }

    public void jump() {
        System.out.println("jump");
    }

    public void setFriend(Monkey friend){
        super.setFriend(friend);
    }

}

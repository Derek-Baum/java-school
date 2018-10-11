public class Monkey extends Pet{

    Monkey(String name, String furColor, int age){
        super(name,furColor,age);
    }

    public void eat(){
        System.out.println("banana");
    }

    public void speak(){
        System.out.println("eeh eeh");
    }

    public void play() {
        climbUp();
        System.out.println("swing from trees");
        climbDown();
    }

    public void climbUp(){
        System.out.println("In Tree");
    }

    public void climbDown(){
        System.out.println("On Ground");
    }

    public void setFriend(Horse friend){
        super.setFriend(friend);
    }
}


public abstract class Pet {

	private String name;
	private int age;
	private String furColor;
	private Pet friend;

	public Pet(String name, String furColor, int age) {
		this.name = name;
		this.age = age;
		this.furColor = furColor;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void sleep() {
		System.out.println("zzz");
	}

	public String getFurColor() {
		return furColor;
	}

	public Pet getFriend() {
		return friend;
	}

	public void setFriend(Pet p) {
		this.friend = p;
	}

	public void birthday() {
		age++;
		System.out.println("Happy Birthday!" + name);
	}

}

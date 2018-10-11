
public enum RiotStstic {

	ABYSSAL(imgPath, id,  price),
	SOME_ITEM(imgPath, id, price);
	
	private File imgPath;
	private int id;
	private int price;
	
	private RiotStstic(File imgPath, int id, int price){
		this.id = id;
		
	}
}
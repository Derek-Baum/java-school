
public class Knight2 extends Character{

	
	public Knight2(){
		super();
	}
	public Knight2(String nm, int hp,int dmgMod, boolean isAI){
		super(nm,hp,dmgMod,isAI);
	}
	
	@Override
	public int specialOne() {
		return 0;
	}

	@Override
	public int specialTwo() {
		return 0;
	}
	//you can override methods like heavyattack etc depending on the class.
	

}

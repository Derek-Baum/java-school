
public abstract class Character {
	
	private int health;
	private String name;
	private int damageModifier;
	private boolean isComputer;
	
	public Character(){
		name = "Default";
		health = 20;
		damageModifier = 1;
		isComputer = true;
	}
	public Character(String name, int health,int damageModifier, boolean isComputer){
		this.health = health;
		this.name = name;
		this.damageModifier = damageModifier;
		this.isComputer = isComputer;
	}
	
	public abstract int specialOne();
	public abstract int specialTwo();
	
	public int heavyAttack()
	{
		int damage = (int) (Math.random()*6+(2+damageModifier));
		int critChance = (int) (Math.random()*12);
		int crit = (int) (Math.random()*2+4);
		int missChance = (int) (Math.random()*15);
		if(missChance==1)
		{
			damage=0;
		}
		if(critChance==6)
		{
			damage+=crit;
		}
		return damage;
	}
	public int lightAttack()
	{
		int damage = (int) (Math.random()*3+damageModifier);
		int critChance = (int) (Math.random()*12);
		int crit = (int) (Math.random()*2+4);
		int missChance = (int) (Math.random()*15);
		if(missChance==1)
		{
			damage=0;
		}
		if(critChance==6)
		{
			damage+=crit;
		}
		return damage;
	}

}

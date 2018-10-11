
public class Knight 
{

	private String name;
	private int health;
	private int damagemodifier;
	
	
	// 0: lightAttack, 1; heavy attack, 2: special1, 3: special2
	private int attack;
	public Knight()
	{
		name = "Ser Dagget";
		health = 30;
		damagemodifier=1;
		attack = 0;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public int lightAttack()
	{
		int damage = (int) (Math.random()*3+damagemodifier);
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
	public int getAttack(){
		return attack;
	}
	public void setAttack(int a){
		attack = a;
	}
	
	public int heavyAttack()
	{
		int damage = (int) (Math.random()*6+(2+damagemodifier));
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
	
	public boolean parry(AI comp)
	{
		if(comp.Choice==comp.heavyAttack())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean block(AI comp)
	{
		if(comp.Choice==comp.lightAttack())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void ifParry()
	{
		if(parry()==true)
		{
			lightAttack();
		}
	}
	
	
}

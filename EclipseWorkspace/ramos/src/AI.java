
public class AI 
{
	
	private int health, currentHP;
	
	// 0: lightAttack, 1; heavy attack, 2: special1, 3: special2
	private int attack;
	
	public AI()
	{
		health = 20;
		currentHP = 20;
		attack = (int)(Math.random()*4);
	}
	
	public int getAttack(){
		return attack;
	}
	public void setRandomAttack(int a){
		attack = (int)(Math.random()*4);
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getCurrentHP(){
		return currentHP;
	}
	public void changeHP(int damage){
		currentHP-=damage;
	}
	
	public boolean fight(Knight player){
		
		
		return false;
	}
	
	
	public int lightAttack()
	{
		int damage = (int) (Math.random()*3);
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
	
	public int heavyAttack()
	{
		int damage = (int) (Math.random()*6+(2));
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
	
	public boolean parry()
	{
		if(playerChoice==heavyAttack)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean block()
	{
		if(playerChoice==LightAttack)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

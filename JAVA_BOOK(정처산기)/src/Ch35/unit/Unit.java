package Ch35.unit;


public abstract class Unit {

	public int hp;
	public int amor;
	public String type;
	
	public abstract void move();
	public abstract void underAttack(int damage);
	
}

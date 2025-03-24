package Ch35.unit;

public class Medic extends Unit {

	private int HealingPoint;
	
	public Medic() {
		hp=100;
		amor=100;
	}
	void setType(String type) {
		this.type = type;
	}
	public void Healing(Unit unit) {
		unit.hp+=HealingPoint;
		System.out.println(unit.type + " 을 회복시킵니다" + unit.type + "체력 : " + unit.hp);
		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void underAttack(int damage) {
		
	}
}

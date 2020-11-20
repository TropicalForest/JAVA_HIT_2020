package BTL;

public abstract class Monster {
	private int HP = 400;
	private int MP = 240;
	private int armor = 0; 
	private int basicAttack = 20;
	private String elemental;
	private String status = "alive";	
	
	public void getDamage(int dmgTaken) {
		this.HP-= dmgTaken;
	}
	public void Attack(Monster beAttacked) {
		beAttacked.HP -= 20; 
	}; 
	public void recoverMP() {
		this.MP+=20;
	}; 
	public void dead() {
		this.HP = 0;
	}
	
	
	public abstract void useSkill1(); 
	public abstract void useSkill2();
	public abstract void useUltimate();
}

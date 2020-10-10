package Guns;

public class RunMain {
	public static void main(String[] args) {
		Guns tank1 = new Guns("tank 1", 130);
		Guns tank2 = new Guns("tank 2", 180);
		while(tank1.getAmmoNumber()!=0 && tank2.getAmmoNumber()!=0) {
			tank1.Load(10);
			tank1.Shoot(12);
			tank2.Load(8);
			tank2.Shoot(16);
		}
		if(tank1.getAmmoNumber()==0 && tank2.getAmmoNumber()==0) {
			System.out.println("tie");
		}
		else if(tank1.getAmmoNumber()==0){
			System.out.println(tank1.getWeaponName() + " lose");
		}
		else
			System.out.println(tank2.getWeaponName() + " lose");
	}
}

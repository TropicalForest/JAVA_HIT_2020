package Guns;

public class Guns {
	private String weaponName;
	private int ammoNumber;
	
	public void Load(int x) {
		this.ammoNumber+=x;
	}
	
	public void Shoot(int x) {
		if((this.ammoNumber-x)>=0) {
			this.ammoNumber-=x;
		}
		else if((this.ammoNumber-x)<=0 && this.ammoNumber>0) {
			this.ammoNumber=0;
		}
		else{
			System.out.println("Out of ammo");
		}
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getAmmoNumber() {
		return ammoNumber;
	}

	public void setAmmoNumber(int ammoNumber) {
		this.ammoNumber = ammoNumber;
	}

	public Guns(String weaponName, int ammoNumber) {
		this.weaponName = weaponName;
		this.ammoNumber = ammoNumber;
	}
	public Guns() {
	}
	
	
}

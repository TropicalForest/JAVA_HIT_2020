package Dog;

public class Dog {
	private String name;
	private int MP = 120;
	
	public void InputName(String name) {
		this.name = name;
	}
	public void showMP() {
		System.out.println( "MP con lai la : " + MP);
	}
	public void Bark() {
		System.out.println(this.name + " dang sua gau gau !" );
		this.MP-=20;
	}
}

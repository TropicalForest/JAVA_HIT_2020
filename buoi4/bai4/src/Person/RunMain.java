package Person;


public class RunMain {
	public static void main(String[] args) {
		
		Person[] x = new Person[1];
		for(int i = 0; i <x.length; i++) {
			x[i] = new Person();
			System.out.println("Nhap info sinh vien thu " + (i+1) +" : ");
			x[i].InputInfo();
		}
		for(int i = 0; i <x.length; i++) {
			x[i].show();
		}
	}
}

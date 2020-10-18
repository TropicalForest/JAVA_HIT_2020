package Person;

import java.util.Scanner;

public class Hobby {
	private String ngay;
	private String dem;
	
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public String getDem() {
		return dem;
	}
	public void setDem(String dem) {
		this.dem = dem;
	}
	public Hobby(String ngay, String dem) {
		super();
		this.ngay = ngay;
		this.dem = dem;
	}
	public Hobby() {
		super();
	}
	public void InputHobby() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so thich ban ngay: " );
		this.ngay = scan.nextLine();
		System.out.print("Nhap so thich ban dem:" );
		this.dem = scan.nextLine();
	}	
	
	public void ShowHobby() {
		System.out.print("So thich ban ngay: " + this.ngay );
		System.out.print(" - So thich ban dem: " + this.dem + " - ");
	}
	
}

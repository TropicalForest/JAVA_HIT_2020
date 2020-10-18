package Bai4;

import java.util.Scanner;

public class May {
	static Scanner scan = new Scanner(System.in);
	private String maMay;
	private String kieuMay;
	private String tinhTrang;
	
	public May() {
	}
	
	public void nhap() {
		System.out.print("Nhap ma may: ");
		maMay = scan.nextLine();
		System.out.print("Nhap kieu may: ");
		kieuMay = scan.nextLine();
		System.out.print("Nhap tinh trang: ");
		tinhTrang = scan.nextLine();
	}
	
	public void xuat() {
		System.out.println("\tmaMay=" + maMay + ", kieuMay=" + kieuMay + ", tinhTrang=" + tinhTrang);
	}
	
	@Override
	public String toString() {
		return "May [maMay=" + maMay + ", kieuMay=" + kieuMay + ", tinhTrang=" + tinhTrang + "]";
	}


	
	
}

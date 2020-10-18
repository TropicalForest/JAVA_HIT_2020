package Bai4;

import java.util.Scanner;

public class QuanLy {
	static Scanner scan = new Scanner(System.in);
	private String maQL;
	private String hoTen;
	
	public void nhap() {
		System.out.print("Nhap ma quan ly: ");
		maQL = scan.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = scan.nextLine();
	}

	public void xuat() {
		System.out.print("\tMaQL=" + maQL + ", hoTen=" + hoTen);
	}

	@Override
	public String toString() {
		return "maQL=" + maQL + ", hoTen=" + hoTen;
	}

	public QuanLy() {
		super();
	}

	
}

package bai5;

import java.util.Scanner;

public class Student extends Person{
	static Scanner scan = new Scanner(System.in);
	private String msv;
	private String nganh;
	
	public void nhap() {
		System.out.println("------------NHAP THONG TIN SINH VIEN------------");
		super.nhap();
		System.out.print("Nhap so msv: ");
		msv = scan.nextLine();
		System.out.print("Nhap nganh hoc: ");
		nganh = scan.nextLine();
	}
	public void xuat() {
		System.out.println("------------THONG TIN SINH VIEN------------");
		super.xuat();
		System.out.println("So msv: "+msv);
		System.out.println("Nganh hoc: "+nganh);

	}
}

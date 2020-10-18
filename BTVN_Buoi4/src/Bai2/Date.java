package Bai2;

import java.util.Scanner;

public class Date {
	static Scanner scan = new Scanner(System.in);
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		super();
	}

	public void nhap() {
		System.out.print("\tNhap vao ngay: ");
		this.day = scan.nextInt();
		System.out.print("\tNhap vao thang: ");
		this.month = scan.nextInt();
		System.out.print("\tNhap vao nam: ");
		this.year = scan.nextInt();
	}

	public void xuat() {
		System.out.print(", day= " + day + ", month= " + month + ", year= " + year);
	}

	
	
	
}

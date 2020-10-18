package Bai2;

import java.util.Scanner;

public class Date extends NhanSu{
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
	}
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ngay: ");
		day = scan.nextInt();
		System.out.print("Nhap thang: ");
		month = scan.nextInt();
		System.out.print("Nhap nam: ");
		year = scan.nextInt();
	}
	
	public void show() {
		System.out.print("day=" + day + ", month=" + month + ", year=" + year);
	}
	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year ;
	}

	
	
}

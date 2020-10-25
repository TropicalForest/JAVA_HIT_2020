package Bai3;

import java.util.Scanner;

public class DateTime {
	static Scanner scan = new Scanner(System.in);
	private int day;
	private int month;
	private int year;
	
	public void inputDate() {
		System.out.print("Nhap ngay: ");
		day=scan.nextInt();
		System.out.print("Nhap thang: ");
		month=scan.nextInt();
		System.out.print("Nhap nam: ");
		year=scan.nextInt();
	}
	
	public void outputDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
	public DateTime(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public DateTime() {
		super();
	}
	public static Scanner getScan() {
		return scan;
	}
	public static void setScan(Scanner scan) {
		DateTime.scan = scan;
	}
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
	
	
}

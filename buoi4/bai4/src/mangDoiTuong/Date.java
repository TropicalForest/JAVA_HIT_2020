package mangDoiTuong;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	
	
	@Override
	public String toString() {
		return "Date - " + day + " - " + month + " - " + year + "\n";
	}
	
	public void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ngay sinh: ");
		this.day = scan.nextInt();
		System.out.print("Nhap thang sinh: ");
		this.month = scan.nextInt();
		System.out.print("Nhap nam sinh: ");
		this.year = scan.nextInt();
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
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
	}
	
	
}

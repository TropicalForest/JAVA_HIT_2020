package Person;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public void InputDate() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ngay: " );
		this.day = scan.nextInt();
		System.out.print("Nhap thang: " );
		this.month = scan.nextInt();
		System.out.print("Nhap nam: " );
		this.year = scan.nextInt();		
	}
	
	public void showDate() {
		 System.out.println("Day: " + day + " - month: " + month + " - year:" + year + "\n");
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		super();
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

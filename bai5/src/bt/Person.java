package bt;

import java.util.Scanner;

public class Person {
	static Scanner scan = new Scanner(System.in);
	private String hoTen;
	private int date;
	private String queQuan;
	
	public void nhap() {
		System.out.print("Nhap ho ten: ");
		hoTen = scan.nextLine();
		System.out.print("Nhap ngay sinh: ");
		date = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhap que quan: ");
		queQuan = scan.nextLine();
	}
	public void xuat() {
		System.out.println("Nhap ho ten: "+hoTen);
		System.out.println("Nhap ngay sinh: "+date);
		System.out.println("Nhap que quan: "+queQuan);

	}
	
	
	public Person(String hoTen, int date, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.date = date;
		this.queQuan = queQuan;
	}
	public Person() {
		super();
	}
	
	
	
}

package bai5;

import java.util.Scanner;

public class Person {
	static Scanner scan = new Scanner(System.in);
	private String name;
	private int CMND;
	private String gt;
	
	public void nhap() {
		System.out.print("Nhap so cmnd: ");
		CMND = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhap so gt: ");
		gt = scan.nextLine();
		System.out.print("Nhap ten: ");
		name = scan.nextLine();
	}
	public void xuat() {
		System.out.println("So cmnd: " + CMND);
		System.out.println("Gt: " + gt);
		System.out.println("Ten: "+name );
	}
	public Person(String name, int cMND, String gt) {
		super();
		this.name = name;
		CMND = cMND;
		this.gt = gt;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCMND() {
		return CMND;
	}
	public void setCMND(int cMND) {
		CMND = cMND;
	}
	public String getGt() {
		return gt;
	}
	public void setGt(String gt) {
		this.gt = gt;
	}
	
	
	
}

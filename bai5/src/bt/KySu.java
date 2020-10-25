package bt;

import java.util.Scanner;

public class KySu extends Person{
	static Scanner scan = new Scanner(System.in);
	private String nganh;
	private int namTN;
	
	public void nhap() {
		super.nhap();
		System.out.print("Nhap nganh: ");
		nganh = scan.nextLine();
		System.out.print("Nhap nam tn: ");
		namTN = scan.nextInt();
		scan.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Nganh: "+nganh);
		System.out.println("Nam tot nghiep: "+namTN);
	}
	public KySu(String hoTen, int date, String queQuan, String nganh, int namTN) {
		super(hoTen, date, queQuan);
		this.nganh = nganh;
		this.namTN = namTN;
	}

	public static Scanner getScan() {
		return scan;
	}
	public static void setScan(Scanner scan) {
		KySu.scan = scan;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public int getNamTN() {
		return namTN;
	}
	public void setNamTN(int namTN) {
		this.namTN = namTN;
	}
	public KySu() {
	}

	
}

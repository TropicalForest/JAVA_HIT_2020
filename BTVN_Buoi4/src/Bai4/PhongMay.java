package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
	static Scanner scan = new Scanner(System.in);
	private String maPhong;
	private String tenPhong;
	private int dienTich;
	private int n;
	private QuanLy x;
	private ArrayList<May> dsMay = new ArrayList<>();
	
	
	public void nhap() {
		System.out.println("---------NHAP THONG TIN PHONG MAY-----------");
		System.out.print("Nhap ma phong: ");
		maPhong = scan.nextLine();
		System.out.print("Nhap ten phong: ");
		tenPhong = scan.nextLine();
		System.out.print("Nhap dien tich phong: ");
		dienTich = scan.nextInt();
		x = new QuanLy();
		x.nhap();
		System.out.print("Nhap so luong may: ");
		n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			May may = new May();
			System.out.println("\nNhap thong tin may "+ (i+1) +": ");
			may.nhap();
			dsMay.add(may);
		}
	}

	@Override
	public String toString() {
		return "PhongMay [maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", dienTich=" + dienTich + "]";
	}
	
	public void xuat() {
		System.out.println("------------THONG TIN PHONG MAY-----------------");
		System.out.print("maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", dienTich=" + dienTich );
		System.out.println("\nThong tin quan ly: ");
		x.xuat();
		for(int i = 0; i < n; ++i) {
			System.out.println("\nThong tin may "+(i+1)+" :");
			dsMay.get(i).xuat();
		}
	}

	public PhongMay() {
		super();
	}
	
	
}

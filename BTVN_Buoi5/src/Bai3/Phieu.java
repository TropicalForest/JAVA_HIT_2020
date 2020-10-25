package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu{
	static Scanner scan = new Scanner(System.in);
	private String maPhieu;
	private String tenPhieu;
	private DateTime a;
	private ArrayList<SanPham> x = new ArrayList<SanPham>();
	private int n;
	
	
	public void inputPhieu() {
		System.out.println("--------------NHAP THONG TIN PHIEU HANG HOA--------------");
		System.out.print("Nhap ma phieu: ");
		maPhieu = scan.nextLine();
		System.out.print("Nhap ten phieu: ");
		tenPhieu = scan.nextLine();
		a = new DateTime();
		System.out.println("Nhap thoi gian nhap: ");
		a.inputDate();
		System.out.print("Nhap so luong san pham: ");
		n = scan.nextInt();
		x = new ArrayList<SanPham>(n);
		for(int i = 0; i < n; ++i) {
			System.out.println("\nNhap thong tin san pham thu "+(i+1)+": ");
			SanPham sp = new SanPham();
			sp.inputSP();
			x.add(sp);
		}
	}
	public void outputPhieu() {
		System.out.println("--------------THONG TIN PHIEU HANG HOA--------------");
		System.out.println("Ma phieu: "+maPhieu);
		System.out.println("Ten phieu: "+tenPhieu);
		System.out.print("Thoi gian nhap: ");
		a.outputDate();
		for(int i = 0; i < n; ++i) {
			int tien;
			System.out.println("\nThong tin san pham thu "+(i+1)+": ");
			x.get(i).outputSP();
			System.out.println("      ------------------------");
			tien = (x.get(i).getSoLuong() * x.get(i).getDonGia());
			System.out.println("\tThanh tien: " + tien + "\n");
		}
	}	
	
	public Phieu(String maPhieu, String tenPhieu, DateTime a, ArrayList<SanPham> x, int n) {
		super();
		this.maPhieu = maPhieu;
		this.tenPhieu = tenPhieu;
		this.a = a;
		this.x = x;
		this.n = n;
	}
	public Phieu() {
		super();
	}
	public static Scanner getScan() {
		return scan;
	}
	public static void setScan(Scanner scan) {
		Phieu.scan = scan;
	}
	public String getMaPhieu() {
		return maPhieu;
	}
	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}
	public String getTenPhieu() {
		return tenPhieu;
	}
	public void setTenPhieu(String tenPhieu) {
		this.tenPhieu = tenPhieu;
	}
	public DateTime getA() {
		return a;
	}
	public void setA(DateTime a) {
		this.a = a;
	}
	public ArrayList<SanPham> getX() {
		return x;
	}
	public void setX(ArrayList<SanPham> x) {
		this.x = x;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}	
}

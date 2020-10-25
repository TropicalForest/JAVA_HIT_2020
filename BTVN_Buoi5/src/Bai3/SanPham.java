package Bai3;

import java.util.Scanner;

public class SanPham {
	static Scanner scan = new Scanner(System.in);
	private String maSP;
	private String tenSP;
	private int soLuong;
	private int donGia;
	
	public void inputSP() {
		System.out.print("Nhap ma san pham: ");
		maSP = scan.nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSP = scan.nextLine();
		System.out.print("Nhap so luong: ");
		soLuong = scan.nextInt();
		System.out.print("Nhap don gia: ");
		donGia = scan.nextInt();
		scan.nextLine();
	}
	public void outputSP() {
		System.out.println("\tMa san pham: "+maSP);
		System.out.println("\tTen san pham: "+tenSP);
		System.out.println("\tSo luong: "+soLuong);
		System.out.println("\tDon gia: "+donGia);
	}
	public static Scanner getScan() {
		return scan;
	}
	public static void setScan(Scanner scan) {
		SanPham.scan = scan;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public SanPham() {
		super();
	}
	
}

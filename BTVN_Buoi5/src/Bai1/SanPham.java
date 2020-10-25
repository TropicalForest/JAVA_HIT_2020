package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
	static Scanner scan = new Scanner(System.in);
	private String maSP;
	private String tenSP;
	private String tenHangSX;
	private int ngayNhap;
	
	
	public void nhap() {
		System.out.print("Nhap ma san pham: ");
		maSP = scan.nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSP = scan.nextLine();
		System.out.print("Nhap ten hang sx: ");
		tenHangSX = scan.nextLine();
		System.out.print("Nhap ngay nhap: ");
		ngayNhap = scan.nextInt();
		scan.nextLine();
	}
	public void xuat() {
		System.out.println("Nhap ma san pham: " + maSP);
		System.out.println("Nhap ten san pham: " + tenSP);
		System.out.println("Nhap ten hang sx: " + tenHangSX);
		System.out.println("Nhap ngay nhap: " + ngayNhap);

	}
	public SanPham(String maSP, String tenSP, String tenHangSX, int ngayNhap) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.tenHangSX = tenHangSX;
		this.ngayNhap = ngayNhap;
	}
	public SanPham() {
		super();
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
	public String getTenHangSX() {
		return tenHangSX;
	}
	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}
	public int getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(int ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
}

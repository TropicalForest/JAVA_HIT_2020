package Bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	public static Scanner scan = new Scanner(System.in);
	private String maSv;
	private String nganh;
	private int khoaHoc;
	
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public int getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(int khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	public SinhVien(String maSv, String nganh, int khoaHoc) {
		super();
		this.maSv = maSv;
		this.nganh = nganh;
		this.khoaHoc = khoaHoc;
	}
	public SinhVien() {
		super();
	}
	
	public void nhap() {
		super.nhap();
		System.out.print("Nhap ma sinh vien: ");
		maSv = scan.nextLine();
		System.out.print("Nhap ma nganh: ");
		nganh = scan.nextLine();
		System.out.print("Nhap khoa hoc: ");
		khoaHoc = scan.nextInt();
		scan.nextLine();
	}
	
	public void xuat() {
		super.xuat();
		System.out.print(", MaSv=" + maSv + ", nganh=" + nganh + ", khoaHoc=" + khoaHoc);
	}
	
}

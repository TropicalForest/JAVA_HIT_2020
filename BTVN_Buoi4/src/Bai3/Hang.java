package Bai3;

import java.util.Scanner;

public class Hang{
	private String maHang;
	private String tenHang;
	private int donGia;
	
	public Hang(String maHang, String tenHang, int donGia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
	}
	
	public Hang() {
	}
	
	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	
	
	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ten hang: ");
		this.tenHang = scan.nextLine();
		System.out.print("Nhap ma hang: ");
		this.maHang = scan.nextLine();
		System.out.print("Nhap don gia: ");
		this.donGia = scan.nextInt();

	}

	public void xuat() {
		System.out.println("MaHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia );
	}

	@Override
	public String toString() {
		return "Hang [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + "]";
	}
	
	
	
	
}

package Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Bai1.Sach;

public class Phieu {
	static Scanner scan = new Scanner(System.in);
	private String maPhieu;
	private ArrayList<Hang> dsHang = new ArrayList<Hang>();
	private int n;
	
	public Phieu(String maPhieu, ArrayList<Hang> dsHang, int n) {
		this.maPhieu = maPhieu;
		this.dsHang = dsHang;
		this.n = n;
	}

	public Phieu() {
	}
	
	public void nhap() {
		System.out.print("Nhap ma phieu: ");
		maPhieu = scan.nextLine();
		System.out.print("Nhap so luong mat hang: ");
		n = scan.nextInt();
		for(int i= 0; i < n; i++) {
			Hang matHang = new Hang();
			System.out.println("\nNhap thong tin mat hang " + (i+1));
			matHang.nhap();
			dsHang.add(matHang);
		}
	}
	public void xuat() {
		int tong = 0;
		System.out.println("-----------THONG TIN PHIEU HANG-----------");
		System.out.println("             Ma phieu: " + maPhieu + "             ");
		for(int i = 0;  i < n; i++) {
			System.out.println("Hang " + (i+1) +": ");
			dsHang.get(i).xuat();
			tong += dsHang.get(i).getDonGia();
		}
		System.out.println("----------------------------------------------");
		System.out.println("Tong tien cua phieu: " + tong);
	}

	public String getMaPhieu() {
		return maPhieu;
	}

	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}

	public ArrayList<Hang> getDsHang() {
		return dsHang;
	}

	public void setDsHang(ArrayList<Hang> dsHang) {
		this.dsHang = dsHang;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	
}

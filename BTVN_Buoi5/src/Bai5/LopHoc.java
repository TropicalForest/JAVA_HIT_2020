package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
	public static Scanner scan = new Scanner(System.in);
	private String maLH;
	private String tenLH;
	private String ngayMo;
	private ArrayList<SinhVien> x;
	private int n;
	private String giaoVien;
	public String getMaLH() {
		return maLH;
	}
	public void setMaLH(String maLH) {
		this.maLH = maLH;
	}
	public String getTenLH() {
		return tenLH;
	}
	public void setTenLH(String tenLH) {
		this.tenLH = tenLH;
	}
	public String getNgayMo() {
		return ngayMo;
	}
	public void setNgayMo(String ngayMo) {
		this.ngayMo = ngayMo;
	}
	public ArrayList<SinhVien> getX() {
		return x;
	}
	public void setX(ArrayList<SinhVien> x) {
		this.x = x;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getGiaoVien() {
		return giaoVien;
	}
	public void setGiaoVien(String giaoVien) {
		this.giaoVien = giaoVien;
	}
	public LopHoc(String maLH, String tenLH, String ngayMo, ArrayList<SinhVien> x, int n, String giaoVien) {
		super();
		this.maLH = maLH;
		this.tenLH = tenLH;
		this.ngayMo = ngayMo;
		this.x = x;
		this.n = n;
		this.giaoVien = giaoVien;
	}
	public LopHoc() {
		super();
	}
	
	public void nhap() {
		System.out.print("\nNhap ma lop: ");
		maLH = scan.nextLine(); 
		System.out.print("Nhap ten lop: ");
		tenLH = scan.nextLine(); 
		System.out.print("Nhap ngay mo lop: ");
		ngayMo = scan.nextLine();
		System.out.print("Nhap ten GV: ");
		giaoVien = scan.nextLine();
		System.out.print("Nhap so luong sinh vien cua lop: ");
		n = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < n; ++i) {
			System.out.println("\nNhap thong tin sinh vien thu "+(i+1)+": ");
			SinhVien svt = new SinhVien();
			svt.nhap();
			x.add(svt);
		}
	}
	public void xuat() {
		System.out.println("\nNhap ma lop: "+maLH);
		System.out.println("Nhap ten lop: "+tenLH);
		System.out.println("Nhap ngay mo lop: "+ngayMo);
		System.out.println("Nhap ten GV: "+giaoVien);
		for(int i = 0; i < n; ++i) {
			System.out.println("Thong tin sinh vien thu "+(i+1)+": ");
			x.get(i).xuat();
		}
	}
	
	public void checkk14() {
		int count = 0;
		for(int i = 0; i < n; ++i) {
			if(x.get(i).getKhoaHoc()==14) {
				count ++;
			}
		}
		System.out.println("\nCo " +count+" nguoi k14");
	}
	public void sortByK() {
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < n; ++j) {
				if(x.get(i).getKhoaHoc() < x.get(j).getKhoaHoc()) {
					SinhVien tmp = x.get(i);
					x.set(i,x.get(j));
					x.set(j, tmp);
				}
			}
		}
	}
}

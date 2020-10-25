package Bai5;

import java.util.Scanner;

public class Nguoi {
	public static Scanner scan = new Scanner(System.in);
	private String hoTen;
	private String ngaySinh;
	private String queQuan;
	
	
	public String getHoten() {
		return hoTen;
	}
	public void setHoten(String hoten) {
		this.hoTen = hoten;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public void xuat() {
		System.out.print("Hoten=" + hoTen + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan);
	}
	public Nguoi() {
		super();
	}
	
	public void nhap() {
		System.out.print("Nhap ho ten: ");
		hoTen = scan.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = scan.nextLine();
		System.out.print("Nhap que quan: ");
		queQuan = scan.nextLine();
	}
	

}

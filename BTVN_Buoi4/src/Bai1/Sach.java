package Bai1;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private String tenSach;
	private String NXB;
	private int soTrang;
	private int giaTien;
	
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}
	public Sach(String maSach, String tenSach, String nXB, int soTrang, int giaTien) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		NXB = nXB;
		this.soTrang = soTrang;
		this.giaTien = giaTien;
	}
	public Sach() {
	}
	
	@SuppressWarnings("resource")
	public void Nhap() {
			Scanner scan = new Scanner(System.in); 
			System.out.print("Nhap vao ten sach: ");
			tenSach = scan.nextLine();
			System.out.print("Nhap vao ma sach: ");
			maSach = scan.nextLine();
			System.out.print("Nhap vao ten NXB: ");
			NXB = scan.nextLine();
			System.out.print("Nhap vao gia tien: ");
			giaTien = scan.nextInt();
			System.out.print("Nhap vao so trang: ");
			soTrang = scan.nextInt();
	}
	@Override
	public String toString() {
		return "maSach=" + maSach + ", tenSach=" + tenSach + ", NXB=" + NXB + ", soTrang=" + soTrang+ ", giaTien=" + giaTien ;
	}
	public void Xuat() {
		System.out.println("maSach=" + maSach + ", tenSach=" + tenSach + ", NXB=" + NXB + ", soTrang=" + soTrang+ ", giaTien=" + giaTien );
	}
	
	
	
	
}
package Bai2;

import java.util.Scanner;

public class NhanSu {
	private String maNhanSu;
	private String hoTen;
	private Date NS;
	
	
	public String getMaNhanSu() {
		return maNhanSu;
	}
	public void setMaNhanSu(String maNhanSu) {
		this.maNhanSu = maNhanSu;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public NhanSu(String maNhanSu, String hoTen, Date nS) {
		this.maNhanSu = maNhanSu;
		this.hoTen = hoTen;
		NS = nS;
	}
	public NhanSu() {
	}
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		Date NS = new Date();
		System.out.print("Nhap ma nhan su: ");
		maNhanSu = scan.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = scan.nextLine();				
		NS.nhap();
	}
	
	public void xuat() {
		System.out.println(NS.toString() + ", maNhanSu=" + maNhanSu + ", hoTen=" + hoTen );
	}

	
	
	
	
}

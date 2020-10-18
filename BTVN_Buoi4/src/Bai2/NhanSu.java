package Bai2;

import java.util.Scanner;

public class NhanSu {
	static 	Scanner scan = new Scanner(System.in);
	private String maNhanSu;
	private String hoTen;
	private Date NS;


	public void nhap() {
		System.out.println("Nhap thong tin nhan su");
		NS = new Date();
		System.out.print("Nhap ma nhan su: ");
		this.maNhanSu = scan.nextLine();
		System.out.print("Nhap ho ten: ");
		this.hoTen = scan.nextLine();
		System.out.println("Nhap ngay, thang, nam sinh:  ");
		NS.nhap(); 
	}

	public void xuat() {
		System.out.println("Thong tin nhan su: ");
		System.out.print("MaNhanSu= " + maNhanSu + ", hoTen= " + hoTen );
		NS.xuat();
	}

	public NhanSu(String maNhanSu, String hoTen, Date nS) {
		super();
		this.maNhanSu = maNhanSu;
		this.hoTen = hoTen;
		NS = nS;
	}

	public NhanSu() {
		super();
	}
	
	
	


	
	
	
	
}
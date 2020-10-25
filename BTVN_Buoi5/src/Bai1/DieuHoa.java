package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
	static Scanner scan = new Scanner(System.in);
	private int congSuat;
	private int giaBan;
	
	
	public void nhap() {
		super.nhap();
		System.out.print("Nhap vao gia ban: ");
		giaBan = scan.nextInt();
		System.out.print("Nhap vao cong suat: ");
		congSuat = scan.nextInt();
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("cong suat: "+congSuat);
		System.out.println("Gia ban: "+ giaBan +"VND");
	}

	public DieuHoa(String maSP, String tenSP, String tenHangSX, int ngayNhap, int congSuat, int giaBan) {
		super(maSP, tenSP, tenHangSX, ngayNhap);
		this.congSuat = congSuat;
		this.giaBan = giaBan;
	}

	public DieuHoa(String maSP, String tenSP, String tenHangSX, int ngayNhap) {
		super(maSP, tenSP, tenHangSX, ngayNhap);
	}

	public static Scanner getScan() {
		return scan;
	}

	public static void setScan(Scanner scan) {
		DieuHoa.scan = scan;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public DieuHoa() {
	}
	
	
	
}

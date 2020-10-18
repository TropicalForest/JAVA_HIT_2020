package mangDoiTuong;

import java.util.Scanner;

public class SinhVien {

	private String maSinhVien;
	private String hoTen;
	private Date ngaySinh;
	
	
	public SinhVien(String maSinhVien, String hoTen, Date ngaySinh) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	public SinhVien() {
	}
	

	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void HienThi() {
		System.out.print("Tên là: " + hoTen);
		System.out.println(", Mã SV : " + maSinhVien);
		ngaySinh = new Date();
		System.out.println(ngaySinh.toString());;
	}
	public void HienThi(int stt) {
		System.out.println("stt: "+ stt + " ");
		System.out.print("Tên là: " + hoTen);
		System.out.print(", Mã SV : " + maSinhVien);
		ngaySinh = new Date();
		System.out.print(" "+ ngaySinh.toString() );;
	}	

	public void InputInfor() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ma sv: ");
		this.maSinhVien = scan.nextLine();
		System.out.print("Nhap ho ten: ");
		this.hoTen = scan.nextLine();
		System.out.println("Nhap thong tin ngay sinh: ");
		ngaySinh = new Date();
		ngaySinh.Input();
		
	}
	
}

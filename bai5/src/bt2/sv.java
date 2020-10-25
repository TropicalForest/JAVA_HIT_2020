package bt2;

public class sv extends person{
	private String maSinhVien;
	private String hoTen;
	
	public sv(String maSinhVien, String hoTen) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
	}
	public sv() {
	}
	@Override
	public void xuat() {
		System.out.println("sv");
	}
//	@Override
//	public String toString() {
//		return "sv [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + "]";
//	}
//	
	
}

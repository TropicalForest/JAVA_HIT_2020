package HangHoa;

public class HangHoa {
	private String maHang;
	private String tenHang;
	private int donGia;
	private int soLuong;
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
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public HangHoa(String maHang, String tenHang, int donGia, int soLuong) {
		
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	public HangHoa() {
	}
	public void Xuat() {
		System.out.println("Ma hang: " + this.maHang);
		System.out.println("Ten Hang: " + this.tenHang);
		System.out.println("So luong: " + this.soLuong);
		System.out.println("Don gia: " + this.donGia);
		System.out.println("----------------");
		System.out.println("Thanh tien: " + (soLuong*donGia) + "VND");
		System.out.println("_________________________________");
	}
	
	
	
	
}

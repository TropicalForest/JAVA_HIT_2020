package b1;

public class SinhVien {
	private String maSinhVien;
	private String name;
	private String address;

	public SinhVien() {
		System.out.println("Your object has been created !");
	}	
	public SinhVien(String maSinhVien, String name, String address) {
		System.out.println("Your object has been created !");
		this.maSinhVien = maSinhVien;
		this.name = name;
		this.address = address;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showInfo() {
		System.out.println(address);
		System.out.println(name);
		System.out.println(maSinhVien);
	}
	


		
	
}

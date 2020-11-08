package dahinh;

public class RunMain {
	public static void main(String[] args) {
		Nguoi nguoi = new CongNhan();
		nguoi.DiaChi();
		nguoi = new SinhVien();
		nguoi.DiaChi();
	}
}

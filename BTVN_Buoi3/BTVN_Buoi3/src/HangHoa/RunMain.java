package HangHoa;

public class RunMain {
	public static void main(String[] args) {
		HangHoa miHaoHao = new HangHoa("6329", "Hao hao", 3000, 100);
		HangHoa miOmachi = new HangHoa();
		
		miOmachi.setTenHang("Omachi");
		miOmachi.setSoLuong(20);
		miOmachi.setMaHang("MH370");
		miOmachi.setDonGia(4000);
		
		miHaoHao.Xuat();
		miOmachi.Xuat();
	}
}

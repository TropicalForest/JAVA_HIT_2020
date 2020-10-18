package mangDoiTuong;

public class RunMain {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		SinhVien[] arrSV = new SinhVien[2];
		
		for(int i = 0; i <arrSV.length; i++) {
			arrSV[i] = new SinhVien();
			System.out.println("Nhap info sinh vien thu " + (i+1) +" : ");
			arrSV[i].InputInfor();
		}
		
		for(int i = 0; i <arrSV.length; i++) {
			arrSV[i].HienThi(i+1);
		}

	}
}

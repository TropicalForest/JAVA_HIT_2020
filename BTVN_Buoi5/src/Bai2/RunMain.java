package Bai2;

public class RunMain {
	public static void main(String[] args) {
		SoPhuc sp1 = new SoPhuc(2,5);
		SoPhuc sp2 = new SoPhuc(3,7);
		SoPhuc sp3 = new SoPhuc();
		sp3.cong(sp1,sp2);
		System.out.println("(" + sp1.xuat() + ")" + " + " + "(" + sp2.xuat() + ")" + " = " +sp3.xuat() );
		sp3.tru(sp1,sp2);
		System.out.println("(" + sp1.xuat() + ")" + " - " + "(" + sp2.xuat() + ")" + " = " +sp3.xuat() );
	}
}

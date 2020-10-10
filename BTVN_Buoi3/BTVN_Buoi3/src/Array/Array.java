package Array;

import java.util.Scanner;

public class Array {
	Scanner scan = new Scanner(System.in);
	private int[] arr ;
	private int n;
	
	public void InputData() {
		System.out.print("Nhap so luong phan tu mang: ");
		n = scan.nextInt();
		arr = new int[n];
		for(int i = 0; i < this.n; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i] = scan.nextInt();
		}
	}
	public void Show() {	
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	public int Sum() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public Array() {
	}
	
	public Array(int[] arr, int n) {
		this.arr = arr;
		this.n = n;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
}

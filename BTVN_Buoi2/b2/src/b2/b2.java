package b2;

import java.util.Scanner;

public class b2 {
	static Scanner scan = new Scanner(System.in);
	static void nhap(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("a["+i+"] = ");
			arr[i] = scan.nextInt();
		}
	}
	static void sort(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					arr[i] *= arr[j];
					arr[j] = arr[i]/arr[j];
					arr[i] /= arr[j];
				}
			}
		}
	}	

	public static void main(String[] args) {
		int n;
		System.out.print("Enter number of elements :");
		n = scan.nextInt();
		int arr[] = new int[n] ;
		nhap(arr);
		sort(arr);
		System.out.println("Your array has been sorted! ");
		System.out.println("Min of array = " + arr[0]);
		System.out.println("Max of array = " + arr[arr.length-1]);
		
	}
}

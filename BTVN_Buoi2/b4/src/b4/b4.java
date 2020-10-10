package b4;

import java.util.Scanner;

public class b4 {
	static Scanner scan = new Scanner(System.in);
	
	
	static void set(Integer []arr) {
		for(int i = 0; i < arr.length; ++i) {
			System.out.print("a["+i+"] = ");
			arr[i] = scan.nextInt();
		}
	}
	
	static boolean isPrime(Integer n) {
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return (n>=2);
	}
	
	static int[] prime(Integer []arr) {
		int length = arr.length;
		int prime[] = new int[length];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			while(isPrime(j)) {
				prime[j] = arr[i];
				j++;					
			}
		}	
		return prime;
	}
	
	public static void main(String[] args) {
		Integer n, S = 0;
		System.out.print("Enter a number of array elements: ");
		n = scan.nextInt();
		Integer arr[] = new Integer[n];
		set(arr);
		int prime[] = new int[n];
		prime = prime(arr);
		
		for(int i = 0; i < arr.length; ++i) {
			S+= (isPrime(arr[i]) ? (arr[i] + prime[i] - i) : arr[i] );
		}
		System.out.println("S = " + S);
	}
}

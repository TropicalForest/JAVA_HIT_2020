package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		List<News> listNews = new ArrayList<>();
		int n = 0;
		while(n!=4) {
			System.out.println("1. Insert news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			System.out.println("------------------------------------------------------");
			System.out.print("Nhap vao lua chon: ");
			n = scan.nextInt();
			scan.nextLine();
			switch (n) {
				case 1:
					String title;
					String publishDate;
					String author;
					String content;
					int[] rateList = new int[3];
					News tmpNews = new News();
					System.out.print("Nhap vao title: " );
					title = scan.nextLine();
					tmpNews.setTitle(title);
					
					System.out.print("Nhap vao publishDate: " );
					publishDate = scan.nextLine();
					tmpNews.setPublishDate(publishDate);
					
					System.out.print("Nhap vao author: " );
					author = scan.nextLine();
					tmpNews.setAuthor(author);
					
					System.out.print("Nhap vao content: " );
					content = scan.nextLine();
					tmpNews.setContent(content);
					
					System.out.print("Nhap vao danh gia 1: ");
					rateList[0] = scan.nextInt();
					scan.nextLine();
					
					System.out.print("Nhap vao danh gia 2: ");
					rateList[1] = scan.nextInt();
					scan.nextLine();
					
					System.out.print("Nhap vao danh gia 3: ");
					rateList[2] = scan.nextInt();
					scan.nextLine();
					
					tmpNews.setRateList(rateList);
					listNews.add(tmpNews);
					System.out.println("------------------------------------------------------");
					break;
				case 2:
					System.out.println("Thong tin cac tin tuc:");
					for(int i = 0; i < listNews.size(); ++i) {
						System.out.println("Tin tuc "+(i+1)+": ");
						listNews.get(i).display();
						System.out.println();
					}
					System.out.println("------------------------------------------------------");
					break;
				case 3:
					System.out.println("Thong tin cac tin tuc:");
					for(int i = 0; i < listNews.size(); ++i) {
						System.out.println("Tin tuc "+(i+1)+": ");
						listNews.get(i).Calculate();
						System.out.println("Danh gia: " + listNews.get(i).getAverageRate() + "*");
						listNews.get(i).display();
						System.out.println();
					}
					System.out.println("------------------------------------------------------");
					break;
				case 4:
					System.out.println("Exting.............");
					return;
				default:
					System.out.println("Oh no, lam gi co lua chon nao nhu nay ?");
					System.out.println("Nhap lai de!");
					break;
			}

					
		}
	}
}

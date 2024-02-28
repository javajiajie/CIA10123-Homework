package hw4;

import java.util.Scanner;

public class HomeWork4 {
	
	public static void main (String[] args) {
		
		int [][] leek = {{ 25, 32, 8, 19, 27 }, 
						 {2500, 800, 500, 1000, 1200 }};
		System.out.println("請輸入金額");
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int money = sc.nextInt();
		for (int i = 0; i < leek.length; i++) {
			for(int j = 0; j < leek[i].length; j++) {
				if (i == 1 && leek[1][j] >= money) {
					System.out.println(leek[0][j] + "\t");
					count++;
				}
			}
		}
		System.out.println("總人數" + count);
	}
	
//	• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//	員工編號:{ 25, 32, 8, 19, 27 }		現金:{2500, 800, 500, 1000, 1200 }
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//
//	(提示:Scanner,二維陣列)

}

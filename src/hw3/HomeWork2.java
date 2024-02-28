package hw3;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] agrs) {
		System.out.println("猜不到猜猜樂");
		
//		double b = sc.nextInt();
//		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int a = (int)(Math.random()*10);
		

		while (true) {
			num = sc.nextInt();
		if ( a == num) {
			System.out.println("猜對囉");
		} else {
			System.out.println("猜錯了，答案是" + a);
			break;
		}
		}

		
	}
	
//	• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

}

//System.out.println("猜不到猜猜樂");
//
////double b = sc.nextInt();
////System.out.println(b);
//
//Scanner sc = new Scanner(System.in);
//int num = 0;
//int a = (int)(Math.random()*10);
//
//
//num = sc.nextInt();
//if ( a == num) {
//	System.out.println("猜對囉");
//} else {
//	System.out.println("猜錯了，答案是" + a);
//}

package hw3;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] agrs) {
		System.out.println("阿文你太迷信了");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num <= 9 && num > 0) {
			for (int i = 0; i <= 49; i++) {
				if (i / 10 != num && i % 10 != num) {
					System.out.print(i + "  ");
				}
			}
		} else {
			System.out.println("輸入錯誤，請輸入1~9的整數");
		}
	}

//	• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//
//	(提示:Scanner)
//	(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

}

//int num[] = new int[49];
//for (int i = 0; i < num.length; i++) {
//	num[i] = i + 1;
//}

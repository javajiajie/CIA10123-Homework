package hw4;

import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("請輸入西元年");
		int yy = sc1.nextInt();
		System.out.println("請輸入月份");
		int mm = sc2.nextInt();
		System.out.println("請輸入日期");
		int dd = sc3.nextInt();

		int[] year1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] year2 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (mm < 1 || mm > 12 || dd < 1 || dd > 31) {
			System.out.println("請輸入正確日期");
		} else {
			boolean leapyear = (yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0);
			
			int[] correctyear = leapyear ? year2 : year1;
			
			int count = 0;
			for (int i = 0 ; i < mm - 1; i++) {
				count += correctyear[i];
			}
			System.out.println("輸入的日期為該年第" + count + "天");
		}
	}

//	• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

}

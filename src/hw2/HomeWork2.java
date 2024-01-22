package hw2;

public class HomeWork2 {

	public static void main (String[] args) {
		
		for (int b = 1; b <= 49; b++) {
			if (b / 10 != 4 && b % 10 != 4) {
			System.out.print(b+"  ");
			}
			}
		System.out.println("==========================================================================");
		
//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	
		for (int c = 10; c >=1; c--) {
			for (int d = 1; d <= c; d++) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
		
		System.out.println("==========================================================================");
		
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
		
		int e = 65;
		for (int f = 1; f <= 6; f++) {
			for (int g = 1; g <= f; g++) {
				char h = (char) e;
				System.out.print(h);
			}
			e++;
			System.out.println();
		}
		
//	• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF	
		
	}
}

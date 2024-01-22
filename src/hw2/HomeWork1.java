package hw2;

public class HomeWork1 {
	
	public static void main(String[] args) {
		int a = 0;
		for (int b = 2; b <= 1000; b += 2)		
		a += b;
		System.out.println("第一題"+a);
		
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		
			int c = 1;
			for (int d = 1; d <= 10; d++)
			c *= d;
			System.out.println("第二題"+c);
		
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
			
			int e = 1;
			int f = 1;
			while (f <= 10) {
				e *= f;
				f++;
			}
			System.out.println("第三題"+e);
			
//			do while test
//			
//			int e = 1;
//			int f = 1;
//			do {
//				e *= f;
//				f++;
//			}
//			while (f <= 10);
//			System.out.println(e);
			
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
			
			int g = 0;
			for (int h = 1; h<=19; h += 2) {
				g +=h;
				System.out.println ("第四題"+g);
				continue;
			}
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
			
			

		
	}
}

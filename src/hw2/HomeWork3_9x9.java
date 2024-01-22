package hw2;

public class HomeWork3_9x9 {

//	• 請建立一個TestNineNine.java程式，可輸出九九乘法表
//	• 一：使用for迴圈 + while迴圈
	public static void main (String[] args) {
		for (int a = 1; a <= 9; a++) {
			int b = 0;
			while (b++ < 9) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
			}
			System.out.println();
		}
		System.out.println("======================================");

//	• 二：使用for迴圈 + do while迴圈
		for (int c = 1; c <= 9; c++) {
			int d = 0;
			do{
				d++;
				System.out.print(c + "*" + d + "=" + c * d + "\t");
			}while (d < 9);
			System.out.println();
		}
		System.out.println("======================================");
	
//	• 三：使用while迴圈 + do while迴圈
		int e = 0;
		while (e < 9) {
			e++;
			int f = 0;
			while (f < 9) {
				f++;
				System.out.print(e + "*" + f + "=" + e * f + "\t");
			}
			System.out.println();
		}
	}	
}

package hw4;

public class HomeWork6 {
	public static void main(String[] args) {
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] upper = new int[6];
		int[] student = new int[8];

		for (int i = 0; i < test.length; i++) {
			int max = 0;
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] > test[i][max]) {
					max = j;
				}
			}

			upper[i] += test[i][max];

			System.out.print("第" + (max + 1) + "同學" + upper[i] + "分" + "\n");

			student[max]++;
		}

		System.out.println("=========================");

		for (int k = 0; k < student.length; k++) {
			System.out.println("座號" + (k + 1) + "有" + student[k] + "次");
		}

//	• 班上有8位同學,他們進行了6次考試結果如下:
//	{ 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
//	{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
//	{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)

	}
}

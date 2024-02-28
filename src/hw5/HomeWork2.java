package hw5;

public class HomeWork2 {
	public void randAvg() {
		int[] sum = new int[10];
		double avg = 0;
		for (int i = 0; i < sum.length; i++) {
			sum[i] = (int) (Math.random() * 100) + 1;
			System.out.print("數字" + sum[i] + "\t");
			avg += sum[i];
		}
		avg /= sum.length;
		System.out.println("平均" + avg);
	}

	public static void main(String[] args) {
		HomeWork2 ans = new HomeWork2();
		ans.randAvg();
	}

//	• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

}

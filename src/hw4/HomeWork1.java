package hw4;

public class HomeWork1 {
	public static void main(String[] args) {
		int inArray[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < inArray.length; i++) {
			sum += inArray[i];
		}
		System.out.println(sum);
		
		double avg = sum / 10;
		for (int i = 0; i < inArray.length; i++) {
			if (inArray[i] > avg) {
				System.out.println(inArray[i]);
			}
		}
	}

//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)

}

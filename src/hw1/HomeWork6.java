package hw1;

public class HomeWork6 {
	
//	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println(5+a);
		char b = '5';
		System.out.println(5+b);
		String c = "5";
		System.out.println(5+c);
	}
//	並請用註解各別說明答案的產生原因
//	5 + 5
	//因為5為整數，所以型別使用int，5與 int的值 加總合為10
//	5 + ‘5’
	//因為5用單引號框起來，所以使用char，並且'5'可以在Unicode Table找到對應數字0020+15等於35，在小算盤中使用程式設計人員計算HEX=5，換算DEC=53，53+5=58
//	5 + “5”
	//因為String為字串，所以5+字串5等於55
}

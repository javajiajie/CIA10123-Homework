package hw1;

public class HomeWork5 {

//	• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢 (用複利計算,公式請自行google)
	
	public static void main(String[] args) {
		double save = 1_500_000, bank = 0.02, y = 10;
		double money =  save * Math.pow(1+bank, y);
		System.out.println(money);			
	}
}

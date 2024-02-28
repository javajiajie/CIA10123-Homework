package hw1;

public class HomeWork3 {

//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	
	public static void main(String[] args){
		int T = 256559;
		int day = 365;
		int hr = 24;
		int min = 60;
		int sec = 60;
		System.out.println(T%sec + "秒");
		T = T%sec;
		System.out.println(T%min + "分");
		T = T%min;
		System.out.println(T%hr + "時");
		T = T%hr;
		System.out.println(T%day + "天");
		T = T%day;
		System.out.println(T + "年");
	}
}


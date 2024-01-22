package hw1;

public class HomeWork3 {

//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	
	public static void main(String[] args){
		double T = 256559;
		double day = 365;
		double hr = 24;
		double min = 60;
		double sec = 60;
		System.out.println(T/day);
		double b = T%day;
		System.out.println(b/hr);
		double c = b%hr;
		System.out.println(c/min);
		double d = c%min;
		System.out.println(d/sec);
		double e = d%sec;
		System.out.println(e);
	}
}

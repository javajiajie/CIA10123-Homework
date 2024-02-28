package hw4;

public class HomeWork3 {
	public static void main(String[] agrs) {
		String [] s = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int acc = 0;
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				switch (s[i].charAt(j)) {
				case 'a':
					acc++;
					break;
				case 'e':
					acc++;
					break;
				case 'i':
					acc++;
					break;
				case 'o':
					acc++;
					break;
				case 'u':
					acc++;
					break;
				}
			}
		}
		
		System.out.println(acc);
		
	}
	
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)

}

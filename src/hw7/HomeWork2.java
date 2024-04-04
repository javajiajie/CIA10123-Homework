package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class HomeWork2 {
	public static void main(String[] args) {
		try {
			int[] randomNumberArray = new int[10];
			Random ran = new Random();
			String fileconfig = "C:\\Users\\TMP-14\\Downloads\\Data.txt";
			FileOutputStream fos = new FileOutputStream(fileconfig, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			
			for (int i = 0; i < randomNumberArray.length; i++) {
				randomNumberArray[i] = ran.nextInt(1000 + 1);
				ps.print(randomNumberArray[i] + " ");
			}
			ps.println();
			ps.println("第二種蜜糖語法練習============");
			
			for(int ans : randomNumberArray) {
				ps.print(ans + " ");
			}
			
				ps.close();
				bos.close();
				fos.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

//		•請寫一隻程式,能夠亂數產生10個1~1000 的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//		append功能讓每次執行結果都能被保存起來)
}

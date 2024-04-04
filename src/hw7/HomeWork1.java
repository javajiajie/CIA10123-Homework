package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork1 {
	public static void main(String[] args) {
		String fileconfig = "C:\\Users\\TMP-14\\Downloads\\Sample.txt";
		int county = 0;
		int countz = 0;
		
		try {
			String x;
			File fil = new File(fileconfig);
			FileReader fi = new FileReader(fileconfig);
			BufferedReader br = new BufferedReader(fi);
			while((x = br.readLine()) != null) {
				county += x.length();
				countz ++;
			}
			System.out.println("位元組數:" + fil.length() + 
					"\n" + "字元數" + county + 
					"\n" + "資料數" + countz);
			br.close();
			fi.close();
		}catch(IOException e){
			System.out.print(e);
		};
	}

	
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
}

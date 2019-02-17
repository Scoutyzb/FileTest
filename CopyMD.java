package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyMD {
	public static void main(String[] args) {
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		String line= null;
		try {
			bfr = new 
					BufferedReader(new 
							InputStreamReader(new 
									FileInputStream("F:\\BaiduNetdiskDownload\\day24\\day24\\day24_source\\day24± º«.md"),"UTF-8"));
			bfw =  new 
					BufferedWriter(new 
							OutputStreamWriter(new 
									FileOutputStream("F:\\day24± º«.md"),"UTF-8"));
	
			while ((line=bfr.readLine())!=null) {
				bfw.write(line);
				bfw.newLine();
				bfw.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("∏¥÷∆ ß∞‹");
		}finally {
			try{if (bfr!=null)
					bfr.close();
				if (bfw!=null)
					bfw.close();
			}catch(IOException e) {
				e.printStackTrace();
				throw new RuntimeException("πÿ±’ ß∞‹");
			}
		}
	}
}

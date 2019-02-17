package day25;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args)throws IOException{
		FileReader bfr =new FileReader("F:\\BaiduNetdiskDownload\\day25\\day25\\day25_source\\day25±Ê¼Ç.md");
		PrintWriter pw1 = new PrintWriter(new FileWriter("F:\\day.md"),true);
		PrintWriter pw2 = new PrintWriter(new FileWriter("F:\\day2.md"));
		int line1 ;
		int line2 ;
		long a =System.currentTimeMillis();
		while((line1=bfr.read())!=-1) {
			pw1.print((char)line1);
		}
		pw1.close();
		
		long b =System.currentTimeMillis();
		System.out.println("autoflush"+(b-a));
		long c =System.currentTimeMillis();
		while((line2=bfr.read())!=-1) {
			pw2.print((char)line2);
		}
		pw2.close();
		long d =System.currentTimeMillis();
		System.out.println("noautoflush"+(d-c));
		bfr.close();
	}
}

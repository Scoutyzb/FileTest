package day23;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("F:\\BaiduNetdiskDownload\\day23\\day23\\day23_video\\a.txt");
		FileReader fr = new FileReader(file);
		int len=0;
		while((len = fr.read())!= -1) {
			System.out.println((char)len+"="+len);
		}
		fr.close();
	}
}

package day24;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;


public class OutPutStreamWriterDemo {
	public static void main(String[] args) throws IOException{
		BufferedOutputStream bos =
				 new BufferedOutputStream(new FileOutputStream("F:\\BaiduNetdiskDownload\\day23\\day23\\day23_video\\a.txt"));
		bos.close();
	}
} 
 
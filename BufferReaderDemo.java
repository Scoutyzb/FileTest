package day24;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException{
		BufferedWriter bfw = new 
				BufferedWriter(new FileWriter("F:\\BaiduNetdiskDownload\\day24\\day24\\a.txt"));
		bfw.write("i love you baby\r\n");
		bfw.write("do you love me".toCharArray());
		bfw.close();

	}
	
}

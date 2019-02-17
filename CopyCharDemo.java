package day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("F:\\BaiduNetdiskDownload\\day23\\day23\\day23_video\\a.txt");
			fw = new FileWriter("F:\\BaiduNetdiskDownload\\day23\\day23\\b.txt");
			char[] c = new char[1024];
			int len = 0;
			while((len = fr.read(c))!=-1) {
				fw.write(c, 0, len);
			}
			 
		}catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Stopped");
			// TODO: handle exception
		}finally {
			try {
				if (fr!=null)
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(" fr close failed");
			}
			try {
				if (fw!=null)
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(" fw close failed");
			}
			
		}
	}
}

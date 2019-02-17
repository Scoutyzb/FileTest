package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {	
	public static void main(String[] args) {
		File file = new File("F:\\BaiduNetdiskDownload\\day23\\day23\\day23_source\\day23笔记.md");
		byte[] b = new byte[1024];
		FileInputStream  fis = null;				
		FileOutputStream fos = null;
		try {
			fis=	new FileInputStream(file);
			fos=	new FileOutputStream("F:\\BaiduNetdiskDownload\\day23\\day23\\da2笔记.md");
			int len = 0;
			while((len = fis.read(b))!=-1) {
				fos.write(b,0,len);}
		}catch(IOException ex) {
			System.out.println(ex);
			throw new RuntimeException("文件复制失败");
		}finally {
				try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	System.out.println("over");		
	}}
	

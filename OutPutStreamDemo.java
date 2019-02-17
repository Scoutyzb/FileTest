package day23;

import java.io.*;

public class OutPutStreamDemo {
	
	public static void main(String[] args) {
		OutputStream out=null;
		try {
			out = new FileOutputStream("c:\\a.txt");
			out.write(49);
			out.write(48);
			out.write(48);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("222");
			e1.printStackTrace();
	}finally {
		try {
		if(out!=null)
		out.close();
		}catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("close failed");
		}
	}
		
}}

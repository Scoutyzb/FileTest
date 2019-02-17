package day23;
import java.io.*;

public class InPutStreamDemo {
	public static void main(String[] args) {
		InputStream is= null;
		try{
			is=new FileInputStream("D:\\a.txt");
			System.out.println(is.read());
		}catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("False");
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

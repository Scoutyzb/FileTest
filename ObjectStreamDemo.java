package day25;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args)throws IOException  {
		Person p = new Person("zs", 14);
		function(p);
	}
	public static void function(Person p)throws  IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\person.txt"));
		oos.writeObject(p);
		oos.close();
	}
}

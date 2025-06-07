package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable{
	int acc=123456;
	transient int psw =123;
}

public class SerialTransient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Human d1 = new Human();
	
		FileOutputStream fos = new FileOutputStream("hum.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream ios = new FileInputStream("hum.ser");
		ObjectInputStream ois = new ObjectInputStream(ios);
		Human d2 =(Human)ois.readObject();
		System.out.println(d2.acc+"====>"+d2.psw);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	}

}

package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i =10;
	int j=20;
}
public class Serial1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d = new Dog();
		System.out.println("serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("serialization Ended");
		System.out.println("desserialization started");
		FileInputStream ios = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(ios);
		Dog d1 =(Dog)ois.readObject();
		System.out.println(d1.i+d1.j);
		
		
		
		
		
	}

}

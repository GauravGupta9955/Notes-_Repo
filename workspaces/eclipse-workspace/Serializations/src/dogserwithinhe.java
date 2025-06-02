
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.io.IOException;

class Animal1 {
	public static final long serialVersionUID = 1L;
	int k = 10;

	Animal1() {
		System.out.println("No arg Animal constructor");
	}
}

class Dog1 extends Animal1 implements Serializable {
	int l = 20;

	Dog1() {
		System.out.println("No arg Dog constructor");
	}
}

public class dogserwithinhe {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog1 d = new Dog1();
		d.k = 888;
		d.l = 999;
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended");
		System.out.println("******************************");
		System.out.println("DeSerialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d1 = (Dog1) ois.readObject();
		System.out.println(d1.k+ "====> " + d1.l);
		System.out.println("DeSerialization ended");
	}
}

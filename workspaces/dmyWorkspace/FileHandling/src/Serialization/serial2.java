package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable{
	int i =10;
	int j=20;
}
class Cat1 implements Serializable{
	int i =15;
	int j=20;
}
public class serial2 {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
	
	Dog1 d1 = new Dog1();
	Cat1 c1 = new Cat1();
	FileOutputStream fos = new FileOutputStream("xyz.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
	oos.writeObject(c1);
	
	FileInputStream ios = new FileInputStream("xyz.ser");
	ObjectInputStream ois = new ObjectInputStream(ios);
	Dog1 d2 =(Dog1)ois.readObject();
	System.out.println(d2.i+d2.j);
	
	Cat1 c2 = (Cat1)ois.readObject();
	System.out.println(c2.i+c2.j);

}
}

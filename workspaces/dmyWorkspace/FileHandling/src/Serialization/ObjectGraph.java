package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog3 implements Serializable{
	int a =6;
	int b=7;
	int c=9;
}
class Cat3 implements Serializable{
	Dog3 d1 = new Dog3();
}
class Rat3 implements Serializable{
	Cat3 c1 = new Cat3();
}
public class ObjectGraph {
	public static void main(String[] args) throws IOException {
		Rat3 r1 =new Rat3();
		FileOutputStream fos = new FileOutputStream("efg.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(r1);
		
		
		
	}

}

package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog2 implements Serializable{
	int a =6;
	int b=7;
	int c=9;
}
class Cat2 implements Serializable{
	int i =15;
	int j=20;
	int k=30;
}
class Rat1 implements Serializable{
	int i =15;
	int j=20;
	int k=30;
}
public class Serial4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog2 d1 = new Dog2();
		Cat2 c1 = new Cat2();
		Rat1 r1 =new Rat1();
		FileOutputStream fos = new FileOutputStream("efg.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		
		FileInputStream ios = new FileInputStream("efg.ser");
		ObjectInputStream ois = new ObjectInputStream(ios);
		
		Object obj =ois.readObject();
		
		if(obj instanceof Rat1) {
			Rat1 r2 =(Rat1)obj;
			System.out.println("rat"+r2.i+r2.j+r2.k);
		}
		if(obj instanceof Dog2) {
			Dog2 d2 =(Dog2)obj;
			System.out.println("dog"+d2.a+d2.b+d2.c);
		}
		
		if(obj instanceof Cat2) {
			Cat2 c2 =(Cat2)obj;
			System.out.println("cat"+c2.i+c2.j+c2.k);
		}
		
	}

}

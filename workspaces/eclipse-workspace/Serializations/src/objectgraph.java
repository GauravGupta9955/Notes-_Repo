import java.io.*;

class Dog123 implements Serializable{
	
	Cat123 c =new Cat123();
	
}

class Cat123 implements Serializable{
	
	Rat123 r =new Rat123();
}
class Rat123 implements Serializable{
	int i=10;
}
public class objectgraph {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	System.out.println("Serialization Started");
	FileOutputStream fos = new FileOutputStream("Rarr.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	Dog123 d1 = new Dog123();
	oos.writeObject(d1);
	System.out.println("Serialization Ended");
	
	FileInputStream ios = new FileInputStream("C:\\Users\\gauta\\eclipse-workspace\\Serializations\\Rarr.ser");
	ObjectInputStream ioos = new ObjectInputStream(ios);
	
	Dog123 d3 =(Dog123)ioos.readObject();
	
	System.out.println(d3.c.r.i);
	

	
}
}

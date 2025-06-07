import java.io.*;

class Dog implements Serializable{
	int i =10;
	int j=20;
}
public class serial1 {
public static void main(String[] args) throws IOException,ClassNotFoundException {
	Dog d = new Dog();
	System.out.println("Serialization started");
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d);
	System.out.println("Serialization end");
	
	System.out.println("DeSerialization started");
	FileInputStream ios=new FileInputStream("C:\\Users\\gauta\\eclipse-workspace\\Serializations\\abc.ser");
	ObjectInputStream ioos = new ObjectInputStream(ios);
	Dog d1 =(Dog)ioos.readObject();
	System.out.println("Serialization end");
	
	System.out.println(d1.i +"====>"+d1.j);
}
}


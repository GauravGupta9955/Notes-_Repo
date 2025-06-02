import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable
{
	int i =0;
}
class Dog extends Animal{
	int j =20;
}
public class serialWithInheritance {
public static void main(String[] args) throws Exception {
	Dog d = new Dog();
	System.out.println("serialisation started");
	FileOutputStream fos = new FileOutputStream("serwitInhe.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos); 
	oos.writeObject(d);
	
	System.out.println("Serialisation Ended");
	
	FileInputStream inos = new FileInputStream("serwitInhe.ser");
	ObjectInputStream inoos = new ObjectInputStream(inos); 
	Dog da=(Dog)inoos.readObject();
	System.out.println(da.i+"===>"+da.j);
	
	
}
}

import java.io.*;

class Human implements Serializable{
	int account=1234567;
	final transient int psw =87978347;
}
public class serial3 {
public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
	Human h =new Human();
	System.out.println("Serialization Started");
	FileOutputStream fos = new FileOutputStream("Human.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(h);
	System.out.println("Serialization end");
	
	System.out.println("deSerialization Started");
	FileInputStream inos = new FileInputStream("C:\\Users\\gauta\\eclipse-workspace\\Serializations\\Human.ser");
	ObjectInputStream ioos = new ObjectInputStream(inos);
	Human ha =(Human)ioos.readObject();
	System.out.println(ha.account +"====>"+ha.psw);
	
	
}
}

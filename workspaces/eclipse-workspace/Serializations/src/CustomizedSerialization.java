import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Account implements Serializable{
	int account =1234536;
	transient String passw="103435";
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();//all the properties written
		String encPsw="123"+passw;
		oos.writeObject(encPsw);//encrypted Password;
	}
	private void readObject(ObjectInputStream ioos) throws Exception {
		
		 ioos.defaultReadObject();
		 String enpwd =(String)ioos.readObject();//Decreypted Password
		 passw =enpwd.substring(3);
		 
	}
}
public class CustomizedSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Before Serialization");
		Account ac = new Account();
		System.out.println(ac.account);
		System.out.println(ac.passw);
		System.out.println("serialization started");
		FileOutputStream fos = new FileOutputStream("cust.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ac);
		
		FileInputStream ifos = new FileInputStream("cust.ser");
		ObjectInputStream ioos = new ObjectInputStream(ifos);
		Account act =(Account)ioos.readObject();
		
		System.out.println(act.account+"====>"+act.passw);
		
		
	}

}

package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human1 implements Serializable{
	int acc=123456;
	transient String psw ="123";
	
	private void writeobject(ObjectOutputStream oos) throws IOException {
		// TODO Auto-generated method stub
		oos.defaultWriteObject();
		String encrPsw = "abc"+ psw;
		oos.writeObject(encrPsw);
	}
	
	private void readObject(ObjectInputStream ios) throws ClassNotFoundException, IOException {
		ios.defaultReadObject();
		// TODO Auto-generated method stub
		String enPwd = (String) ios.readObject();
		psw=enPwd.substring(3);

	}
}
public class CustomizedSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Human1 d1 = new Human1();
	
		FileOutputStream fos = new FileOutputStream("cust.ser");
		try (ObjectOutputStream ooos = new ObjectOutputStream(fos)) {
			ooos.writeObject(d1);
		}
		FileInputStream ifos = new FileInputStream("cust.ser");
		try (ObjectInputStream ois = new ObjectInputStream(ifos)) {
			Human1 d2 =(Human1)ois.readObject();
			System.out.println(d2.acc+"====>"+d2.psw);
		}
	}

}

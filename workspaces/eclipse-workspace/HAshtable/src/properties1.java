import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class properties1 {
public static void main(String[] args) throws IOException {
	Properties p  =new Properties();
	
	FileInputStream fis = new FileInputStream("database.properties");
	p.load(fis);
	System.out.println(p);
	
	System.out.println();
	System.out.println("URL IS :: "+p.getProperty("url"));
	System.out.println("USERNAME IS :: "+p.getProperty("username"));
	System.out.println("PASSWORD IS :: "+p.getProperty("password"));
	p.setProperty("iNeuron","NavinReddy");//Setting a new property
	FileOutputStream fos = new FileOutputStream("database.properties");
	p.store(fos,"MAP operation got concluded");//Added like a comment
}
}

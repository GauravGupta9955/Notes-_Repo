import java.io.File;
import java.io.IOException;

// Write code to create a file named with rcb.txt present in D://IplTeam
public class DdRIVEfILE {
public static void main(String[] args) throws IOException {
 File f = new File("C:\\Users\\gauta\\eclipse-workspace\\FileIo\\ IPLTeam","abc.txt");
 f.createNewFile();
 System.out.println(f.exists());
}
}

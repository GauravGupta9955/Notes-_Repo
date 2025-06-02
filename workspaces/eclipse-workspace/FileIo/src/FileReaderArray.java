import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderArray {
 public static void main(String[] args) throws IOException {
	 File f = new File("info.txt");
	 FileReader fr=new FileReader( f);
	 char [] ch = new char[1000];
	 fr.read(ch);
	 for(char c:ch) {
	 System.out.print(c);
	 }
	 fr.close();

}
}

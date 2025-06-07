package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filehandl2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("IPLTeam");
		f1.mkdir();
		File f2 = new File(f1,"abc.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
	}

}

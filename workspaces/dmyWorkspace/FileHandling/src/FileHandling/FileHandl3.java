package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandl3 {
public static void main(String[] args) throws IOException {
	File f = new File("F:\\myWorkspace\\FileHandling\\IPLTeam","rcb.txt");
	f.createNewFile();
}
}

import java.io.File;
import java.io.IOException;

/*Write code to create a directory named with IPLteam in 
current working directoryand create a file named with abc.txt in that
directory.*/

public class IplTeamDirectory {
	public static void main(String[] args) throws IOException {
		File f =new File("IPLTeam");
		f.mkdir();
		File e =new File(f,"abc.txt");
		e.createNewFile();
		System.out.println(e.exists());
	}

}

//without sorting song list 
import java.util.*;
import java.io.*;


public class JukeBox {
	
	ArrayList<String> songList = new ArrayList<String>();
	public static void main(String arg[]) {
		new JukeBox().go();
		}
	
	public void go() {
	try {
		File file = new File("/Users/jayashreedas/Documents/CollectionInJava/src/songList");
		BufferedReader reader = new BufferedReader( new FileReader(file));
		String line = null ;
		while((line = reader.readLine()) != null) {
			addSong(line);
		}
		
		System.out.println(" result : "+ songList);			
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		
	}

	
	
	public void addSong(String arg) {
		String[] tokens = arg.split("/");
		songList.add(tokens[0]);
	}
	
}

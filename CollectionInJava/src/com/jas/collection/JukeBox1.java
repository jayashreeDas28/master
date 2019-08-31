

/**
 * Java.util.Collection 
 * public static void copy(List destinationList, List sourceList)
 * public static List emptyList();
 * public static void fill(List listToFill, ObjectToFillWith)
 * public static integer frequency(Collection c , Object)
 * public static void reverse(List list)
 * public static void rotate(List list , int distance)
 * public static void shuffle(List list)
 * public static void sort(List list)
 * 
 *there is a sort method available in Collection Class so we can pass our list to sort 
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

package com.jas.collection;
import java.util.*;
import java.io.*;

public class JukeBox1 {
	
	ArrayList<String> songList = new ArrayList<String>();
	public static void main(String arg[]) throws IOException {
		new JukeBox1().go();
	}
	public void go() throws IOException {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println("  after sorting " + songList);
	}
	
	public void getSongs() throws IOException {
		File file = new File("/Users/jayashreedas/git/master/CollectionInJava/src/songList");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line = null;
		while((line = reader.readLine()) != null) {
			addSong(line);
		}
	}
	
	
	public void addSong(String song) {
		String[] sng = song.split("/");
		songList.add(sng[0]);
	}
	

}

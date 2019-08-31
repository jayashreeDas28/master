package com.jas.userDefinedSong;
import java.io.*;
import java.util.*;
public class JukeBox3 {

	
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String arg[]) {
		new JukeBox3().go();
	}
	public void go() {
		Song s1 = new Song("baby don't","A","abc","efg");
		songList.add(s1);
		System.out.println(songList);
		Collections.sort(null);
	}
	
}

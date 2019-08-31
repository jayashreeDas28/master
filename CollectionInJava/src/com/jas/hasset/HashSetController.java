package com.jas.hasset;

import java.io.*;
import java.util.*;
public class HashSetController {

	public static void main(String arg[]) {
		List<Song1> songList = new ArrayList<Song1>();
		HashSet<Song1> hashSet = new HashSet<Song1>();
		Song1 s1 = new Song1("Alan","bagha","fhhg","er");
		Song1 s2 = new Song1("baby back","bagha","fhhg","er");
		Song1 s3 = new Song1("don't go ","bagha","fhhg","er");
		Song1 s4 = new Song1("forvige","bagha","fhhg","er");
		Song1 s5 = new Song1("forvige","bagha","fhhg","er");
		songList.add(s1);
		songList.add(s2);
		songList.add(s3);
		songList.add(s4);
		songList.add(s5);
		hashSet.addAll(songList);
		System.out.println(hashSet.size());
		
		
		
	}
	
	
}

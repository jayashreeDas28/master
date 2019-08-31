package com.jas.userDefinedSong;
import java.io.*;

/**
 * @author jayashreedas
 */
/****
 * 
 * Collection.sort(List list)
 * which only allows Object implements Comparable interface where compareTo method is being implemented 
 * public static <T extends Comparable<? super T>> void sort(List<T> list);
 * where extends means IS -A relationship
 * 
 * Collection.sort(List list , Comparator<T>());
 * java.util.Comparator interface has compare method 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.*;
public class JukeBox3 {

	
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String arg[]) {
		new JukeBox3().go();
	}
	public void go() {
		Song s1 = new Song("baby don't","P","abc","efg");
		songList.add(s1);
		Song s5 = new Song("baby don't","P","abc","efg");
		songList.add(s5);
		Song s2 = new Song("alone walker","B","abcavbdghd","efg");
		songList.add(s2);
		Song s3 = new Song("love me","tyutt","abcavbdghd","efg");
		songList.add(s3);
		Song s4 = new Song("love me","tyutt","abcavbdghd","efg");
		songList.add(s4);
		System.out.println(songList);
		//Collections.sort(songList);
		//System.out.println(songList);
		Collections.sort(songList, new SortByTitle());
		System.out.println(songList);
		Collections.sort(songList, new Comparator<Song>() {
			public int compare(Song s1 , Song s2) {
				return s1.getArtist().compareTo(s2.getArtist());
			}
		});
		
		System.out.println(songList);
		
		
		// will be using now set to remove duplicate elements 
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
		
		
		
		
		
	}
	
	public class SortByTitle implements Comparator<Song>{
		public int compare(Song s1, Song s2) {
			return s1.getTitle().compareTo(s2.getTitle());
		}
	}
	
}

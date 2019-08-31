package com.jas.userDefinedSong;
/**
 * 
 * @author jayashreedas
 *
 */
public class Song implements Comparable<Song>{
	String title ;
	String artist ;
	String rating;
	String bpm ;
	
	
	
	public int compareTo(Song song) {
		return title.compareTo(song.getTitle());
	}
	
	public Song(String title , String artist ,String rating , String bpm){
		this.title = title ;
		this.artist = artist ;
		this.rating = rating ;
		this .bpm = bpm ;
	}
	
	
	
	public String getTitle() {
		return title ;
	}
	
	public String getArtist() {
		return artist ;
		
	}

	public String getRating() {
		return rating ;
	}
	
	public String getBpm() {
		return bpm ;
	}
	
	
	public String toString() {
		return title ;
	}

	
}

package com.jas.hasset;
/**
 * 
 * @author jayashreedas
 * in case of hashSet it checks hashcode for two elements 
 * if it's not equal than it consider as different element
 * so for removing duplicate from Song class need to override hasCode()
 * and equals() both method 
 *
 *
 */
public class Song1 implements Comparable<Song1>{
	
	String title ;
	String artist;
	String rating;
	String bpm ;
	
	public Song1(String title , String artist ,String rating ,String bpm ) {
		this.artist = artist ;
		this.title = title;
		this.rating = rating ;
		this.bpm = bpm ;
	}
	
	
	
	public String getTile() {
		return title ;
	}
	
	public String getArtist() {
		return artist ;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	public String getRating() {
		return rating ;
	}
	
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	
	public boolean equals(Object obj) {
		Song1 s = (Song1)obj;
		return getTile().equals(s.getTile());
	}



	@Override
	public int compareTo(Song1 o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTile());
	}
	
}

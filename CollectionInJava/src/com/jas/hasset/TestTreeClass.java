

/**
 * @author jayashreedas
 * 
 * 
 * 
 */
package com.jas.hasset;
import java.util.*;
import java.io.*;
public class TestTreeClass {
	
	public static void main(String arg[]) {
		new TestTreeClass().go();
	}
	
	public void go() {
		Book b1 = new Book("Patherpachali");
		Book b2 = new Book("Noukadubi");
		Book b3 = new Book("Aloadhar");
		
		TreeSet<Book> treeSet = new TreeSet<Book>();
		treeSet.add(b1);
		treeSet.add(b2);
		treeSet.add(b3);
		for(Book b : treeSet) {
		System.out.println(b.getTitle());
		}
		
		
		
	}
	
	
	class Book implements Comparable<Book>{
		String title ;
		public Book(String title ) {
			this.title = title ;
		}
		@Override
		public int compareTo(Book o) {
			return title.compareTo(o.getTitle());
		}
		
		
		public String getTitle() {
			return title ;
		}
	}
	
	
	
	/***
	 * 
	 * if Book method would not be implements Comparable interface 
	 * than ClassCastException would be coming out cause JVM would not be knowing 
	 * based on which field sorting needs to be done 
	 * 
	 * 
	 * 
	 * 
	 */
	

}

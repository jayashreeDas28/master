
/***
 * 
 * 
 * @author jayashreedas
 * Each element in a Map is actually two Objects -- a key and a value 
 * we can have duplicate value but not duplicate key 
 */
package com.jas.map;
import java.util.*;

public class TestMap {
	public static void main(String arg[]) {
		HashMap<String ,String> scores = new HashMap<String,String>();
		scores.put("Ben", "key of the family");
		scores.put("Grolia", "mad grand mom");
		scores.put("Halen", "she is would be mom ");
		System.out.println(scores);
		
		
		//output for this will come {}
		// instead of [ ] for set and List result would br listed in []  
	}

}

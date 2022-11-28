package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashIntro {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		//put value in map 
		// <key , value>
		map.put("India", 120);
		map.put("Aus", 150);
		
		System.out.println(map);
		
		// we can not store duplicate key in the HashMap
		// However if we try to store same key with different value
		// it will replace previous value
		map.put("India",180);
		System.out.println(map);
		
	   //get value respect to key
		System.out.println(map.get("India"));
		
		// contains key
		
		System.out.println(map.containsKey("India"));
		
		// keys in ArrayList 
		
		ArrayList <String> list = new ArrayList<>(map.keySet());
		
		System.out.println(list);
		
		//gets value from each key 
		
		for(String val : list) {
			System.out.println(val + "-->" +map.get(val));
		}
		
		
		
	}

}

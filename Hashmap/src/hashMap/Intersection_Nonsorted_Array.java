package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_Nonsorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {5,5,7,7,2,5};
		int[] arr2 = {6,7,9,5,5,5,5};
		
		ArrayList<Integer>res = IntersectonOfArray(arr1,arr2);
		System.out.println(res);
		
	}

	private static ArrayList<Integer> IntersectonOfArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap <>();
		
		for(int i = 0 ; i < arr1.length;i++) {
			
			if(map.containsKey(arr1[i])) {
				int val = map.get(arr1[i]);
				//val = val+1;
				map.put(arr1[i],++val);
			}else {
				map.put(arr1[i], 1);
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			
//			if(map.containsKey(arr2[i])) {
//				if(map.get(arr2[i]) <= 0) {
//					map.remove(arr2[i]);
//				}else {
//				int val = map.get(arr2[i]);
//				list.add(arr2[i]);
//				map.put(arr2[i], --val);
//				}
//			} 
			
			
			// checking 
			if(map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				// old frequency
				int of = map.get(arr2[i]);
				// new frequency
				int nf = of-1;
				map.put(arr2[i], nf);
			} 
		}
		return list;
	}

} 

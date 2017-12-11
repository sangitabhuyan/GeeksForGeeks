package com.geeksforgeeks.array;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurence {

	public static void main(String[] args) {
		int arr[]={1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 5, 5};
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			int key=arr[i];
			int value=1;
			if(!map.containsKey(key)){
				map.put(key, value);
			}
			else{
				map.put(key,map.get(key)+1);
			}
		}
		Set<Entry<Integer, Integer>> mapset=map.entrySet();
		Iterator<Entry<Integer, Integer>> it=mapset.iterator();
		while(it.hasNext()){
			Entry<Integer, Integer> obj=(Entry<Integer, Integer>) it.next();
			System.out.println(obj.getKey()+"->"+obj.getValue());
		}
		
	}

}

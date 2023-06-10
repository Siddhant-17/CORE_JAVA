package com.demo.test;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
public class TestMap {

	public static void main(String[] args) {
		//creating reference of Map interface
		Map<String,Integer> hm=new HashMap<>();
		hm.put("DAC", 300);
		hm.put("DBDA", 60);
		hm.put("DAI", 70);
		hm.put("DTISS",120);
		//to get value based on key
		System.out.println("Value of DAC" +hm.get("DAC"));
		int num=70;

		//display all the keys from the map with values>70
		//copy all key(String) in Set<String>
		//then by for loop
		Set<String> s=hm.keySet();
		for(String k:s)
		{
			if(hm.get(k)>num)
				System.out.println(k);
		}
		

		System.out.println("****************************");
		//display all the keys from the map with values>70
		Set<Map.Entry<String,Integer>> s1=hm.entrySet();
		for(Map.Entry<String,Integer> entry:s1)
		{
			if(entry.getValue()>num)
				System.out.println(entry.getValue());
		}
		
		System.out.println("****************************");
		for(Map.Entry<String, Integer> entry:s1)
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("****************************");
		hm.entrySet().forEach(a->System.out.println(a.getKey()+" "+a.getValue()));

		Map<String,Integer> tm=new TreeMap<>(hm);
		System.out.println(tm);
	
		
		
//		mp.put("Roll",12);
//		mp.put("clg",null);
//		mp.put("sal",15000);
//		mp.put("age", 23);
//		mp.put("faculty", 23);
//		mp.put(null, null);  //HashMap Allowed null key and null Value
		
		
//		mp.clear(); //clear whole pairs from collection
//		System.out.println(mp);
//		System.out.println(mp.containsKey("clg")); return true if key present in Map
//		System.out.println(mp.containsValue(23)); return true if value is present in Map
//		System.out.println(mp.entrySet()); it will return set view containing all key value pair
//		System.out.println(mp.get("sal")); return the value to which specified key is mapped
//		System.out.println(mp.getOrDefault("fast", 45));  it return value to which key is mapped 
														//if not present then return default value which we will pass to it
//		System.out.println(mp.hashCode()); return hashcode value of this map
//		System.out.println(mp.isEmpty()); return true if map contains no key-value mapping
//		System.out.println(mp.keySet()); return set view of the keys contained in the map 
										//return type Set<key>
//		System.out.println(mp.replace("clg",98)); Replaces the entry for the specified key only if it is currently mapped to some value.
//		System.out.println(mp.replace("Roll",77,77)); replace to the new value of given key if key and old value present in map return true if replace
													// return false if given key not present in map or we passsed wrong key and old value
//		System.out.println(mp.size()); return size of map return type int
//		System.out.println(mp.values()); return Collection of all values contained in map
										//return type Collection<v>
//		System.out.println(mp.remove("clg")); remove key from Map
//		System.out.println(mp.remove("clg",null)); return true by removing key value pair from map if present else return false
//		System.out.println(mp.putIfAbsent("ABD",17)); add kay value if passed key not present in map
//		System.out.println(mp.putIfAbsent("sal",65)); if passed key is present then it returns value of that key
//		System.out.println(mp.get("sal"));
//		Map<String,Integer> mp2=new HashMap<>();
//		mp2.putAll(mp);Copies all of the mappings from the mp to mp2 
//		System.out.println(mp2);
	}
}

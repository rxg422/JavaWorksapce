package com.kh.chap04_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	
	public static void main(String[] args) {
		Map<String, Snack> hm = new HashMap<String, Snack>();
		hm.put("다이제", new Snack("초코", 800));
		hm.put("칸쵸", new Snack("초코", 400));
		hm.put("두쫀쿠", new Snack("초코", 450));
		hm.put("감자칩", new Snack("어니언", 250));
		
		System.out.println(hm.get("다이제"));
		
		System.out.println(hm.size());
		
		System.out.println(hm.replace("다이제", new Snack("고소", 500)));
		System.out.println(hm.remove("다이제"));
		
		System.out.println();
		
		for(String s : hm.keySet()) {
			System.out.println(hm.get(s));
		}
		
		System.out.println();
		
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		for(Entry e : entrySet) {
			System.out.println(e.getKey() + " / " + e.getValue());
		}
	}
	
}

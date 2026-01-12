package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;
import com.kh.chap01_list.part01_arrayList.model.vo.MusicArtistDescending;

public class ListRun {

	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<>(3); // 객체 생성 시 제네릭 생략 가능
		
		list.add(new Music("Duet", "지코"));
		list.add(new Music("아무노래", "지코"));
		list.add(new Music("살별", "윤하"));
//		System.out.println(list);
//		
//		list.add(1, new Music("괜찮아", "소란"));
//		System.out.println(list);
//		
//		System.out.println(list.set(0, new Music("아이돌", "요아소비")));
//		System.out.println(list);
//		
		System.out.println(list.remove(2));
		System.out.println(list);
//		
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		
//		ArrayList<Integer> iArr = new ArrayList<Integer>(3);
//		iArr.add(1);
//		iArr.add(9);
//		iArr.add(900);
//		
//		System.out.println(iArr.contains(9));
//		System.out.println(iArr.indexOf(900));
//
//		System.out.println("\n===============================");
//		for(int i=0; i<iArr.size(); i++) {
//			System.out.print(iArr.get(i) + " ");
//		}
//		System.out.println("\n===============================");
//		for(int i : iArr) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\n===============================");
//		
//		Iterator<Music> iter = list.iterator();
//		
//		while(iter.hasNext()) {
//			Music ms = iter.next();
////			iter.remove();
//			System.out.println(ms);
//		}
//		
//		System.out.println(list);
//		
//		System.out.println("\n===============================");
//		System.out.println(list.subList(0, 2));
//		
//		System.out.println("\n===============================");
////		list.addAll(list.subList(0, 2));
//		System.out.println(list);
//		
//		System.out.println(list.isEmpty());
////		list.clear();
//		System.out.println(list.isEmpty());
//		
//		System.out.println("\n===============================");
//		List<String> list3 = new ArrayList<>();
//		list3.add("다");
//		list3.add("가");
//		list3.add("마");
//		list3.add("바");
//		list3.add("라");
//		list3.add("나");
//		Collections.sort(list3);
//		Collections.sort(list3, Collections.reverseOrder());
//		System.out.println(list3);
//		
//		list.add(new Music("괜찮아", "김정은"));
//		System.out.println("\n===============================");
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Comparator<Music> com2 = new MusicArtistDescending();
//		Collections.sort(list, com2);
//		System.out.println(list);
//		
//		Collections.shuffle(list);
//		Collections.shuffle(list3);
//		System.out.println(list);
//		System.out.println(list3);
	}
	
}

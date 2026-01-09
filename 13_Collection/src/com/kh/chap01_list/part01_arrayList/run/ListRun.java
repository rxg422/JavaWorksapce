package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Iterator;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<>(3); // 객체 생성 시 제네릭 생략 가능
		
		list.add(new Music("Duet", "지코"));
		list.add(new Music("아무노래", "지코"));
		list.add(new Music("살별", "윤하"));
		System.out.println(list);
		
		list.add(1, new Music("괜찮아", "소란"));
		System.out.println(list);
		
		System.out.println(list.set(0, new Music("아이돌", "요아소비")));
		System.out.println(list);
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		ArrayList<Integer> iArr = new ArrayList<Integer>(3);
		iArr.add(1);
		iArr.add(9);
		iArr.add(900);
		
		System.out.println(iArr.contains(9));
		System.out.println(iArr.indexOf(900));

		System.out.println("\n===============================");
		for(int i=0; i<iArr.size(); i++) {
			System.out.print(iArr.get(i) + " ");
		}
		System.out.println("\n===============================");
		for(int i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println("\n===============================");
		
		Iterator<Music> iter = list.iterator();
		
		while(iter.hasNext()) {
			Music ms = iter.next();
//			iter.remove();
			System.out.println(ms);
		}
		
		System.out.println(list);
		
		System.out.println("\n===============================");
		System.out.println(list.subList(0, 2));
		
		System.out.println("\n===============================");
		list.addAll(list.subList(0, 2));
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
		
	}
	
}

package com.kh.chap04_map.part03_clone.run;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class HashMapRun <K, V> {

	private Entry<K, V>[] table;
	private int capacity, size;
	
	class Entry <K, V> {
		K key;
		V value;
		Entry<K, V> next;
		
		public Entry(K key, V value, Entry<K, V> next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	public HashMapRun(int capacity) {
		this.capacity = capacity;
	}
	
	public void put(K key, V value) {
		int index = getIndex(key);
		
		if(table[index] == null) {
			table[index] = new Entry<>(key, value, null);
		}
		else {
			if(table[index].key.equals(key)) {
				table[index].value = value;
			}
			else {
				
			}
		}
		
		
		// getIndex함수 호출후 반환값으로 table의 index에 접근  
		// 접근시 내부의 값이 null이라면 Entry매개변수 있는 생성자를 이용하여 
		// 객체생성후 비어있는 저장공간에 Entry객체 추가하기. 
		//  ex) 최초 Entry 객체 생성시 : new Entry(key, value , null) 
		// 값이 null이 아니라면 , entry에 저장된 key값과 새롭게 추가하려는 entry의 
		// key값이 동일한지 검사후 동일하다면 , 중복값이므로 value값만 덮어씌우고 
		// key값이 다르다면 현재 entry의 next요소에 entry객체 저장. 
		// 만약 next에도 이미 값이 존재하는경우, next가 없는 entry를 찾을때까지 반복  
		// 중복값을 제외하고, 값이 새롭게 추가된경우 size 증가
	}
	
	public Snack get(String key) {
		return null;
	}
	
	public boolean containsKey(String key) {
		return true;
	}
	
	public void remove(String key) {
		
	}
	
	public int size() {
		return size;
	}
	
	public int getIndex(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(Entry e : table) {
			if(e == null) continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");	
			
			Entry next = e.next;
			do {
				if(next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");	
					next = next.next;
				}
			}while(next != null); //
		}
		//sb.append(Arrays.toString(table));
		
		sb.append('}');
		
		return sb.toString();
	}
	
}

package com.kh.chap04_map.part03_clone.run;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class HashMapRun <K, V> {

	private Entry<K, V>[] table;
	private int capacity, size=0;
	
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
				return;
			}
			else {
				Entry<K,V> next = table[index];
				
				while(true) {
					// Entry의 키값이 중복인 경우
					if(next.key.equals(key)) {
						next.value = value;
						return;
					}
					
					// 현재 Entry가 마지막일 때
					if(next.next == null) {
						next.next = new Entry<>(key, value, null);
						break;						
					}
					
					next = next.next;
				}
			}
		}
		size++;
	}
	
	public Snack get(K key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근 
		int idx = getIndex(key);
		Entry entry = table[idx];
		
		// 접근시 내부의 값이 null이라면 null값 반환   
		if(entry == null) {
			return null;
		}
		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인 

		
		while(true) {
			if(entry == null) {
				break;
			}
			if(entry.key.equals(key)) {
//				return entry.value;
			}
			
//			entry.
		}
		// 동일하다면 객체에 저장된 value값 반환. 
		// 동일하지 않다면 노드드의 next 값을 찾아 다시한번 검사 (next가 존재하지  
		// 않을때까지 반복). 다음 노드들 중에서 key값이 일치하는 값이 존재한다면  
		// 노드 내부의 value값 반환. 일치하는 key값이 없었다면 null값 반환 
		
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

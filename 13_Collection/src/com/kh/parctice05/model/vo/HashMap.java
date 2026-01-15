package com.kh.parctice05.model.vo;

public class HashMap<K, V> {
	
	private Entry<K, V> table[];
	private int capacity, size=0;
	
	public HashMap(int capacity) {
		this.capacity = capacity;
	}
	
	public static void main(String[] args) {
		
	}
	
	public int getIndex(K key) {
		// 매개변수로 전달받은 key값을 hashCode()로 변환시킨후
		// 객체의 총 저장공간 수(capacity)만큼 나눈 나머지 결과값을 반환하는 함수. 
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void put(K key, V value) {
		int idx = getIndex(key);
	
		if(table[idx] == null) {
			table[idx] = new Entry<K, V>(key, value, null);
			size++;
			return;
		}
		
		if(table[idx].key.equals(key)) {
			table[idx].value = value;
			return;
		}
		
		Entry<K, V> entry = table[idx];
		
		while(entry.next != null) {
			if(entry.key.equals(key)) {
				entry.value = value;
				return;
			}
		}
		
		if(table[idx] == null) {
			table[idx] = new Entry<K, V>(key, value, null);
		}
		else {
			if(table[idx].key.equals(key)) {
				table[idx].value = value;
				return;
			}
			else {
				Entry<K,V> next = table[idx];
				
				while(true) {
					if(next.key.equals(key)) {
						next.value = value;
						return;
					}
					
					if(next.next == null) {
						next.next = new Entry<K, V>(key, value, null);
						break;
					}
					
					next = next.next;
				}
			}
		}
		size++;
	}
	
	public V get(K key) {
		return null;
	}
	
	public boolean containsKey(K key) {
		return false;
	}
	
	public void remove(K key) {
		
	}
	
	public int size() {
		return size;
	}
}

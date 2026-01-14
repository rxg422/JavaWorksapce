package com.kh.parctice05.model.vo;

public class Entry<K, V> {
	
	K key;
	V value;
	Entry<K,V> next;
	
	public Entry(K key, V value, Entry<K, V> next) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
	}
}

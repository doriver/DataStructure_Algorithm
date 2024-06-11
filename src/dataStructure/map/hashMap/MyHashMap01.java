package dataStructure.map.hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MyHashMap01<K, V> {
	// key와 value를 저장하는 내부클래스
	private class Entry<K, V> {
		K key;
		V value;
		
		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	// LinkedList<Entry<K, V>>의 ArrayList로 해시테이블을 나타냄
	private List<LinkedList<Entry>> table;
	
	// 해시테이블의 기본 크기
	private final int SIZE = 16;
	
	public MyHashMap01() {
		table = new ArrayList<>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			table.add(new LinkedList<>());
		}
	}
	
	// key의 해시코드를 해시테이블 크기로 나누어 (저장될 배열의)인덱스를 계산
	// key가 달라도 같은값 나올수 있음
	private int getIndex(K key) {
		return key.hashCode() % SIZE;
	}
	
	// 키-값 쌍을 해시 테이블에 추가하거나 기존 값을 갱신
	public void put(K key, V value) {
		int index = getIndex(key);
		LinkedList<Entry> entries = table.get(index);
		
		for (Entry<K, V> entry : entries) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
		}

		entries.add(new Entry<>(key, value));
	}
	
	public V get(K key) {
		int index = getIndex(key);
		LinkedList<Entry> entries = table.get(index);
		
		for (Entry<K, V> entry : entries) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
		}
		
		return null;
	}
	
	public V remove(K key) {
		int index = getIndex(key);
		LinkedList<Entry> entries = table.get(index);
		
		for (Entry<K, V> entry : entries) {
			if (entry.key.equals(key)) {
				entries.remove(entry);
				return entry.value;
			}
		}
		
		return null;
	}
	
	public Set<K> keySet() {
		Set<K> keys = new HashSet<>();
		for (LinkedList<Entry> bucket : table) {
			for (Entry<K, V> entry : bucket) {
				keys.add(entry.key);
			}
		}
		return keys;
	}
	
	public static void main(String[] args) {
		MyHashMap01<String, String> map = new MyHashMap01();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		
		System.out.println(map.get("one")); // 1
		System.out.println(map.get("two")); // 2
		System.out.println(map.get("three")); // 3
		
		System.out.println(map.keySet()); // [one, two, three]

		System.out.println(map.remove("two")); //2
		System.out.println(map.get("two")); // null
	}

}

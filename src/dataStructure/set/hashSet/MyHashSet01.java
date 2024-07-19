package dataStructure.set.hashSet;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * 해시테이블의 장점인 O(1) 시간 복잡도
 * 검색, 삽입, 삭제 연산의 시간 복잡도가 O(1)
 */
public class MyHashSet01<T> {
	
	private static final int DEFAULT_CAPACITY = 16;
	private static final float LOAD_FACTOR = 0.75f;
	
	private ArrayList<LinkedList<T>> table;
	private int size;
	
	public MyHashSet01() {
		table = new ArrayList<>(DEFAULT_CAPACITY);
		
		for (int i = 0; i < DEFAULT_CAPACITY; i++) {
			table.add(null);
		}
		size = 0;
	}

	public boolean add(T value) {
		if (contains(value)) {
			return false;
		}
		
		if (size >= table.size() * LOAD_FACTOR) {
			resize();
		}
		
		int index = hash(value);
		if (table.get(index) == null) {
			table.set(index, new LinkedList<>());
		}
		table.get(index).add(value);
		size++;
		return true;
	}
	
	
	public boolean contains(T value) {
		int index = hash(value);
		LinkedList<T> bucket = table.get(index);
		return bucket != null && bucket.contains(value);
	}
	
	private int hash(T value) {
		return (value == null)? 0 : Math.abs(value.hashCode() % table.size());
	}
	
	private void resize() {
		ArrayList<LinkedList<T>> oldTable = table;
		int newTableSize = oldTable.size() * 2;
		
		table = new ArrayList<>(newTableSize);
		for (int i = 0; i < newTableSize; i++) {
			table.add(null);
		}
		size = 0;
		
		for (LinkedList<T> bucket : oldTable) {
			if (bucket != null) {
				for (T value : bucket) {
					add(value);
				}
			}
		}
	}
	
	public boolean remove(T value) {
		int index = hash(value);
		LinkedList<T> bucket = table.get(index);
		if (bucket == null || !bucket.remove(value)) {
			return false;
		}
		size --;
		return true;
	}
	
	public void clear() {
		table.clear();
		for(int i = 0; i < table.size(); i++) {
			table.add(null);
		}
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	@Override
    public String toString() {
	    StringBuilder sb = new StringBuilder("[");
	    for (LinkedList<T> bucket : table) {
	        if (bucket != null) {
	            for (T value : bucket) {
	                sb.append(value).append(", ");
	            }
	        }
	    }
	    if (sb.length() > 1) { // 문자열 끝에 있는 불필요한 마지막 쉼표와 공백을 제거하기 위해
	        sb.setLength(sb.length() - 2);
	    }
	    sb.append("]");
	    return sb.toString();
    }
	 
	public static void main(String[] args) {
		MyHashSet01<String> set = new MyHashSet01<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");

		System.out.println(set); // [aa, bb, cc]
		System.out.println(set.contains("aa")); // true
		System.out.println(set.contains("bb"));
		
		set.remove("cc");
		System.out.println(set); // [aa, bb]
		System.out.println(set.size()); // 2
		
		set.clear();
		System.out.println(set.size()); // 0
	}

}

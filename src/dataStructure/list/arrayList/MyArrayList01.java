package dataStructure.list.arrayList;

import java.util.Arrays;
/**
 * 중간에 값 추가해주는건 구현 안됨
 * 
 */
public class MyArrayList01<E> {

	private static final int DEFAULT_CAPACITY = 10;
	private int size = 0; // 실제로 사용되고 있는 크기
	private Object[] elements;
	
	public MyArrayList01() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	// 맨 뒤에 새로운 요소 추가( size도 1증가 ), 배열 가득차면 크기 늘려줌
	public void add(E e) {
		if (size == elements.length) { // elements 의 크기 키워줌
			ensureCapacity();
		}
		elements[size++] = e; // 맨 뒤(index= size)에 값 넣고 , size 증가
	}
	
	// 특정 index요소 반환
	public E get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		return (E) elements[index];
	}
	
	// 특정 index요소 제거, 뒤 요소들 땡기고 , size 1줄임 
	public E remove(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		E oldValue = (E) elements[index];
		
		int numMoved = size - (index + 1); // index뒤 요소 개수
		if (numMoved > 0) { 
			// '배열 복사,붙여넣기'로 index에 해당하는 요소 제거하고 한칸씩 땡김 
			System.arraycopy(elements, index + 1, elements, index, numMoved);
		}
		elements[--size] = null; // 그대로 남은 맨 마지막 요소 null해주고, size 1줄여줌
		// clear to let GC do its work
		
		return oldValue;
	}
	
	// 실제 사용되고 있는 요고 개수 반환
	public int size() {
		return size;
	}
	
	// 내부 배열 크기 2배로 늘려줌
	private void ensureCapacity() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList01<Integer> list = new MyArrayList01<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		} // 0, 1, 2, 3,
		System.out.println();
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index " + i + "의 값" + list.get(i) );
		} 
	}

}

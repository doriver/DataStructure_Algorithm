package dataStructure.list.arrayList;

public class MyArrayList01<E> {

	private static final int DEFAULT_CAPACITY = 10;
	private int size = 0; // 실제로 사용되고 있는 크기
	private Object[] elements;
	
	public MyArrayList01() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(E e) {
		if (size == elements.length) {
			// elements 의 크기 키워줌
		}
		elements[size++] = e; // index = size에 값 넣고 , size 증가
	}
	
	public E get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		return (E) elements[index];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

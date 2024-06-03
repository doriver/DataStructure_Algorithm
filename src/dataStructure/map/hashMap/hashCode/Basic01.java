package dataStructure.map.hashMap.hashCode;

import java.util.Objects;

/**		Object 클래스의 hashCode메서드( 자바의 모든 객체는 Object클래스로부터 상속받은 hashCode메서드를 갖고 있다 )
 * 			결과가 int값임(해시 값) 
 * 필요에 따라 이를 오버라이드할 수 있다
 * 해시 테이블(Hash Table)에서 키(key)를 저장하거나 검색할 때 사용
 * 
 * 객체의 메모리 주소를 기반으로 해시 코드를 생성
 * String이나 Integer 같은 기본 클래스들은 이를 오버라이드하여 더 유의미한 해시 코드를 제공
 */
public class Basic01 {

	public static void main(String[] args) {
		// String 타입의 객체에서 hashCode() 사용
		String str = "example";
		int strHash = str.hashCode();
		System.out.println("Hash code for String 'example': " + strHash); // -1322970774
		
		// Integer 타입의 객체에서 hashCode() 사용
        Integer integer = 42;
        int integerHash = integer.hashCode();
        System.out.println("Hash code for Integer 42: " + integerHash); // 42

        // Double 타입의 객체에서 hashCode() 사용
        Double dbl = 3.14;
        int doubleHash = dbl.hashCode();
        System.out.println("Hash code for Double 3.14: " + doubleHash); // 300063655

        // 사용자 정의 클래스 객체에서 hashCode() 사용
        Person ps = new Person("Alice", 30);
        int psHash = ps.hashCode();
        System.out.println("Hash code for Person Alice, 30: " + psHash); // 1963862399
	}
}

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
}

/**
 * 
 */
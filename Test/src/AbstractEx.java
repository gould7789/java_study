
// 추상 클래스: 추상화 메소드를 1개 이상 가지는 클래스 
// 문법적으로 추상화 클래스는 클래스 선언부 앞에 "abstract" 선언을 해주어야 함
// 추상화 클래스는 객채화가 불가능

// abstract method(추상화 메소드)
// 문법적으로 추상화 메소드에 기능이 구현되어 있지 않다라는 의미
// 기능 구현부에 해당하는 "{ }" 파트가 존재하지 않아야 함
// 추가적으로 메소드 정의 끝부분에 ";"으로 마무리
// 최종적으로 메소드 정의 앞 부분에 "abstract" 선언

abstract class MyAbs {
	abstract public void printX();
}

// 동물이 어떻게 우는지 명확하게 정해져있지 않기 때문에
// 기능 구현을 정확하게 할 수 없음 -> 추상화 메소드
abstract class Animal {
	abstract public void cry();
}

// method overriding : 메소드 오버라이딩
class Cat extends Animal {
	public void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal { 
	public void cry() {
		System.out.println("츠캉츠캉");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.cry();
		Animal b = new Cat();
		b.cry();
		
	
	}
}


// 추상화 클래스
// 추상화 클래스는 객체화가 불가능
// 하위클래스에 추상화 메소드 오버라이딩을 강제하기 위해 사용
abstract class Animal {
	// 추상화 메소드
	abstract public void cry();
	
//	public void cry() {
//		System.out.println("울어라이!");
//	}
}

// Cat 클래스 안에는 cry() 메소드가 없지만 Animal 클래스를 상속 받았기 때문에 메소드 사용 가능
class Cat extends Animal {
	 public void cry() {	// 상속받은 메소드 기능 재정의 -> 메소드 오버라이딩
//		 super.cry();	// super()라면 상속 받은 클래스의 생성자가 호출 되지만 super.으로 메소드 사용 가능
		 System.out.println("미야옹");
	}
}
class Dog extends Animal {
	public void cry() {		// 상속 받은 추상화 메소드 오버라이딩을 통해 일반 메소드로 변환
		System.out.println("츠캉츠캉");
	}
}
class Pig extends Animal {
	public void cry() {
		System.out.println("차를로스");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		// Animal 클래스에서 상속 받은 메소드 사용 가능
		Cat c = new Cat();
		c.cry();
		Dog d = new Dog();
		d.cry();
		Pig p = new Pig();
		p.cry();
		
		Animal[] a = new Animal[3];
		a[0] = c;
		a[1] = d;
		a[2] = p;
		
		// 다양성
		a[0].cry();
		a[1].cry();
		a[2].cry();
	}
}

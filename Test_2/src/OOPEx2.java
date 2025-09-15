
// 자바의 3대 생략 요소
/*
 1. default Constructor 생략 가능
 2. extends Object
 3. super()
 */

class AAA {
	public AAA() {
		System.out.println("aaa 생성자");
	}
}

class BBB extends AAA {
	public BBB() {
		System.out.println("bbb 생성자");
	}
}

public class OOPEx2 {
	public static void main(String[] args) {
		AAA a = new BBB();
	}
}

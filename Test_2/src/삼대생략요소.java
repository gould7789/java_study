
// 자바에서 3가지 생략 가능한 주요 문법이 존내
// 1. extends Object
//		: 모든 클래스는 Object 클래스를 상속받고 있다
//		: 자바 클래스의 최상위 클래스는 Object class다
// 2. Default Constructor 생략이 가능
//		: 개발자가 생성자를 하나도 만들어주지 않으면 디폴트 생성자는 자동으로 만들어짐
// 3. super();
//		: 모든 생성자의 첫번째 라인에 생략되어 있음
//		: 상위 클래스 디폴트 생성자 호출을 의미

class SuperA {
	public SuperA(int x) {
		System.out.println(x);
	}
}

// 상속
// 상위 클래서 지원 물려받기 -> 상속의 대상은 클래스
// 단일 상속만 지원
// 상위 클래스로부터 상속 받을 때 멤버 변수, 메소드를 상속받게 된다
class MyA extends SuperA {
	public MyA() {
		// 상위 클래스의 생성자 호출
		// 생성자의 첫 번째 라인에서만 사용 가능
		super(3);	// 상속받은 클래스의 생성자가 있다면 super() 값을 입력 해야함
	}
}

public class 삼대생략요소 {
	public static void main(String[] args) {
		new MyA();
	}
}

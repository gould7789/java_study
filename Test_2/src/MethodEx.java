
// 자바에서 메소드 정의 문법
// 접근제한자 리턴형 메소드이름(파라미터) {실제코드...}

// 접근 제한자 종류: public protected default private
//				 public : 누구나 접근해서 사용 가능한 메소드
//				 private : 메소드가 정의된 클래스 안에서만 사용 가능

// 리턴형 종류: 기본 자료형, 객체형, void(리턴형이 없음을 의미)

class MyCal {
	// 덧셈 기능을 하는 메소드 구현
	public int add(int x, int y) {
		int r = x + y;
		return r;
	}
	
	// 메소드 오버로딩(overloading)
	// 하나의 클래스 안에 동일한 이름의 메소드 여러개 정의 가능
	// 단, 이름이 같으면 호출 할 때 뭘 호출할지 알 수 없게 되므로
	// 구분을 위해 메소드 파라미터의 종류나 갯수가 달라야 함
	
	// 실수 덧셈 기능을 하는 메소드 구현
	public double add(double x, double y) {
		double r = x + y;
		return r;
	}
	
}

class 라면집 {
	// public(접근제한자) void(리턴형) 라면끓여줘(메소드이름)
	public void 라면끓여줘(int 라면살돈) { // 메소드 정의
		// 라면 제작을 위한 프로그래밍
		// ...
		System.out.println("보글보글보글보글맛좋은라면라면이있기게세상살맛나");
	}
}

public class MethodEx {
	public static void main(String[] args) {
		
		MyCal m = new MyCal();
		int result = m.add(1, 2);
		System.out.println(result);
		
		double result2 = m.add(0.1, 0.2);
		System.out.println(result2);
		
		// 라면 끓여줘 메소드 사용(호출)
		// 메소드 호출 : 메소드 이름을 사용하여 호출 가능
		// 1. 해당 메소드를 가지고 있는 클래스 객체화
		// 2. 객체이름. 메소드이름(파라미터);
		
		// 1. 라면끓여줘 메소드를 가지고 있는 클래스 객체화
		라면집 r = new 라면집();
		// 2. 객체이름.메소드이름(파라미터);
		r.라면끓여줘(100);
	}
}

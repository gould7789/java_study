/*
메소드 오버로딩(method overloading)
	- 하나의 클래스에 동일한 이름의 메소드 여러 개를 구현 가능 하도록 지원
	- 이름이 모두 동일하면 호출할 때 구분이 불가능하므로 메소드의 파마리터 종류나 개수가 다르게 구현되어야함
 */

class Cal {
	
	// 덧셈 기능을 하는 메소드 구현
	public void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
	
	// 실수 + 실수
	public void add(double a, double b) {
		double result = a + b;
		System.out.printf("%.1f\n", result);		// printf를 통해 소숫점 조절
	}
	
	// 실수 + 정수
	public void add(double x, int y) {
		double result = x + y;
		System.out.println(result);
	}
}




public class MethodOverloadingEx {
	public static void main(String[] args) {
		
		Cal a = new Cal();		// Cal 객체화
		a.add(2, 1);
		a.add(0.1, 0.2);
		a.add(0.1, 1);
	}
}

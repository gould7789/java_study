
class Cal {
	
	// 덧셈 기능을 하는 메소드 구현
	public void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
	
	public void doub(double a, double b) {
		double result = a + b;
		System.out.println(result);
	}
}




public class MethodOverridingEx {
	public static void main(String[] args) {
		
		Cal a = new Cal();		// Cal 객체화
		a.add(2, 1);
		a.doub(0.1, 0.2);
	}
}

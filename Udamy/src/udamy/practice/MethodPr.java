package udamy.practice;

class Cal {
	public void sum(int num1, int num2, int num3) {
		System.out.printf("%d + %d + %d = %d", num1, num2, num3, num1 + num2 + num3).println();
	}
	
	// 결과값 리턴
	public int sumOfTwoNumbers(int num1, int num2) {
		int result = num1 + num2;
	
		return result;
	}
}

public class MethodPr {
	public static void main(String[] args) {
		// 다른 메소드를 호출하여 출력
		Cal calculator = new Cal();
		calculator.sum(1, 2, 3);
		
		// 다른 메소드로부터 반환 받은 값을 받아서 출력
		int result = calculator.sumOfTwoNumbers(15, 10);
		System.out.printf("두 수의 합은: %d", result);
	}
}

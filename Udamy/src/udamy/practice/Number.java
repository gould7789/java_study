package udamy.practice;

public class Number {
	// 1에서부터 사용자가 지정한 숫자까지 출력하는 메소드 작성
	public void printNumbers(int n) {
		System.out.print("지정한 숫자까지 출력: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			
			// 숫자가 출력된 뒤 구분할 수 있도록 ',' 출력
			if (i < n) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	// 1부터 사용자가 지정한 숫자까지의 제곱을 출력하는 메소드 작성
	public void printSquaresOfNumbers(int n) {
		System.out.print("지정한 숫자까지 제곱값 출력: ");
		for (int i = 1; i <= n; i++) {
			
			// 제곱값 계산
			int result = (int) Math.pow(i, 2);
			System.out.print(result);
			
			// 숫자가 출력된 뒤 구분할 수 있도록 ',' 출력
			if (i < n) {
			System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	// 메인메소드에서 출력
	public static void main(String[] args) {
		Number n = new Number();
		n.printNumbers(10);
		n.printSquaresOfNumbers(5);
	}
}

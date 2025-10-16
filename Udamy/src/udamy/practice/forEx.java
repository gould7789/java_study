package udamy.practice;

// 10의 제곱 출력
public class forEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 8; i += 2) {
			// 자바 내장 함수를 통해 10의 제곱 출력
			System.out.println((int)Math.pow(10, i));
		}
	}
}


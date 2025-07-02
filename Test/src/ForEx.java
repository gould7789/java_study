
public class ForEx {
	
	public static void main(String[] args) {
		// 반복문 사용
		// 자바에서는 반복문 작성을 위해 for 문법 사용
		// for (초기값 설정 : 반복 조건 : 증감식) {반복될 코드}
		
		// 1~10까지 누적 합계를 구하는 프로그램 작성
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			num += i;
		}
		System.out.println(num);
		
		
		// 정수 1을 10번 누적해서 더한 결과를 출력
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += 1;
		}
		System.out.println("result: " + result);
		
		
		// 0.1을 10번 누적
		// 답 확인해보기
		double result2 = 0;
		for (int i = 1; i <= 10; i++) {
			result2 += 0.1;
		}
		System.out.println(result2);
	}
}

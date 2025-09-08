
public class ForEx {
	
	public void star(String c, int x) {
//		for (int i=0; i<x; i++) {
//			for (int j=0; j<=i; j++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
		
		// 재귀함수
		System.out.print(c);
		if (x > 1) {
			star(c, x-1);
		}
	}

	public static void main(String[] args) {
		
		// 자바에서 반복문
		// 기본문법
		// for (초기값; 조건식; 증감식) {반복할 코드}
		
		// 별 삼각형 코드
		for (int j = 1; j < 10; j++) {
			ForEx s = new ForEx();
			s.star("*", j);
			System.out.println();
		}
	}
}


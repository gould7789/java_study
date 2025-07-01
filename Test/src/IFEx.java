
public class IFEx {
	public static void main(String args[]) {
		// 자바에서 제어문 사용
//		if (특정 조건이 만족하면) {
//			실행
//		} else {
//			그렇지 않다면 else 실행
//		}
		
		int x = 30;
		int y = 20;
		int k = 100;
		
		// &&, & 연산자의 차이
		// &&가 더 엄격함, &은 앞의 조건이 틀리더라도 뒤의 조건 실행
		
		// ++, +=, -=
		// x++ -> x = x + 1;
		// x += 10 -> x = x + 10;
		// x -= 10 -> x = x - 10;
		
		if (x > y && (k += 10) > 0) {
			System.out.println("조건 만족");
		} else {
			System.out.println("조건 불충");
		}
		System.out.println(k);
		
		// 스코어가 70 이상일 때 "C", 80 이상일 때 "B", 90 이상일 때 "A"를 출력하도록 코드 작성 
		int score = 100;
		
		if (score >= 90 ) {				// 점수가 90점 이상일 때
			System.out.println("A");
		} else if (score >= 80) {		// 점수가 80점 이상일 때
			System.out.println("B");
		} else {							// 점수가 70점 이상일 때, 그 이하일 때
			System.out.println("C");
		}
	}

}

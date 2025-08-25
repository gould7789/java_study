
public class BasicTypeEx {

	public static void main(String[] args) {
		
		// 자바의 기본 자료형
		// 자바에서 변수를 만들 때에는 해당 변수가 가질 수 있는 자료를 지정해주어야 함
		// ex) int x = 0;
		
		// 1. 정수형 (byte - short - int - long)
		byte b = 10;	// 1byte 용량 -> 2^8 = 256, -128 ~ +127 숫자 저장
		b = -128;
//		b = -129; // 범위초과		
		
		short s = -129;		// 2byte 용량
		s = 128;
		
		int i = 99999;		// 4byte 용량
		
		long l = 9999999; // 8byte 용량
		
		b = 90;
//		b = b - 1; // 불가능
//		short s1 = b - 1; // 불가능
		// 자바에서 정수형 산술연산이 이뤄지게 되면 int형으로 암묵적으로 간주
		// 따라서 b - 1 -> int 타입이 됨
		int i1 = b - 1; // 가능
		
		
		// 2. 실수형 (float - double) : 디폴트 타입은 double4
//		float f = 0.1;	// 0.1은 double 타입으로 인식되므로 오류
		float f = 0.1f;
		double d = 0.1;
		
		
		// 3. 문자형 (char)
		// 문자 하나를 저장하기 위해 ''를 사용
		// 문자 대신 아스키코드표 상의 값만 사용할 수 있다
		char word = 'A';
		char word2 = 'B';
		if (word < word2) {
			System.out.println("A가 더 빠르다" + word);
		word++;
		System.out.println(word);
		}
		
		char c = 'A';
		System.out.println(c);
		
		// 한 번에 여러 변수를 지정하고 싶을 때 처음 타입을 지정하고 ,를 통해 각각 선언해야함
		char c1 = 76, c2 = 69, c3 = 69;
		System.out.println(""+c1+c2+c3);
		
		c = '이';
		System.out.println(c);
		
		
		// 4. boolean형
		// true or false 값만 저장 가능
		boolean boo = true;
		boo = false;
	}
}

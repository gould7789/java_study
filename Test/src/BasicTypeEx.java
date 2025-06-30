
public class BasicTypeEx {

	public static void main(String args[]) {
		
		// 자바의 기본 자료형
		// 변수 : 변하는 값을 저장할 수 있는 공간
		// 자바에서는 변수를 선언할 때 변수가 어떤 값을 가질 수 잇는지
		// 지정해주어야 한다(변수 타입을 지정해야함)
		
		// 1. 정수형 : 암묵적인 정수형의 디폴트는 int
		// 정수형 안에서 byte(1byte) - short(2byte) - int(4byte) - long(8byte)으로 나뉘어짐
		// 1byte : -128~127 까지 저장 가능
		byte age = 127;
		short s = 128;
		int i = 128;
		long l = 128;
		
		// 2. 실수형 : 명시적인 실수형의 디폴트는 double
		// 실수형 안에서 float - double
		float f = 0.1f;
		double d = 0.1;
		
		// 3. 문자형
		// 문자형 char
		char c = 'A';	// == char c = 'A';
		System.out.print(c);
		
		// 4. boolean형
		// boolean
		boolean b = true;
		
	
	}
}

// 메소드 정의를 위한 문법
// 접근 제한자 리턴형 메소드 이름(파라미터) {메소드 호출시 실행할 코드}
// 접근 제한자 : public - protected - default - private
//			   - public : 누구나 사용 가능
//			   - private : 나(클래스)만 사용 가능				

// 리턴형 : 메소드 호출 결과값의 타입
//			기본자료형, 객체형, void(리턴값이 없다)

// 파라미터 : 메소드 호출시 출력되는 값(1개 이상 or 없을 수도 있음)

class MyMethod {
	int age = 20;
	
	// 메소드 정의
	public void printA() {	// 리턴값 없음
		System.out.println("A");
	}
	
	public int getAge() {	// 리턴형 int 타입으로 지정
		return age; // 리턴형이 정의된 경우 "return" 사용하여 리턴값 넘겨줌
	}
	
}

// 메소드 사용(호출)
// 메소드 호출을 위해서는 메소드를 메모리에 올려주어야 함
// 호출 문법 : 메소드 이름(파라미터값);

public class MethodEx {
	
	// 자바에서 함수(메소드) 사용 방법
	// 자바에서는 메모리에 코드를 올려놓고 실행해야함
	// 하지만 메소드만 메모리에 올리는 것은 불가능함
	// 자바에서는 클래스 단위로 메모리에 코드를 올릴 수 있음
	// 그래서 메소드를 올리기 위해 클래스 단위로 메모리에 올림
	public static void main(String[] args) {
		MyMethod m = new MyMethod(); // 메소드를 메모리에 올려주기 위해 메소드가 포함된 클래스를 메모리에 올림
		m.printA();	// 메소드 사용 문법 : 메소드 이름(파라미터값);
		int age = m.getAge();	// 메소드 호출 결과로 넘어온 값 저장
		System.out.println(age);
	}
}

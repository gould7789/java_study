// 객체 : 메모리에 올라간 클래스

// class의 구성요소
// 1. 멤버변수
// 2. 메소드
// 3. 생성자

// 자바 프로그램은 모든 코드를 class를 만들고 내부에 작성해야 한다
class MyClass {
	int x = 10;
	
	// 멤버변수 선언 이외의 코드는 전부 메소드 안에 작성
	public void printX() {
		System.out.println(x);
	}
	
	public void printY() {
		x = 100;
		System.out.println(x);
		
		// 지역변수
		int y = 20;
	}
}

public class OOPEx {
	//자바 코드를 실행시키면 제일 먼저 실행되는 메소드는
	// main() 메소드
	public static void main(String[] args) {
		
		// printX() 메소드 실행(호출)
		// 자바에서는 메모리에 코드를 올려놓고 실행해야 한다
		// 하지만 메소드만 메모리에 올리는 것은 불가능함
		// 자바에서는 클래스 단위로 메모리에 코드를 올릴 수 있음
		// 그래서 메소드를 올리기 위해 클래스 단위로 메모리에 올림
		MyClass x = new MyClass();	// 메소드를 메모리에 올려주기 위해 메소드가 포함된 클래스를 메모리에 올림
		x.printX();
	}
}

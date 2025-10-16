package udamy.practice;

// 인사를 사용자가 지정한만큼 하는 메소드 작성
class HelloWolrd {
	public void sayHelloWorld(int num) {
		for (int i = 0; i < num; i++ ) {
			System.out.println("Hello World");
		}
	}
}

public class Hello {
	public static void main(String[] args) {
		// 인사 출력
		HelloWolrd h = new HelloWolrd();
		h.sayHelloWorld(3);
	}
}

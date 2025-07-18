
class MyMethod {
	int y = 10; // 멤버 변수(전역 변수 - global variable)
	int result;
	private void printX() {
		System.out.println("X");
	}
	
	public void add() {
		MyX n = new MyX();
		result = n.x + y;
		System.out.println(result);
	}
}

class MyX {
	int x = 20;
}


public class MethodEx {
	public static void main(String[] args) {
		MyMethod x = new MyMethod();
		x.add();
		System.out.println(x.result/10);
	}
}


// interface : 클래스가 아닌 interface가 따로 존재
// 문법적으로 interface는 추상화 메소드 + 상수로만 이루어져 있음

// interface를 사용하는 가장 큰 목적은 자바의 단일 상속 보완
// interface는 명확한 명사보다 특정 행동을 정의할 때 사용
interface MyInter {
	final int x = 10;
	abstract public void printX();
}

// interface 사용
// interface는 객체화가 불가능 하므로 그 자체로 사용은 불가능
// 클래스에서 interface를 구현(implements)하여 사용 가능
class UseInter implements MyInter {
	// 오버라이딩 하여 내용 변경
	public void printX() {
		System.out.println("overriding");
		
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		

	}

}

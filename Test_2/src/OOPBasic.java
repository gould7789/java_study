// OOP : 유지보수의 관리가 편리한 프로그램
// 멤버변수 private 선언부터
// 추가로 public getXXX / setXXX 메소드 구현


class MyStudent {
	public int age;			// OOP 관점에 잘못된 코드
	private String name;		// OOP 관점에 잘못된 코드
	
	public void setName(String n) {
		name = n+"씨";
	}
}

public class OOPBasic {
	public static void main(String[] args) {
		MyStudent m1 = new MyStudent();
		m1.age = 20;
		m1.setName("황길동");
		
		MyStudent m2 = new MyStudent();
		m2.age = 20;
		m2.setName("갓길동");
	}
}


class MyPerson {
	int age; // 멤버 변수
	private String name;	// oop 코드
	
	// 생성자 : 리턴값이 없고 클래스 이름과 같아야 함
	public MyPerson() {
		this("동토", 20);
	}
	public MyPerson(String n) {
		this(n, 20);
	}
	public MyPerson(int a, String n) {
		this(n, a);
	}
	public MyPerson(String n, int a) {
		age = a;
		name = n;
	}
	
	public void setName(String n) {
		name = n + "님";
	}
	public String getName() {
		return name;
	}
}


public class ConstructorEx {

	public static void main(String[] args) {
		MyPerson p = new MyPerson();
		p.setName("동토");		// oop 코드
		p.age = 20;
		System.out.println(p.getName());
		
		MyPerson p2 = new MyPerson(30, "쿠마");
		p2.setName("쿠마");
		p2.age = 30;
	}
}

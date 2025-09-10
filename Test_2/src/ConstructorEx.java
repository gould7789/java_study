
// 생성자(constructor)
// 클래스가 객체화 될 때 한 번만 호출
// 문법적으로 생성자는 메소드와 문법이 유사하나, 리턴형이 없고 이름이 클래스명과 동일함

class MyCon {
	private int age;
	private String name;
	
	// private 선언을 하고, get/set 메소드를 사용했으면 JavaBean 클래스
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	 // default constructor
	//디폴트 생성자는 생략이 가능하나, 다른 생성자를 만들어 주지 않아야 한다
	 public MyCon() {
		 // this()는 현재 클래스내의 생성자 호출
		 // 생성자 첫 번째 라인에서만 사용 가능
		 this("김길동", 20);
	 }
	 
	 public MyCon(String n) {
		 name = n;
	 }
	
	// 파라미터를 받으므로 디폴트 생성자가 아님
	public MyCon(int a, String n) {
		this(n, a);
	}
	
	public MyCon(String n, int a) {
		age = a;
		name = n;
	}
	
	// 나이 set 메소드
	public void setAge(int a) {
		if (a < 150) {
			age = a;
		}
	}
	
	// 이름 get 메소드
	public String getName() {
		return name;
	}
	
}

public class ConstructorEx {
	public static void main(String[] args) {
		// 생성자 호출 -> 객체 생성
		MyCon m1 = new MyCon(20, "김길동");
		//m1.age = 22;
		// private 선언을 했기 때문에 set메소드를 통해 값을 넣는 것만 가능
		m1.setAge(22);
		System.out.println(m1.getName());
		
		MyCon m2 = new MyCon(22, "박길동");
	}
}

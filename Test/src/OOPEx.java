
public class OOPEx {
	int y = 20;		// 클래스 안에 있는 변수는 멤버변수 member variable
	
	public static void main(String args[]) {
		
		int x = 10;	// 함수 안에 있는 변수는 지역변수 local variable
		System.out.println(x);
		
		OOPEx o = new OOPEx(); // OOPEx 클래스를 메모리에 올리겠다는 뜻
		
		System.out.println(o.y);
	}

}

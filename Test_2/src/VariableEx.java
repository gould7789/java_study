// 변수 : 변하는 하나의 값을 저장하기 위한 공간

public class VariableEx {
	// 멤버 변수(member variable) : 클래스 전체에서 사용 가능한 변수/클래스의 멤버
			 static int x = 10;
			
	public static void main(String[] args) {
		// 지역 변수(local variable) : 특정지역=메소드에서만 사용 가능한 변수
		int y = 10;
		y = 200;
		System.out.println(y);
		
		// 메모리에 클래스를 올린 뒤에 사용 가능
		VariableEx v = new VariableEx();
		System.out.println(v.x);
		
		// 변수 자체에 static을 사용하여 처음부터 메모리에 올려도 됨
		System.out.println(x);
	}
}

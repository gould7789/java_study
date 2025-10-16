package udamy.practice;

// 삼각형의 세각의 합이 180이 되는지
class Tri {
	public void triangle(int angle1, int angle2, int angle3) {
		if (angle1 + angle2 + angle3 == 180);
			System.out.println("삼각형");
	}
}

// 주어진 수가 짝수인지
class Even {
	public void even_search(int a) {
		if (a % 2 == 0);
			System.out.println("짝수");
	}
}

public class Practice {
	public static void main(String[] args) {
		int n1; int n2; int n3; int n4;
		n1 = 10; n2 = 20; n3 = 3; n4 = 4;
		
		if (n1 + n2 > n3 + n4);
			System.out.println("와웅");
		
		// 객체화
		Tri t = new Tri();
		t.triangle(60, 60, 60);
		
		// 객체화
		Even e = new Even();
		e.even_search(4);
	}
}

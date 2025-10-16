import java.util.ArrayList;

class MyPerson {
	int age;
	String name;
	int score1;
	int score2;
	int score3;
	int total = 0;
	
	// 생성자
	public MyPerson(String n, int a, int s1, int s2, int s3) {
		name = n;
		age = a;
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	
	public void average() {
		int result = score1 + score2 + score3;
		total = result/3; 
	}
	
	public void score_print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성적평균: " + total);
	}
	
}	

public class GradeAvr {
	public static void main(String[] args) {
		
		MyPerson m1 = new MyPerson("김길동", 20, 90, 80, 70);
		m1.average();
		m1.score_print();
		
		MyPerson m2 = new MyPerson("고길동", 20, 100, 100, 90);
		m2.average();
		m2.score_print();
		
		MyPerson m3 = new MyPerson("갓길동", 22, 90, 80, 90);
		m3.average();
		m3.score_print();
		
		// ArrayList : 객체를 여러개 저장할 수 있는 공간
		ArrayList mTotal = new ArrayList();
		mTotal.add(m1);	// mTotal에 m1 객체 저장
		mTotal.add(m2);
		mTotal.add(m3);
		
		int result = 0;
		for (int i=0; i<3; i++) {
			MyPerson t = (MyPerson)mTotal.get(i);	// ArrayList에서 값 가져올 때는 순서(인덱스)를 기준으로 가져옴
			result += t.score1 + t.score2 + t.score3;
		}
	}	
}

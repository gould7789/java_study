
// OOP 출발점
// 1. 모든 멤버변수 접근제한자 private 선언

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
		
		
	}	
}


public class Student {
	String name;
	int age;
	
	Student(String inputname, int inputage) {
		name = inputname;
		age = inputage;
	}
	
	void sayHello() {
		System.out.println("안녕하세요! 저는 " + name + "이고, 나이는" + age + "살입니다");
	}
}

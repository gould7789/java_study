
public class GUguEx {

	public static void main(String[] args) {
		
		// 구구단 프로그램 작성
		for (int dan = 2; dan < 10; dan++) {
			for (int num = 1; num < 10; num++) {
				System.out.printf("%d x %d = %d\n", dan, num, dan*num);
			}
			System.out.println("===========");
		}
	}
}

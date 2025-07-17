
public class SwitchEx {

	public static void main(String[] args) {
int score = 90;
		
		// 스위치 버전
		switch (score/10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		// if 버전
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		// switch(판정의 근거가 되는 값)
		// switch는 그 값이 실행되면 밑의 코드들도 전부 실행 그러므로 break로 조절 해야함
		int r = 5;
		switch (r) {
		case 1:
			System.out.println("1등");
			break;
		case 2:
			System.out.println("2등");
			break;
		case 3:
			System.out.println("3등");
			break;
		case 4:
			System.out.println("4등");
			break;
		default:
			System.out.println("탈락");
			break;
		}


	}

}

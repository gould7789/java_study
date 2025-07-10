
class MyHW {
	public void max(int[] y) {
		if (y[0] > y[1]) {
			int buffer = y[1];
			y[1] = y[0];
			y[0] = buffer;
		}
	}
}

public class HW1 {
	public static void main(String[] args) {
		// 정수 값 2개를 가지는 배열을 파라미터로 받는 메소드를 정의하고 기능은 다음과 같이 구현
		// 수신된 배열의 정수 두 개중 큰값을 배열 1번째 위치에
		// 작은 값을 배열 0번째 위치에 오도록 변경
		int[] x = {10, 5};
		MyHW m = new MyHW();
		m.max(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}

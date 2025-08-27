
public class ArrayEx {
	public static void main(String[] args) {

		//배열 : 변하는 여러개의 값을 저장하기 위한 공간
		// 자바에서 배열 사용 문법
		
		// 1.
		int[] x = {10, 20, 30};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		// 2. 
		// int값을 저장할 수 있는 공간 3개를 만들고 그 위치를 y에 저장
		int[] y = new int[3];
		y[0] = 10;
		y[1] = 20;
		y[2] = 30;
	}
}

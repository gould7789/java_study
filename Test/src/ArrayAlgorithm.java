
class Sor {
	// 두 개의 정수값을 전달 받아서 가장 큰 값을 리턴하는 메소드
	public int Max(int num1, int num2){
		int result = 0;
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}
	
	// 최댓값을 0으로 갱신하는 함수
	public void MaxDelete(int[] x, int result) {
		for (int number = 0; number < 5; number++) {
			if (result == x[number]) {
				x[number] = 0;
			}
		}
	}
	
}

public class ArrayAlgorithm {
	public static void main(String[] args) {
		Sor n = new Sor();
		
		// 최종 출력
		System.out.println(n.Max(121, 1));
		
		int[] x = {20, 30, 10, 50, 90};
		// 배열의 값을 비교해서 큰 값 출력
		int result = -1;
		for (int number = 0; number < x.length; number++) {
			result = n.Max(result, x[number]);
			}
		System.out.printf("최댓값은 %d", result);
		
		// 최댓값을 0으로 갱신하여 다음 최댓값을 찾는 준비
		n.MaxDelete(x, result);
		
		// 배열의 두 번째로 큰 값 출력
		result = -1;
		for (int number= 0; number < x.length; number++) {
			result = n.Max(result, x[number]);
		}
		System.out.printf("\n두번째로 큰 값은 %d", result);
	}
}

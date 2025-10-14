import java.util.StringTokenizer;

public class CalLogic {
	// 계산식을 파라미터로 넘겨주면 계산결과를 리턴하는 메소드 구현
	public int doIt(String str) {
		int result = 0;
		
		StringTokenizer t = new StringTokenizer(str, "+-*/", true);

		// 더 가져올 토큰이 있다면 계속 실행
		while (t.hasMoreTokens()) {
			String r = t.nextToken();
			
			switch(r) {
			case "+":
				result += Integer.parseInt(t.nextToken());
				break;
			case "-":
				result -= Integer.parseInt(t.nextToken());
				break;
			case "*":
				result *= Integer.parseInt(t.nextToken());
				break;
			case "/":
				result /= Integer.parseInt(t.nextToken());
				break;
			default:
				// r이 "+-*/" 아니라면 남은 건 숫자
				// r을 숫자형으로 변환해서 저장
				result = Integer.parseInt(r);
				break;
			}
		}
		
		return result;
	}
}

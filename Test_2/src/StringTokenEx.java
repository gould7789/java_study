import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		// StringTokenizer : 문자열 분리를 위해 사용하는 클래스
		String str = "3+2-1";
		
		// 계산 결과
		int result = 0;
		
		
		// "+"를 기준으로 분리
		// 분리하고 싶은 문자를 같이 넣어도 됨 -> true 옵션을 넣으면 구분자(연산자)도 같이 출력 됨
		StringTokenizer t = new StringTokenizer(str, "+-*/", true);
		
		// 더 가져올 토큰이 있다면 계속 실행
		while (t.hasMoreTokens()) {
			String r = t.nextToken();
			// Integer.parseInt("0"); : 문자형 -> int 형으로 변환
//			result += Integer.parseInt(r);	
			
			if (r.equals("+")) {
				result += Integer.parseInt(t.nextToken());
			}
			else if (r.equals("-")) {
				result -= Integer.parseInt(t.nextToken());
			}
			else if (r.equals("*")) {
				result *= Integer.parseInt(t.nextToken());
			}
			else if (r.equals("/")) {
				result /= Integer.parseInt(t.nextToken());
			}
			else {
				// r이 "+-*/" 아니라면 남은 건 숫자
				// r을 숫자형으로 변환해서 저장
				result = Integer.parseInt(r);
			}
		}
		System.out.println(result);
	}
}

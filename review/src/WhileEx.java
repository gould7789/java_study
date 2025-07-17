import java.util.StringTokenizer;

public class WhileEx {
	public static void main(String[] args) {
		// for
		int result = 0;
		for (int i = 1; i < 10; i++) {
			result += 1;
		}
		
		String str = "3+1+2";
		StringTokenizer st = new StringTokenizer(str, "+");
		
		// while
		while(st.hasMoreTokens()) {
			String r = st.nextToken();	// 분리된 값 가져오기
			System.out.println(r);
		}
	}

}

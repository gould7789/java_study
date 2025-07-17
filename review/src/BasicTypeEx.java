
public class BasicTypeEx {

	public static void main(String[] args) {
		// static 메소드 : 메모리에 올리지 않고도 메소드 사용 가능
				Math.random();
				
				// 정수형: 암묵적으로 int 기본
				int x  = 0;
				
				// 실수형: 명시적으로 default 타입은 double
				double d = 0.1;
				float f = 0.1f;
				
				// 문자형 : char
				char c = 'A';
				System.out.println(c);
				c = 66;
				System.out.println(c);
				
				// boolean type
				boolean boo = true;
				
				// "="의 의미
				// xx의 값은 여전히 10
				int xx = 10;
				int yy = xx;
				yy = 100;
				
				int[] x1 = {10, 20, 30};
			}
		}

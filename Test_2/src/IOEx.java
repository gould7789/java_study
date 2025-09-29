import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx {
	public static void main(String[] args) throws IOException {
		//1. byte stream 사용
		// 파일에 데이터 쓰기
		FileOutputStream fos = new FileOutputStream("C://javatest/test.txt");
		
		// 버퍼
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		fos.write('a');
		fos.write('b');
		String str = "가나다あいうえお";
		// 문자열 -> 바이트배열 전환
		byte[] r = str.getBytes();
		
		bos.write(r); // 버퍼에 쌓기
		bos.flush(); // 버퍼에 쌓인 거 밀어내기
		
		
		// 파일에서 데이터 읽기
		FileInputStream fis =  new FileInputStream("C://javatest/test.txt");
		
		byte[] temp = new byte[1024];
		fis.read(temp);	// 1024바이트 읽기 -> temp에 저장
		
		// 바이트배열 -> 문자열 변환
		String msg = new String(temp);
		
		// 빈공백 제거 후 출력
		System.out.print(msg.trim());
		System.out.println("end");
	}
}

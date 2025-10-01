import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		
		// character stream 계열을 사용하여 파일에 읽고/쓰기
		FileWriter fw = new FileWriter("C://javatest/test.txt");
		fw.write("가나다ABC");
		fw.flush();
		
		FileReader fr = new FileReader("C://javatest/test.txt");
		int result = fr.read();
		System.out.println((char)result);
	}
}

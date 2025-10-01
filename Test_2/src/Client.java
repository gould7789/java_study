
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextField;

class ClientUI extends JFrame {
	JTextField jf;
	
	// Inner class(내부 클래스)
	class MyUIListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// callback method
			
			// TCP/IP network 통신
	        // Client 파트 소켓 생성
			try {
	        Socket client = new Socket("210.101.236.171", 8888);

	        // 쓰기 위한 실 뽑아내기
	        OutputStream os = client.getOutputStream();
	        // 입력창에 입력된 문자열 가져오기
	        String msg = jf.getText();
	        os.write(msg.getBytes("utf-8"));
	        jf.setText(""); // 입력창 초기화
	        
			} catch (Exception ignore) {
				System.out.println("돌아가라이");
			}
		}
	}
	
	public ClientUI() {
		jf = new JTextField(50);
		
		
		// 화면에 입력창 추가
		this.add(jf);
		// 리스너 객체화
		MyUIListener m = new MyUIListener();
		// 입력창에 리스너 달아주기
		jf.addActionListener(m);
		// 화면 크기 설정 
		setSize(300, 100);
		// 화면 실행 위치=
		setLocation(200, 200);
		// 강제 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면에 보여주기
		setVisible(true);
	}
}

public class Client {
    public static void main(String[] args) throws IOException {
    	new ClientUI();

    }

}


// ctrl + shift + o : import 단축키
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyListener2 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭 or 엔터키 입력시 호출되는 콜백메서드
		System.out.println("엔터키 입력");
	}
}

// 버튼 클릭 감시자 정의
class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// callback method : 프로그래머가 호출해주는 메소드 아닌 시스템이 호출해주는 메소드
		// 버튼이 클릭되었을 때 호출되는 메소드
		System.out.println("버튼이 클릭됨");
	}
}

//버튼 클릭 이벤트 처리
class MyFrame extends JFrame{
	JButton jb;
	// 한 줄 입력창
	JTextField jf;
	
	public MyFrame() {
		// 상위 클래스 생성자 호출 -> new JFrame("화면 이름");
		super("화면 이름");
		jb = new JButton("버튼 이름");
		// 15칸 한줄 입력창
		jf = new JTextField(15);
		
		// 화면 배치 관리자
		// 다양한 해상도를 가지는 디바이스에서 화면이 보여지게 되면
		// 절대좌표값으로 설정된 화면은 해상도마다 다르게 보일 수 있게됨
		// 따라서 다양한 해상도에서 일관된 화면을 보여주기 위해 UI 구성시 절대좌표값을 사용하지 않고
		// 대신 화면 배치관리자를 사용함
		
		// FlowLayout : 가장 기본적인 화면배치 관리자
		// 화면에 들어오는 순서대로 최소한의 크기로 배치
		FlowLayout layout = new FlowLayout();
		
		// 화면에 화면 배치관리자 설정
		this.setLayout(layout);
		
		// 버튼 클릭 감시자 객체화
		MyListener m = new MyListener();
		// 버튼에 감시자 달아주기
		jb.addActionListener(m);
		// 한 줄 입력창에 감시자 달아주기
		MyListener2 m2 = new MyListener2();
		jf.addActionListener(m2);
		
		// this -> 현재 클래스 생성자 호출, this는 생략 가능 = 현재 클래스의 메소드 호출
		// 화면에 버튼 추가
		this.add(jb);
		// 화면 크기 지정
		setSize(300, 300);
		// 화면 위치 지정
		setLocation(200, 200);
		// 강제 종료 활성화
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면을 보여주는 설정
		setVisible(true);
		// 화면에 입력창 추가
		add(jf);
	}
}

public class EventHandlingEx {
	public static void main(String[] args) {
		new MyFrame();
	}
}

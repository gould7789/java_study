import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// import 단축키 : ctrl + shift + o
// 들여쓰기 자동 조정 : ctrl + shift + f

// 계산기 화면
// has a 관계 : MyUI 클래스가 JFrame(판때기)를 가지고 있다
class MyUI {
	// 자바에서 화면 만들기
	// new Frame();

	// 화면 생성
	JFrame f;
	JTextField tf;	// 한 줄 입력창

	// 버튼 생성
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, cp, cm, cx, cd, cc, cr;

	public void Cal() {
		// 자바에서 화면 만들기
		// new Frame();
		f = new JFrame();	// 화면 생성
		tf = new JTextField(20);
		b0 = new JButton("0");		// 버튼 생성
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		cp = new JButton("+");
		cm = new JButton("-");
		cx = new JButton("x");
		cd = new JButton("%");
		cc = new JButton("C");
		cr = new JButton("=");

		
		// JFrame f = new JFrame(); 
		// JButton b0 = new JButton("0"); 
		// JButton b1 = new JButton("1");
		// JButton b2 = new JButton("2");
		
		// 화면 배치 관리자
		// FlowLayout : 배치되는 순서대로 최소한의 크기로 화면에 UI 배치
		FlowLayout layout = new FlowLayout();
		f.setLayout(layout); // 배치 관리자 설정
		// f.setLayout(null); // 배치 관리자 초기화

		// 숫자 0 버튼
		b0.setSize(50, 50);
		b0.setLocation(0, 0);

		// 숫자 1 버튼
		b1.setSize(50, 50);
		b1.setLocation(55, 0);
		// 숫자 2 버튼
		b2.setSize(50, 50);
		b2.setLocation(100, 0);
		// 숫자 3 버튼
		b3.setSize(50, 50);
		
		// 숫자 4 버튼
		b4.setSize(50, 50);
		
		// 숫자 5 버튼
		b5.setSize(50, 50);
		
		// 숫자 6 버튼
		b6.setSize(50, 50);
		
		// 숫자 7 버튼
		b7.setSize(50, 50);
		
		// 숫자 8 버튼
		b8.setSize(50, 50);
		
		// 숫자 9 버튼
		b9.setSize(50, 50);
		
		// + 버튼
		cp.setSize(50, 50);
		
		// - 버튼
		cm.setSize(50, 50);
		
		// x 버튼
		cx.setSize(50, 50);
		
		// % 버튼
		cd.setSize(50, 50);
		
		// C 버튼
		cc.setSize(50, 50);
		
		// = 버튼
		cr.setSize(50, 50);

		// 버튼 추가
		f.add(tf);	// 한줄 입력창 추가
		f.add(b7); // 화면에 버튼 추가
		f.add(b8); 
		f.add(b9); 
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b0);
		f.add(cp);
		f.add(cm);
		f.add(cx);
		f.add(cd);
		f.add(cc);
		f.add(cr);
		

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제 종료 활성화
		f.setSize(300, 300); // 화면 크기 설정
		f.setLocation(500, 500); // 화면 위치 설정
		f.setVisible(true); // 화면에 보여주기
	}

}

// is a 관계 : MyUI2 클래스가 JFrame(판때기)을 상속받고 있다
class MyUI2 extends JFrame {
	JButton b0, b1;
	public MyUI2() {
		b0 = new JButton("0");
		b1 = new JButton("1");
		
		this.add(b0);	// this = 현재 클래스
		add(b1);		// this. 생략 가능
	}
}


public class UIEx {
	
	public static void main(String[] args) {
		MyUI ui = new MyUI();
		ui.Cal();

	}
}

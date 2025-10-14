import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 버튼 클릭 이벤트 처리를 위한 리스너
class MyListener implements ActionListener {
	JTextField jf;
	public MyListener(JTextField j) { // JTextField j = jf;
		jf = j;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 숫자 버튼, 사칙연산 버튼, clear 버튼, = 버튼 클릭에 대한 처리
		
		// 클릭된 버튼 이름 가져오기
		String str = e.getActionCommand();
		
		switch (str) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "+":
		case "-":
		case "*":
		case "%":
			jf.setText(jf.getText()+str);
			break;
		case "=":
			CalLogic c = new CalLogic();
			int result = c.doIt(jf.getText());
			jf.setText(result+"");
			break;
		case "C":
			jf.setText("");
			break;
		default:
			break;
		}
	}
}

public class CalUI extends JFrame {
	// 한 줄 입력창
	JTextField jf;
	// 0~9까지 숫자버튼
	JButton[] b;
	// 클리어 버튼 "C"
	JButton clear;
	// "=" 버튼
	JButton equal;
	// 사칙연산 버튼
	JButton add;
	JButton min;
	JButton mul;
	JButton div;
	
	public CalUI() {
		// 화면 이름 설정
		super("계산기");
		
		// 배치 관리자 객체화
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		// 한 줄 입력창
		jf = new JTextField(15);
		
		// 버튼 클릭 감시자 설정
		MyListener m = new MyListener(jf);
		
		// 한 줄 입력창 추가
		this.add(jf);
		
		// 버튼에 숫자 추가
		b = new JButton[10];
		for (int i=0; i<10; i++) {
			b[i] = new JButton(""+i); // 정수형을 문자형으로 바꾸는 쉬운 방법은 ""+정수 = "정수"
			this.add(b[i]);	
			// 숫자 버튼에 감시자 달아주기
			b[i].addActionListener(m);
		}
		
		// 사칙연산 버튼 추가
		add = new JButton("+");
		min = new JButton("-");
		mul = new JButton("*");
		div = new JButton("%");
		
		// 화면에 추가
		add(add);
		add(min);
		add(mul);
		add(div);
		
		// 리스터
		add.addActionListener(m);
		min.addActionListener(m);
		mul.addActionListener(m);
		div.addActionListener(m);
		
		// clear 버튼 추가
		clear = new JButton("C");
		clear.setBackground(Color.red);
		// 화면에 추가
		add(clear);
		// 감시자(리스너) 달아주기
		clear.addActionListener(m);
		
		// = 버튼 추가
		equal = new JButton("=");
		// 화면에 추가
		add(equal);
		// 리스너
		equal.addActionListener(m);
		
		
		//강제 종료 활성화
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 크기 설정
		setSize(350, 350);
		setLocation(250, 250);
		setVisible(true);
	}
}

package Ch18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI extends JFrame{
	GUI(String title){
		//frame
		super(title);
		setBounds(100,100,500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		// Component 참조변수명
		JTextArea area1 = new JTextArea();
//		area1.setBounds(10,10,100,300);
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(20,10,280,280);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(20,300,280,50);
		
		JButton btn1 = new JButton("파일로 저장");
		btn1.setBounds(320,10,140,40);
		
		JButton btn2 = new JButton("1 : 1 요청");
		btn2.setBounds(320,60,140,40);
		
		JButton btn3 = new JButton("대화기록보기");
		btn3.setBounds(320,110,140,40);
		
		JButton input = new JButton("입력");
		input.setBounds(320,305,140,40);
		// panel(Component)
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);
		//frame(panel)
		add(panel);
		// frame
		setVisible(true);
	}
}

public class C05Ex {

	public static void main(String[] args) {
		new GUI("Chatting Server");
	}	
}

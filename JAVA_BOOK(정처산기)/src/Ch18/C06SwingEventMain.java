package Ch18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C06GUI extends JFrame implements ActionListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;
	
	C06GUI(String title){
		
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
		
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(320,10,140,40);
		
		btn2 = new JButton("1 : 1 요청");
		btn2.setBounds(320,60,140,40);
		
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(320,110,140,40);
		
		input = new JButton("입력");
		input.setBounds(320,305,140,40);
		
		// eventListener add
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		System.out.println("클릭!");
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장 클릭");
		} else if(e.getSource()==btn2){
			System.out.println("1 : 1 요청 클릭");
		} else if(e.getSource()==btn3) {
			System.out.println("대화기록보기");
		} else if(e.getSource()==input) {
			System.out.println("입력");
		}
	}
}

public class C06SwingEventMain {

	public static void main(String[] args) {
		new C06GUI("Chatting UI");
	}	
}

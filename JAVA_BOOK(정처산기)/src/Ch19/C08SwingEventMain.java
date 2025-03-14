package Ch19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class C08GUI extends JFrame implements ActionListener, KeyListener, MouseListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;
	JTextField txt1;
	JTextArea area1;

	C08GUI(String title) {

		// frame
		super(title);
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Component 참조변수명
		area1 = new JTextArea();
//		area1.setBounds(10,10,100,300);
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(20, 10, 280, 280);

		txt1 = new JTextField();
		txt1.setBounds(20, 300, 280, 50);

		btn1 = new JButton("파일로 저장");
		btn1.setBounds(320, 10, 140, 40);

		btn2 = new JButton("1 : 1 요청"); 
		btn2.setBounds(320, 60, 140, 40);

		btn3 = new JButton("대화기록보기");
		btn3.setBounds(320, 110, 140, 40);

		input = new JButton("입력");
		input.setBounds(320, 305, 140, 40);

		// eventListener add
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);
		txt1.addKeyListener(this);
		area1.addMouseListener(this);

		// panel(Component)
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);

		// frame(panel)
		add(panel);

		// frame
		setVisible(true);
	}

	// button Event
	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println("클릭!");
		if (e.getSource() == btn1) {
			System.out.println("파일로 저장 클릭");
		} else if (e.getSource() == btn2) {
			System.out.println("1 : 1 요청 클릭");
		} else if (e.getSource() == btn3) {
			System.out.println("대화기록보기");
		} else if (e.getSource() == input) {
			System.out.println("입력");
		}
	}

	// key event
	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped..." + e.getKeyChar());	
//		System.out.println("keyTyped..." + e.getKeyCode());	
	}

	@Override
	public void keyPressed(KeyEvent e) { // 아스키코드만 적용 됨
//		System.out.println("keyPressed..." + e.getKeyChar());
		System.out.println("keyPressed..." + e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				String message = txt1.getText();
				System.out.println(message);
				area1.append(message + "\n");
				txt1.setText("");
			}
		}
	}

	// mouse event
	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased..." + e.getKeyChar());	
//		System.out.println("keyReleased..." + e.getKeyCode());	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
//			System.out.println("mouseClicked..." + e.getPoint());
			int offset = area1.viewToModel(e.getPoint());				// 열
//			System.out.println("mouseClicked...offset : " + offset);
			int row = area1.getLineOfOffset(offset);					// 행
//			System.out.println("mouseClicked...row : " + row);
			int startOffset = area1.getLineStartOffset(row); 
			int endOffset = area1.getLineEndOffset(row);
//			System.out.printf("%d %d\n", startOffset,endOffset);
			String str = area1.getText(startOffset, endOffset-startOffset);
			System.out.println(str);
			
		} catch (BadLocationException e1) {
			
			e1.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}

public class C08SwingEventMain {

	public static void main(String[] args) {
		new C08GUI("Chatting UI");
	}
}

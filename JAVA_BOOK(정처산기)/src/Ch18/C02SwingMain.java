package Ch18;

import javax.swing.JFrame;

class C02GUI extends JFrame{			// 객체만 만들면 됨
	C02GUI(String title){
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C02SwingMain {

	public static void main(String[] args) {
		
		new C02GUI("두번째 프레임입니다");
		
//		JFrame frame = new JFrame("첫번째 프레임입니다");
//		frame.setBounds(100,100,500,500);					//(x,y,width,height)
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
		
	}
	
}

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
	static JLabel label;
	static JLabel info;
	double result = 0;
	String math = "";
	double num = 0;
	String tostring = "";
	
	public Calc() {
		setTitle("계산기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임에서 컨텐츠 영역을 가져와서 거기다가 버튼을 붙이는 것 
		//프레임에 구성요소를 붙일때 번거롭더라도 중간에 getContentPane()을 넣어줘야함.
		Container MyCon = getContentPane();
		MyCon.setLayout(new BorderLayout(5,5));
		MyCon.setBackground(Color.LIGHT_GRAY);
		
		UpPanel UP = new UpPanel();
		MyCon.add(UP, BorderLayout.EAST);
		DownPanel DP = new DownPanel();
		MyCon.add(DP, BorderLayout.SOUTH);
		
		setSize(350,600);
		setVisible(true);
		
	}
	
	class UpPanel extends JPanel() {
		public UpPanel() {
			
		}
		
	}
	
	class DownPanel extends JPanel() {
		public DownPanel() {
			
		}
	}

}

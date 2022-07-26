import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListenerEx extends JFrame{
	
	private JLabel lblNum;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnReset;
	
	public ActionListenerEx() { //initializer
		init();
		setDisplay();
		addListener();
		showFrame();
	}

	private void init() {
		// TODO Auto-generated method stub
		lblNum = new JLabel("0", JLabel.CENTER);
		lblNum.setText("0");
		lblNum.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		
		btnPlus = new JButton();
		btnPlus.setText("Plus");
		btnMinus = new JButton();
		btnMinus.setText("Minus");
		btnReset = new JButton();
		btnReset.setText("Reset");
		
		
	}
	private void setDisplay() {
		// TODO Auto-generated method stub
		
		JPanel pnlSouth = new JPanel(new GridLayout(1,0));
		pnlSouth.add(btnPlus);
		pnlSouth.add(btnMinus);
		pnlSouth.add(btnReset);
		
		add(lblNum, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
		
	}
	private void addListener() {
		// TODO Auto-generated method stub
		
		ActionListener listener = new ActionListener() {

			@Override //java에서 getSource()를 호출하면 이벤트가 발생한 객체에 대한 참조를 리턴 
			public void actionPerformed(ActionEvent ae) { //action event ae
				// TODO Auto-generated method stub
				if(btnPlus.equals(ae.getSource())) {  //button이 눌렸을때 
					
					String strNum = lblNum.getText();
					int num = Integer.parseInt(strNum);
					num++;
					
					strNum = String.valueOf(num);
					lblNum.setText(strNum);
				}
				
				if(btnMinus.equals(ae.getSource())) {
					String strNum = lblNum.getText();
					int num = Integer.parseInt(strNum);
					num--;
					
					strNum = String.valueOf(num);
					lblNum.setText(strNum);
				}
				
				if(btnReset.equals(ae.getSource())) {
					lblNum.setText("0");
				}
			}
			
		};
		
		btnPlus.addActionListener(listener);
        btnMinus.addActionListener(listener);
        btnReset.addActionListener(listener);
		
	}
	private void showFrame() {
		// TODO Auto-generated method stub
		
		setTitle("Counter");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ActionListenerEx();
	}

}

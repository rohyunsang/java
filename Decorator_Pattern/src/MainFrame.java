import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {
	JButton[] buttons = new JButton[9];
	Hamburger hamburger = new EmptyHamburger();
	
	
	JPanel displayPanel = new JPanel(new BorderLayout());
	displayPanel.add(hamburger);
	
	button[0] = new JButton("BeefPatty");
	button[0].addActionListener(this);
	button[1] = new JButton("ChickenPatty");
	button[1].addActionListener(this);
	button[2] = new JButton("ShrimpPatty");
	button[2].addActionListener(this);
	
	button[3] = new JButton("CheeseTopping");
	button[3].addActionListener(this);
	button[4] = new JButton("LettuceTopping");
	button[4].addActionListener(this);
	button[5] = new JButton("OnionTopping");
	button[5].addActionListener(this);
	button[6] = new JButton("TomatoTopping");
	button[6].addActionListener(this);
	
	button[7] = new JButton("Start Stack Burger");
	button[7].addActionListener(this);
	button[8] = new JButton("Finish");
	button[8].addActionListener(this);
	
	JPanel buttonPanel = new JPanel(new GridLayout(3,1));
	JPanel buttonPanel2 = new JPanel(new GridLayout(4,1));
	JPanel buttonPanel3 = new JPanel(new GridLayout(2,1));
	

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		
	}
	

}

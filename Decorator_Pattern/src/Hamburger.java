import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public abstract class Hamburger extends JPanel {
	
	String description;
	
	abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void paintComponent(Graphics g) {
		
	}
}

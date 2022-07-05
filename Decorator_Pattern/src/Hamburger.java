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
}

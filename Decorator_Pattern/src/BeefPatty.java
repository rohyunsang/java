import java.awt.Graphics;
import java.awt.Graphics2D;

public class BeefPatty extends HamburgerIngredient{

	Hamburger hamburger;
	
	@Override
	double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void paintComponent(Graphics g) {
		hamburger.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		if(image != null) g2.drawImage(image, 125,150,330,300,this);
		
	}

}

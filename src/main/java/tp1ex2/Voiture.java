package tp1ex2;
import javax.swing.*;
import java.awt.*;

public class Voiture extends Thread {

	private JLabel label;
	private int x;
	private int vitesse;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public Voiture(String image) {
		label = new JLabel();
		label.setIcon(new ImageIcon(image));
	}
	
	
	public JLabel getLabel() {
		return label;
	}



	public void setLabel(JLabel label) {
		this.label = label;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getVitesse() {
		return vitesse;
	}



	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	@Override
	public void run() {
		while(true) {
			
			if(label.getX()>screenSize.width) {
				x = 0;
			}else {

				try {
					x = x + vitesse;
					sleep(1000/vitesse);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			label.setLocation(x, (int)label.getLocation().getY());
		}//fin while
		
	}//fin run
	
}

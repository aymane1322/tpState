package tp1ex2;
import java.awt.*;
import javax.swing.*;

public class Piste extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setOpaque(false);
		
		ImageIcon image = new ImageIcon("Pist2.png");
		g.drawImage(image.getImage(),0,0,this);
	}
}

package tp1ex2;
import javax.swing.*;
import java.util.List;
import java.util.*;
import java.awt.*;


public class Circuit extends JFrame{
	
	private List<Voiture> voitures ;
	
	public Circuit() {
		voitures = new ArrayList<Voiture>();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public void ajouterVoiture(Voiture v) {
		voitures.add(v);
	}
	
	public void afficherCircuit() {
		this.setLayout(new GridLayout(voitures.size(),1));
		
		for (Voiture v : voitures) {
			Piste piste = new Piste();
			piste.add(v.getLabel());
			this.getContentPane().add(piste);
		}
		
		setVisible(true);
		
		for (Voiture v : voitures) {
			v.start();
		}
	}
}

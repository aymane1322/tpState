package tp1ex2;

public class Course {

	public static void main(String[] args) {
		
		Circuit c = new Circuit();
		
		Voiture v1 = new Voiture("CAR.png");
		Voiture v2 = new Voiture("CAR.png");
		Voiture v3 = new Voiture("CAR.png");
		
		v1.setVitesse(90);
		v2.setVitesse(8);
		v3.setVitesse(5);
		
		c.ajouterVoiture(v1);
		c.ajouterVoiture(v2);
		c.ajouterVoiture(v3);
		
		
		c.afficherCircuit();
		
		

	}

}

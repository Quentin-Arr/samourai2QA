package personnages.principaux;

import annexes.guerrier;
import personnages.humain;

public class samourai extends ronin implements guerrier{

	private String seigneur;
	
	public samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur=seigneur;
	}
	
	public void boire (String boisson) {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}

	@Override
	public void direBonjour() {
			super.direBonjour();
			parler("Je sers mon maitre, le seigneur "+this.seigneur);
	}

	@Override
	public void combattre(humain h) {
		parler("Je combat bla bla");
	}
	
}

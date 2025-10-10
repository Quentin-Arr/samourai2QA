package personnages.principaux;

import personnages.humain;

public class commercant extends humain{
	
	public commercant (String nom, int argent) {
		super(nom,argent,"thé");
	}
	
	public int seFaireExtorquer() {
		int argent=getArgent();
		perdreArgent(argent);
		parler("Le monde est vraiment trop injuste BAKAAA");
		return argent;
	}
	
	public void recevoirArgent(int n) {
		gagnerArgent(n);
		parler("Arigato Kosaimasu !!!");
	}
}

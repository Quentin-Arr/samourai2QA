package secondaires;

import personnages.principaux.*;


public class colporteur extends commercant {

	public colporteur(String nom, int argent) {
		super(nom, argent);
		
	}

	public int seFaireExtorquer() {
		int argent=getArgent()/2;
		perdreArgent(argent);
		parler("Hahahaha si il savait que je ne lui est donné que la moitié");
		return argent;
	}
	
}

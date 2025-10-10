package personnages.principaux;

import personnages.humain;

public class ronin extends humain{
	
	private int honneur;
	
	public ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	public void donnerArgent(commercant c, int argent) {
		perdreArgent(argent);
		parler("Tenez mon brave.");
		c.recevoirArgent(argent);
	}
	
	public void provoquer(yakusa yk) {
		if ((honneur*2)>yk.getReputation()) {
			gagnerArgent(yk.perdreDuel());
			honneur+=1;
			parler("Tes vices te perdront, tu es defait "+yk.getNom());
		}
		else {
			yk.gagnerDuel();
			honneur-=1;
			parler("Je suis défait, tu n'as aucune pitié");
		}
	}
}

package personnages.principaux;

import personnages.humain;

public class yakusa extends humain {
	
	private String clan;
	private int reputation;

	public yakusa(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(commercant c) {
		gagnerArgent(c.seFaireExtorquer());
		reputation+=1;
		parler("J'ai volé le commerçant "+c.getNom()+"-san itadakimasu !!!");
	}
	
	public void gagnerDuel() {
		reputation+=1;
		parler("Je suis on fire j'ai battu un ronin en duel !!!");
	}
	
	public int perdreDuel() {
		reputation-=1;
		int argent=getArgent();
		perdreArgent(argent);
		parler("J'ai perdu contre ronin-sama, je suis faible BAKAAA");
		return argent;
	}
	
}

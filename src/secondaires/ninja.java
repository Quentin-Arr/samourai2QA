package secondaires;

import java.util.Random;

import annexes.clanNinja;
import personnages.principaux.*;

public class ninja extends yakusa {

	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private static final int limite = 50;
	private commercant memoire;
	
	public ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		this.clanSecret=this.getClan()+" "+clanNinja.getClan();
	}
	
	@Override
	public void direBonjour(){
		super.direBonjour();
		parler("(mon clan secret est "+this.clanSecret+" et maintenant que tu le sais, je vais devoir te tuer)");
	}
	
	@Override
	public void extorquer(commercant c) {
		int nb = new Random().nextInt(2) + 1;
		switch(nb) {
		case 1 -> super.extorquer(c);
		case 2 -> extorquerMefiant(c);
		}
	}
	
	private void extorquerMefiant(commercant c) {
		int i = c.seFaireExtorquer();
		int j = this.getArgent();
		int k = this.getArgent();
		if(i<limite) {
			memoire=c;	
			gagnerArgent(i);
			parler("Je reviendrais");
			while(this.getArgent()<j+limite&&this.getArgent()!=k) {
				revenirExtorquer();
				k=this.getArgent();
			}
		}
		else {
			gagnerArgent(i);
		}
	}
		
	public void revenirExtorquer() {
		parler("Je t'ai dit que je reviendrais");
			gagnerArgent(memoire.seFaireExtorquer());
	}
}

package secondaires;

import java.util.Random;

import personnages.principaux.*;

public class ninja extends yakusa {

	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		int nb = new Random().nextInt((5 - 1)) + 1; 
		switch (nb) {
		case 1 -> this.clanSecret=this.getClan()+" "+clansNinja[0];
		case 2 -> this.clanSecret=this.getClan()+" "+clansNinja[1];
		case 3 -> this.clanSecret=this.getClan()+" "+clansNinja[2];
		case 4 -> this.clanSecret=this.getClan()+" "+clansNinja[3];
		case 5 -> this.clanSecret=this.getClan()+" "+clansNinja[4];
		}
	}
	
	@Override
	public void direBonjour(){
		super.direBonjour();
		parler("(mon clan secret est "+this.clanSecret+" et maintenant que tu le sais, je vais devoir te tuer)");
	}

}

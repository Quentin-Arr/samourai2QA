package secondaires;

import java.util.Random;
import personnages.*;

public class grandmere extends humain {

	private humain [] memoire = new humain [30];
	private int indice = 0;
	
	public grandmere(String nom, int argent) {
		super(nom, argent, "tisane");
	}

	private String humainHasard() {
		int nb = new Random().nextInt((5 - 1)) + 1; 
		switch (nb) {
			case 1: {
				return "humain";
			}
			case 2: {
				return "commercant";
			}
			case 3: {
				return "yakusa";
			}
			case 4: {
				return "ronin";
			}
			case 5: {
				return "samourai";
			}
			default : {
				return "humain";
			}
		}
	}
	
	public void faireConnaissance(humain h) {
		if (indice<29) {
			int check=0;
			for (int i=0;i<=indice;i++) {
				if (h==memoire[i]) {
					check=1;
				}
			}
			if (check==0) {
				memoire[indice]=h;
				indice+=1;
			}
			else {
				parler("Ma mémoire me joue peut etre un tour mais je connais déja cette personne");
			}
		}
		else {
			parler ("Je me fait trop vieille pour retenir tous ces gens");
		}
		
	}
	
	public void ragoter() {
		for (int i=0;i<=indice;i++) {
			if(memoire[i] instanceof traitre) {
				parler("Je suis certaines que "+memoire[i].getNom()+" est un traitre");
			}
			else {
				parler("Je pense que "+memoire[i].getNom()+"est un "+humainHasard());
			}
		}
	}
	
}
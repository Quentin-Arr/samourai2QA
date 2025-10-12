package secondaires;

import personnages.principaux.*;
import personnages.humain;

public class traitre extends samourai{

	public float traitrise=0.0f;	
	
	public traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
	}

	public void extorquer(commercant c) {
		if (traitrise<3.0) {
			gagnerArgent(c.seFaireExtorquer());
			traitrise+=1;
			parler("AHAHAHA je t'ai bien eu "+c.getNom()+"-san itadakimasu !!!");
		}
		else {
			parler("Je ne peux pas plus voler, les gens savent que je suis un traitre");
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("(Cette individu cache quelque chose vous evaluriez son indice de tratrise à "+this.traitrise+" )");
	}
	
	public void donnerArgent(int argent, humain h) {
		perdreArgent(argent);
		parler("J'essaye de me racheter, je regrette certains crimes que j'ai commis");
		if (h instanceof commercant) {
			((commercant)h).recevoirArgent(argent);
		}
		else {
			h.gagnerArgent(argent);
			}
		this.traitrise=this.traitrise-((1/10)*argent);
	}
}

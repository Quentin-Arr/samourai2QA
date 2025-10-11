package personnages.principaux;

public class samourai extends ronin{

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
	
}

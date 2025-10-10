package personnages;

public class humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public humain (String nom, int argent, String boisson) {
		this.nom=nom;
		this.argent=argent;
		this.boisson=boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
		
	public void parler (String texte) {
		System.out.println(this.nom+" : "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour je m'appelle "+this.nom+" et j'adore boire : "+this.boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de "+this.boisson+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int n) {
		this.argent+=n;
	}
	
	public void perdreArgent(int n) {
		this.argent-=n;
	}
}

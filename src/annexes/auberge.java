package annexes;

import personnages.humain;

public class auberge {
	
	private String nom;
	private humain[] clients;
	
	public auberge(String nom, int capacite) {
		this.nom=nom;
		this.clients=new humain[capacite];
	}
	
	public void nouvelArrivant(humain h) {
		h.direBonjour();
		for (int i =0; i<clients.length; i++) {
			if(clients[i]==null) {
				clients[i]=h;
			}
			else {
				clients[i].direBonjour();
			}
		}
	}
	
	public void partir(humain h) {
		for (int i =0; i<clients.length; i++) {
			if(clients[i]==h) {
				clients[i]=null;
			}
		}
	}
	
	public void payerTournee(humain h) {
		int count = 0;
		for (int i = 0; i < clients.length; i++) {
		    if (clients[i] != null) {
		    	clients[i].boire();
		        count++;
		    }
		}
		h.perdreArgent(count*2);
	}
}

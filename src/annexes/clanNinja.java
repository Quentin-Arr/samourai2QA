package annexes;
import java.util.Random;

public class clanNinja {
	
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private String clanNinja;
	
	public String[] getClans() {
		return clansNinja;
	}
	
	public static String getClan() {
		String clan = null;
		int nb = new Random().nextInt(5) + 1;
		switch (nb) {
		case 1 -> clan=clansNinja[0];
		case 2 -> clan=clansNinja[1];
		case 3 -> clan=clansNinja[2];
		case 4 -> clan=clansNinja[3];
		case 5 -> clan=clansNinja[4];
		}
		return clan;
	}
}

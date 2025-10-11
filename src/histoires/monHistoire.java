package histoires;

import personnages.*;
import personnages.principaux.*;

public class monHistoire {
	
	public static void main(String [] args) {    
		  humain humain1 = new humain("Prof", 10, "Porto");
		  humain1.direBonjour();
		  humain1.boire();
		  commercant commercant = new commercant("Marchand", 35);
		  commercant.direBonjour();
		  yakusa yakusa = new yakusa("Yaku␣le␣noir", 42,"biere", "WarSong");
		  yakusa.direBonjour();
		  yakusa.extorquer(commercant);
		  ronin ronin1 = new ronin("Roro", 61, "sake");
		  ronin1.donnerArgent(10, commercant );
		  ronin1.provoquer(yakusa);
		  ronin1.direBonjour();
		  
		  //Test Surcharge
		  
		  samourai samourai1 = new samourai("Ichigo", 18,"soda","Soul Society");
		  ronin ronin2 = new samourai("Jin Sakai", 30, "Whisky", "Shimura");
		  samourai1.boire("vin");
		  ronin2.boire();
		  ((samourai)ronin2).boire("vin");
		  samourai1.direBonjour();
		  ronin2.direBonjour();
		  
		}


}

package formation.xp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                    System.out.println("init");
                    int nbrJoueur =2;
                    String[] nomJoueur ={"Majd","Bilel"};
                    int[] montantJoueur ={100,200};
        	    Partie instance=new Partie();
                    instance.init(nbrJoueur, nomJoueur, montantJoueur);
                    instance.piocheInitiale();
                    Joueur joueur1 = instance.getJoueurs().get(0);
                    System.out.println(joueur1.voirMesCartes().get(0).value);
	}
}

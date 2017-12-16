package formation.xp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                    int nbrJoueur =4;
                    String[] nomJoueur ={"Majd","Bilel","Hassin","Ali"};
                    int[] montantJoueur ={1000,2000,500,1000};
                    Partie.init(nbrJoueur, nomJoueur, montantJoueur);
                    Partie.piocheInitiale();

                    //Joueur joueur1 = instance.getJoueurs().get(0);
                    //System.out.println(joueur1.voirMesCartes().get(0).value);

                    Joueur joueur1 = Partie.getJoueurs().get(0);
                    Joueur joueur2 = Partie.getJoueurs().get(1);
                    System.out.println(joueur1.voirMesCartes().get(0).color);
                    joueur1.miser(50);
                    joueur2.miser(60);
                    System.out.println(Partie.getMiseTotale());
                    
                    

	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rebai
 */
public class Partie {
    private Carte[] tapis=new Carte[3];
    private int miseTotale;
    private int dernierMise;
    private int nbrJoueur;
    private List<Joueur> joueurs = new ArrayList<Joueur>();

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }
    

    public void setDernierMise(int dernierMise) {
        this.dernierMise = dernierMise;
    }

    public void setMiseTotale(int miseTotale) {
        this.miseTotale = miseTotale;
    }

    public void setNbrJoueur(int nbrJoueur) {
        this.nbrJoueur = nbrJoueur;
    }

    public void setTapis(Carte[] tapis) {
        this.tapis = tapis;
    }

    public int getDernierMise() {
        return dernierMise;
    }

    public int getMiseTotale() {
        return miseTotale;
    }

    public int getNbrJoueur() {
        return nbrJoueur;
    }

    public Carte[] getTapis() {
        return tapis;
    }

    public Partie(int miseTotale, int dernierMise, int nbrJoueur) {
        this.miseTotale = miseTotale;
        this.dernierMise = dernierMise;
        this.nbrJoueur = nbrJoueur;
    }

   public void init(){
       System.out.println("Bienvenu au jeu Poker! ");
                //initialisatiion d'une partie avec une miseTotale=0 et derniereMise=0 et nobre de joueur introduit par les joueurs
                System.out.println("Veuillez saisir le nombre de joueurs:");
                Scanner sc= new Scanner(System.in);
                String nbrJoueur = sc.nextLine();
                Partie test=new Partie(0,0,Integer.parseInt(nbrJoueur));
                
                for (int i=0; i<Integer.parseInt(nbrJoueur);i++){
                    //introduire le nom de joueur
                    System.out.println("Veuillez saisir le nom du joueur "+i);
                    String nom= sc.nextLine();
                    // introduir la cave du joueur
                    System.out.println("Veuillez saisir le montant du joueur "+i);
                    int montant= Integer.parseInt(sc.nextLine());
                    
                    
                }
   }
    
}

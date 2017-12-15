/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import java.util.ArrayList;
import java.util.List;

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

   
    
}

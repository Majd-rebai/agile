/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rebai
 */
public class Joueur {
    private String nom;
    private int montant;
    private Map<Integer, Integer> cave= new HashMap<Integer, Integer>();
    private Carte[] main =new Carte[2];

    public Map<Integer, Integer> getCave() {
        return cave;
    }

    public Carte[] getMain() {
        return main;
    }

    public String getNom() {
        return nom;
    }

    public void setCave(Map<Integer, Integer> cave) {
        this.cave = cave;
    }

    public void setMain(Carte[] main) {
        this.main = main;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   
    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Joueur(String nom, int montant) {
        this.nom = nom;
        this.montant = montant;
    }

    
    
    
    
    
   
    
}

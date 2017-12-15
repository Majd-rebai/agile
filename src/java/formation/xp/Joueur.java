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

    public Joueur(String nom) {
        this.nom = nom;
    }
    
    
   
    
}

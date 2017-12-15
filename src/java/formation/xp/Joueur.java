/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rebai
 */
public class Joueur {
    private String nom;
    private int montant;
    private int miseAct;
    private boolean exclu;
    private Map<Integer, Integer> cave= new HashMap<Integer, Integer>();
    private ArrayList <Carte> main = new ArrayList <Carte>();

    public Map<Integer, Integer> getCave() {
        return cave;
    }

    public ArrayList <Carte>  getMain() {
        return main;
    }

    public String getNom() {
        return nom;
    }

    public void setExclu(boolean exclu) {
        this.exclu = exclu;
    }

    public boolean isExclu() {
        return exclu;
    }

    public int getMiseAct() {
        return miseAct;
    }

    public void setMiseAct(int miseAct) {
        this.miseAct = miseAct;
    }

    public void setCave(Map<Integer, Integer> cave) {
        this.cave = cave;
    }

    public void setMain(ArrayList <Carte>  main) {
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

    public Joueur(String nom, int montant, int miseAct) {
        this.nom = nom;
        this.montant = montant;
        this.miseAct= miseAct;
        this.exclu= false;
    }

    
    
    
    public void miser(int m,Partie game){
        if (m<= this.getMontant()){
            this.setMontant(this.getMontant()-m);
            this.miseAct=m;
        }
        game.miserP(m);
    }
        
    public void suivre(int derniereMise, Partie game){
        miser(derniereMise,game);
        
        
    }
    public void faireTapis(Partie game){
        miser(this.getMontant(), game);
    }
    
<<<<<<< HEAD
    public void relancer(int mise, int derniereMise, Partie game){
        if (mise >= derniereMise){
            miser(mise, game);
        }
    }
    public void passer(){
        this.exclu=true;
    } 
    
    public int voirMaMiseAct(){
        return this.miseAct;
    }
    
 
    
    public ArrayList <Carte>  voirMesCartes(){
        return main;
=======
    public ArrayList<Carte>  voirMesCartes(){
           return main;
>>>>>>> v1
    }
}


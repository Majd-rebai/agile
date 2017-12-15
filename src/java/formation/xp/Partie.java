/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import formation.xp.Carte;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rebai
 */
public class Partie {
    private Carte[] tapis=new Carte[3];
    private static int miseTotale;
    private int dernierMise;
    private int nbrJoueur;
    private List<Joueur> joueurs = new ArrayList<Joueur>();
    private Deck deck;

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

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

    public static int getMiseTotale() {
        return miseTotale;
    }

    public int getNbrJoueur() {
        return nbrJoueur;
    }

    public Carte[] getTapis() {
        return tapis;
    }


   

   public void init(int nbrJoueur, String[] nomJoueur, int[] montantJoueur ){
       System.out.println("Bienvenu au jeu Poker! ");
                //initialisatiion d'une partie avec une miseTotale=0 et derniereMise=0 et nobre de joueur introduit par les joueurs
                //System.out.println("Veuillez saisir le nombre de joueurs:");
                //Scanner sc= new Scanner(System.in);
                //String nbrJoueur = sc.nextLine();
                //this.setNbrJoueur(Integer.parseInt(nbrJoueur));
                this.setDernierMise(0);
                this.setMiseTotale(0);
                this.setNbrJoueur(nbrJoueur);
                deck = new Deck();
                List<Joueur> listJoueur= new ArrayList<Joueur>();
                for (int i=0; i< nbrJoueur; i++){
                    Joueur joueur=new Joueur(nomJoueur[i],montantJoueur[i],0);
                    listJoueur.add(joueur);
                }
                this.joueurs=listJoueur;
                //for (int i=0; i<Integer.parseInt(nbrJoueur);i++){
                    //introduire le nom de joueur
                    //System.out.println("Veuillez saisir le nom du joueur "+i);
                    //String nom= sc.nextLine();
                    // introduir la cave du joueur
                    //System.out.println("Veuillez saisir le montant du joueur "+i);
                    //int montant= Integer.parseInt(sc.nextLine());
                    
                    //Joueur joueur=new Joueur(nom,montant);
                    //listJoueur.add(joueur);
                    
                     //this.joueurs=listJoueur;
    }
               
   
    public void piocheInitiale(){
        for (int i=0;i<nbrJoueur;i++){
       
            ArrayList <Carte> tmp = new ArrayList <Carte>();
            tmp.add(deck.Pioche());
            tmp.add(deck.Pioche());
            joueurs.get(i).setMain(tmp);
        }
    }
    

    public void miserP(int m){
        this.dernierMise=m;
        this.miseTotale=miseTotale+m;
    }


   public void faireAction(){
       int i=0;
       int tour=0;
       int restant=joueurs.size();
       while ( (i < joueurs.size()) && (restant>1) ){
           joueurs.get(i).etreExclu(dernierMise);
           if (joueurs.get(i).isExclu()) {
               restant-=1;
           }
       
           if ( joueurs.get(i).isExclu() == false){
               System.out.println("Vous ête le joueur: "+ joueurs.get(i).getNom() +"! Veuillez choisir une action:\nmiser\nsuivre\nrelancer\nfaireTapis\npasser");
               Scanner sc= new Scanner(System.in);
               String action = sc.nextLine();
               if (action.equals("miser")){
                       System.out.println("donner le montant de ta mise");
                       int mise=Integer.parseInt(sc.nextLine());
                       joueurs.get(i).miser(mise, this);
               }
                       
               if (action.equals("suivre")){
                   joueurs.get(i).suivre(dernierMise, this);
               }
                   
               if (action.equals("relance")){
                   
                   System.out.println("donner le montant de ta mise");
                   int mise=Integer.parseInt(sc.nextLine());
                   joueurs.get(i).relancer(mise, dernierMise, this);
               }
           
           
               if (action.equals("faireTapis")){
                   joueurs.get(i).faireTapis(this);
                   
               }
              
               
               if (action.equals("passer")){
                   joueurs.get(i).passer();
                   restant-=restant;
               }
       }
       i=i+1;
       if (i==joueurs.size()){
           i=0;
           tour+=1;
       }
 
   }

    
   }
}





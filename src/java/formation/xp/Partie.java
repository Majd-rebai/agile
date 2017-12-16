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

    private  static ArrayList<Carte> tapis = new ArrayList<Carte>();
    private  static int miseTotale;
    private  static int dernierMise=0;
    private  static int nbrJoueur;
    private  static List<Joueur> joueurs = new ArrayList<Joueur>();
    private  static Deck deck;
    private static int croupier = 0;

    public static int getCroupier() {
        return croupier;
    }

    public static void setCroupier(int croupier) {
        Partie.croupier = croupier;
    }

    public  static void setDeck(Deck deck) {
        Partie.deck = deck;

    }

    public static Deck getDeck() {
        return deck;
    }

    public  static void setJoueurs(List<Joueur> joueurs) {
        Partie.joueurs = joueurs;
    }

    public  static List<Joueur> getJoueurs() {
        return joueurs;
    }
    

    public  static void setDernierMise(int dernierMise) {
        Partie.dernierMise = dernierMise;
    }

    public  static void setMiseTotale(int miseTotale) {
        Partie.miseTotale = miseTotale;
    }

    public  static void setNbrJoueur(int nbrJoueur) {
        Partie.nbrJoueur = nbrJoueur;
    }

    public  static void setTapis(ArrayList<Carte> tapis) {
        Partie.tapis = tapis;
    }

    public  static int getDernierMise() {
        return dernierMise;
    }

    public static int getMiseTotale() {
        return miseTotale;
    }

    public  static int getNbrJoueur() {
        return nbrJoueur;
    }

    public  static ArrayList<Carte> getTapis() {
        return tapis;
    }



   

    public  static void initNbrJoueurs(String[] nomJoueur, int[] montantJoueur ){
        System.out.println("Veuillez saisir le nombre de joueurs:");
        Scanner sc= new Scanner(System.in);
        String nbrJoueurs = sc.nextLine();
        Partie.setNbrJoueur(Integer.parseInt(nbrJoueurs));  
        init(Partie.nbrJoueur,nomJoueur,montantJoueur);
    }



   public static void init(int nbrJoueur, String[] nomJoueur, int[] montantJoueur ){
                System.out.println("Bienvenu au jeu Poker! ");
                //initialisatiion d'une partie avec une miseTotale=0 et derniereMise=0 et nobre de joueur introduit par les joueurs
                //System.out.println("Veuillez saisir le nombre de joueurs:");
                //Scanner sc= new Scanner(System.in);
                //String nbrJoueur = sc.nextLine();
                //this.setNbrJoueur(Integer.parseInt(nbrJoueur));
                Partie.setDernierMise(0);
                Partie.setMiseTotale(0);
                Partie.setNbrJoueur(nbrJoueur);
                deck = new Deck();
                List<Joueur> listJoueur= new ArrayList<Joueur>();
                for (int i=0; i< nbrJoueur; i++){
                    Joueur joueur=new Joueur(nomJoueur[i],montantJoueur[i],0);
                    listJoueur.add(joueur);
                }
                Partie.joueurs=listJoueur;
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
               
   
    public static void piocheInitiale(){
        for (int i=0;i<nbrJoueur;i++){
       
            ArrayList <Carte> tmp = new ArrayList <Carte>();
            tmp.add(deck.Pioche());
            tmp.add(deck.Pioche());
            joueurs.get(i).setMain(tmp);
        }
    }
   
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";



    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    
   public static void Affichage(Joueur J, int debut){
        clearConsole();
        System.out.print("\nJoueurs : ");
        for (int i=0;i<joueurs.size();i++){
            if (joueurs.get((debut+i)%joueurs.size()).isExclu()){
                System.out.print(COLOR_RED+joueurs.get((debut+i)%joueurs.size()).getNom()+COLOR_RESET+"  ");
            }
            else{
                if (J.getNom().equals(joueurs.get((debut+i)%joueurs.size()).getNom())){
                    System.out.print(COLOR_GREEN+joueurs.get((debut+i)%joueurs.size()).getNom()+COLOR_RESET+"  ");
                }
                else{
                    System.out.print(joueurs.get((debut+i)%joueurs.size()).getNom()+"  ");
                }
            }
        }
        System.out.print("\nTapis : ");
        for (int i=0;i<tapis.size();i++){
            System.out.print(tapis.get(i)+", ");
        }
        System.out.print("\nMise Totale : "+miseTotale);
        if (dernierMise != 0){
            System.out.print("\nDernière Mise : "+dernierMise);
        }
        System.out.print("\nMain : "+J.getMain().get(0)+", "+J.getMain().get(1));
        System.out.print("\nMontant disponible : " + J.getMontant() );
        System.out.print("\nChoisir une action : ");
        
   }
    
   public static void faireAction(){

       System.out.println(joueurs.get(croupier).getNom()+", vous êtes le croupier");
       System.out.println(joueurs.get((croupier+joueurs.size()-1)%joueurs.size()).getNom()+", choisir la petite mise");
       Scanner sc= new Scanner(System.in);
       int petiteBlind=Integer.parseInt(sc.nextLine());
       joueurs.get((croupier+joueurs.size()-1)%joueurs.size()).miser(petiteBlind);
       joueurs.get((croupier+joueurs.size()-2)%joueurs.size()).miser(petiteBlind*2);
       int i=(croupier+joueurs.size()-3)%joueurs.size();
       int tour=0;
       int k=0;
       int firstMise = 0;
       int restant=joueurs.size();
       piocheInitiale();
       boolean NotDone = true;
       while ( NotDone ){
           joueurs.get(i%joueurs.size()).etreExclu(dernierMise);
           if (joueurs.get(i%joueurs.size()).isExclu()) {
               restant-=1;
           }
       
           if ( joueurs.get(i%joueurs.size()).isExclu() == false){
               Affichage(joueurs.get(i%joueurs.size()),(croupier+joueurs.size()-3)%joueurs.size());
               //System.out.println("Vous ête le joueur: "+ joueurs.get(i%joueurs.size()).getNom() +"! Veuillez choisir une action:");
               if (firstMise!=0){
                   System.out.println("\tsuivre\trelancer\tfaireTapis\tpasser\n");
               }
               else{
                   System.out.println("\tmiser\n");
                   firstMise=1;
               }
               String action = sc.nextLine();
               if (action.equals("miser")){
                   int mise;
                   System.out.println("donner le montant de la mise");
                   mise=Integer.parseInt(sc.nextLine());
                   while (mise>joueurs.get(i%joueurs.size()).getMontant() || (mise<Partie.getDernierMise()) ){
                       System.out.println("donner le montant de la mise");
                       mise=Integer.parseInt(sc.nextLine());
                   }
                   joueurs.get(i%joueurs.size()).miser(mise);
                   
               }
                       
               if (action.equals("suivre")){
                   joueurs.get(i%joueurs.size()).suivre();
               }
                   
               if (action.equals("relance")){
                   
                   System.out.println("donner le montant de la mise");
                   int mise=Integer.parseInt(sc.nextLine());
                   joueurs.get(i%joueurs.size()).relancer(mise);
               }
           
           
               if (action.equals("faireTapis")){
                   joueurs.get(i%joueurs.size()).faireTapis();
                   
               }
              
               
               if (action.equals("passer")){
                   joueurs.get(i%joueurs.size()).passer();
                   restant-=restant;
               }

            }
            k=k+1;
            i=i+1;
            if (k==joueurs.size()){
                k=0;
                tapis.add(deck.Pioche());
                tour+=1;
                
            }
            if (tour == 5 || restant == 1){
                NotDone = false;
            }
        }
 
   }

    
   
   
   public static void finTour(int restant){
       if (restant == 1){
           
       }
       //Passage du croupier
       croupier = (croupier -1) % joueurs.size();
       tapis.clear();
       miseTotale = 0;
       dernierMise = 0;
       deck= new Deck();
       int montantMin = 500;    // Montant minimal pour accéder à la table est:montantMin
       for (int i=0; i< joueurs.size();i++){
           if (joueurs.get(i).getMontant() > montantMin){
               joueurs.get(i).setExclu(false);
               joueurs.get(i).clearMain();
           }
           else {
               // si le prochain croupier est exclu, le prochain croupier est celui à sa gauche
               if (i == croupier){
                   croupier = (croupier -1) % joueurs.size();
               }
               joueurs.remove(i);
               if (i<croupier){croupier = croupier-1;}
               i=i-1;            
           }
       }
       
       
   }

}





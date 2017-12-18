/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import formation.xp.Carte;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
                faireAction();
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
        System.out.print("\nEcrire le numérode l'action à faire : ");
        
   }
    
   public static void faireAction(){

    while(joueurs.size()>1){   
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
                   System.out.println("\t1)suivre\t2)relancer\t3)faireTapis\t4)passer\n");
               }
               else{
                   System.out.println("\t0)miser\t4)passer\n");
                   firstMise=1;
               }
               String action = sc.nextLine();
               if (action.equals("0")){
                   int mise;
                   System.out.println("donner le montant de la mise");
                   mise=Integer.parseInt(sc.nextLine());
                   while (mise>joueurs.get(i%joueurs.size()).getMontant() || (mise<Partie.getDernierMise()) ){
                       System.out.println("donner le montant de la mise");
                       mise=Integer.parseInt(sc.nextLine());
                   }
                   joueurs.get(i%joueurs.size()).miser(mise);
                   
               }
                       
               if (action.equals("1")){
                   joueurs.get(i%joueurs.size()).suivre();
               }
                   
               if (action.equals("2")){
                   
                   System.out.println("donner le montant de la mise");
                   int mise=Integer.parseInt(sc.nextLine());
                   joueurs.get(i%joueurs.size()).relancer(mise);
               }
           
           
               if (action.equals("3")){
                   joueurs.get(i%joueurs.size()).faireTapis();
                   
               }
              
               
               if (action.equals("4")){
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
       finTour(restant);
   }
   }

   public static int valueMain(ArrayList<Carte> Main, ArrayList<Carte> tapis1){
       // On ne va prendre en compte que les doubles et triples
       int Double=0;
       int Triple=0;
       List<Integer> tmpMain = new ArrayList<Integer>(); 
       for (int i=0; i<Main.size(); i++){
           tmpMain.add(Main.get(i).value);
       }
       for (int i=0; i<tapis1.size(); i++){
           tmpMain.add(tapis1.get(i).value);
       }
       Collections.sort(tmpMain);
       int tmp1=tmpMain.get(0);
       int tmp2=tmpMain.get(1);
       if (tmp1==tmp2) {Double++;}
       for (int i=2; i<7;i++){
           if (tmp2==tmp1 && tmp2==tmpMain.get(i)){
               Triple++;
           }
           if (tmp2==tmpMain.get(i)){
               Double++;
           }
           tmp1=tmp2;
           tmp2=tmpMain.get(i);
       }
       if (Triple != 0){
           return 100*Triple;
       }
       if (Double !=0){
           return 15*Double;
       }
       else {
           return tmpMain.get(6);
       }
   } 
   
   public static void diviserGain(){
       Map<Integer,Integer> MainFinal = new HashMap<Integer,Integer>();
       int max=0;
       int value;
       for (int i=0;i<joueurs.size();i++){
           if (!(joueurs.get(i).isExclu())){
               value = valueMain(joueurs.get(i).getMain(),tapis);
               if (value>max){max=value;}
               MainFinal.put(i,value);
           }
       }
       for(Iterator<Map.Entry<Integer,Integer>> it = MainFinal.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = it.next();
            if(entry.getValue() < max) {
                it.remove();
            }
        }
       System.out.print("Bravo ");
       int partMontant = (int)(miseTotale / MainFinal.size()); 
       for(Iterator<Map.Entry<Integer,Integer>> it = MainFinal.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = it.next();
            joueurs.get(entry.getKey()).setMontant(joueurs.get(entry.getKey()).getMontant()+partMontant);
            System.out.print(joueurs.get(entry.getKey()).getNom()+", ");
        }
        System.out.print("vous avez gagné la partie!!");
   }
   
   
   public static void finTour(int restant){
       if (restant == 1){
           for (int i=0;i<joueurs.size();i++){
               if (!(joueurs.get(i).isExclu())) {
                   System.out.print("Bravo "+joueurs.get(i).getNom()+", tu as gagné la partie!!");
                   joueurs.get(i).setMontant(joueurs.get(i).getMontant()+miseTotale);
               }
           }
       }
       else{
           diviserGain();
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





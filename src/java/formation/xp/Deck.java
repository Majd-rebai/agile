/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;
import formation.xp.Carte;
import formation.xp.Carte.Color;
import java.util.ArrayList;
/**
 *
 * @author oualha
 */
public class Deck {
    
    ArrayList<Carte> deck = new ArrayList<Carte>();
    public Deck(){
        for (int i=2;i<15;i++ ){
            Carte carte1 = new Carte(i,Color.PIQUE);
            deck.add(carte1);
            Carte carte2 = new Carte(i,Color.TREFLE);
            deck.add(carte2);
            Carte carte3 = new Carte(i,Color.COEUR);
            deck.add(carte3);
            Carte carte4 = new Carte(i,Color.CARREAU);
            deck.add(carte4);
        }
    }
    
    public Carte Pioche(){
        int ind = (int)(Math.random()*(deck.size()));
        Carte tmp = deck.get(ind);
        deck.remove(ind);
        return tmp;
    }
}

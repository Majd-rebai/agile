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
    
    ArrayList deck = new ArrayList<Carte>();
    public Deck(){
        for (int i=2;i<15;i++ ){
            Carte carte1 = new Carte(i,Color.PIQUE);
            deck.add(carte1);
            Carte carte2 = new Carte(i,Color.TREFLE);
            deck.add(carte2);
        }
    }
}

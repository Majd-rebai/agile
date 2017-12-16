/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rebai
 */
public class relancerTest {
    
    /**
     * Test of relance method, of class Joueur.
     */
    @Test
    public void testRelancer() {
        System.out.println("relancer");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        Partie.getJoueurs().get(0).miser(m);
        Partie.getJoueurs().get(1).relancer(300);
        assertEquals(300,Partie.getJoueurs().get(1).getMiseAct() );
        assertEquals(m+300,Partie.getMiseTotale());
    }
    
}

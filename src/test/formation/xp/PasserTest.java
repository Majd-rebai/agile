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
public class PasserTest {
    
    /**
     * Test of faire tapis method, of class Joueur.
     */
    @Test
    public void testPasser() {
        System.out.println("relancer");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        Partie.getJoueurs().get(0).passer();
        assertEquals(true,Partie.getJoueurs().get(0).isExclu());
    }
    
}

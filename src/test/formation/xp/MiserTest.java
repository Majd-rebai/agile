/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import junit.framework.TestCase;
import org.junit.Test;


/**
 *
 * @author rebai
 */
public class MiserTest extends TestCase{
    
   
   
    /**
     * Test of miser method, of class Joueur.
     */
    @Test
    public void testMiser() {
        System.out.println("miser");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        Partie.getJoueurs().get(0).miser(m);
        assertEquals(1000-m,Partie.getJoueurs().get(0).getMontant());
        assertEquals(Partie.getMiseTotale(), m);
        assertEquals(m,Partie.getJoueurs().get(0).getMiseAct());
    }
}

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
public class FaireTapisTest {
    
    /**
     * Test of faire tapis method, of class Joueur.
     */
    @Test
    public void testFaireTapis() {
        System.out.println("relancer");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        Partie.getJoueurs().get(0).faireTapis();
        assertEquals(0,Partie.getJoueurs().get(0).getMontant());
        assertEquals(Partie.getJoueurs().get(0).getMiseAct(),Partie.getDernierMise());
    }
    
}

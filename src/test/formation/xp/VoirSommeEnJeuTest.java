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
public class VoirSommeEnJeuTest {
    
    /**
     * Test of faire tapis method, of class Joueur.
     */
    @Test
    public void testVoirSommeEnJeu() {
        System.out.println("relancer");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int montant1 = 1000;
        int[] montantJoueur ={montant1,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        Joueur J1 = Partie.getJoueurs().get(0);
        Joueur J2 = Partie.getJoueurs().get(1);
        J1.miser(50);
        J2.miser(100);
        assertEquals(150,J1.voirSommeEnJeu());
    }
    
}

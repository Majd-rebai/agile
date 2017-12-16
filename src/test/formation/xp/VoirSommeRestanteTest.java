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
public class VoirSommeRestanteTest {
    
    /**
     * Test of faire tapis method, of class Joueur.
     */
    @Test
    public void testVoirSommeRestante() {
        System.out.println("relancer");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int montant1 = 1000;
        int[] montantJoueur ={montant1,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        int m1 = 400;

        Joueur J1 = Partie.getJoueurs().get(0);
        J1.miser(m1);
        assertEquals(montant1-m1,J1.voirSommeRestante());
    }
    
}

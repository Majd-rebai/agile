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
public class suivreTest extends TestCase{
    
   
   
    /**
     * Test of suivre method, of class Joueur.
     */
    @Test
    public void testSuivre() {
        System.out.println("suivre");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        Partie.getJoueurs().get(0).miser(m);
        Partie.getJoueurs().get(1).suivre();
        assertEquals(m,Partie.getJoueurs().get(1).getMiseAct());
        assertEquals(m+m,Partie.getMiseTotale());
    }
    }
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
     * Test of miser method, of class Joueur.
     */
    @Test
    public void testSuivre() {
        System.out.println("suivre");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie instanceP = new Partie();
        instanceP.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        instanceP.getJoueurs().get(0).miser(m);
        instanceP.getJoueurs().get(1).suivre();
        assertEquals(m,instanceP.getJoueurs().get(1).getMiseAct());
    }
    }
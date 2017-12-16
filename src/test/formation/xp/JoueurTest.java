/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import junit.framework.TestCase;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rebai
 */
public class JoueurTest extends TestCase{
    
   
   
    /**
     * Test of miser method, of class Joueur.
     */
    @Test
    public void testMiser() {
        System.out.println("miser");
        int nbrJoueur =3;
        String[] nomJoueur ={"Majd","Bilel","toto"};
        int[] montantJoueur ={1000,2000,100};
        Partie instanceP = new Partie();
        instanceP.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        instanceP.getJoueurs().get(0).miser(m);
        assertEquals(1000-m,instanceP.getJoueurs().get(0).getMontant());
        assertEquals(instanceP.getMiseTotale(), m);
        assertEquals(m,instanceP.getJoueurs().get(0).getMiseAct());

        //test relance
        instanceP.getJoueurs().get(0).relancer(300);
        assertEquals(instanceP.getDernierMise(),300);
        //test faireTapis
        instanceP.getJoueurs().get(0).faireTapis();
        assertEquals(0,instanceP.getJoueurs().get(0).getMontant());
        assertEquals(instanceP.getJoueurs().get(0).getMiseAct(),instanceP.getDernierMise());
        //test passer
        instanceP.getJoueurs().get(0).passer();
        assertEquals(true,instanceP.getJoueurs().get(0).isExclu());
        //test etreExclu
        instanceP.getJoueurs().get(2).etreExclu(instanceP.getDernierMise());
        assertEquals(true, instanceP.getJoueurs().get(2).isExclu());
        
        
        
        //test voirSommeRestante
        int m1 = 400;
        int montantDebut1=1000;
        Joueur J1 = new Joueur("toto1",montantDebut1,0);
        J1.miser(m1);
        assertEquals(montantDebut1-m1,J1.voirSommeRestante());
        
        //test voir Somme en jeu
        Partie P1 = new Partie();
        P1.init(nbrJoueur, nomJoueur, montantJoueur); 
        J1 = P1.getJoueurs().get(0);
        Joueur J2 = P1.getJoueurs().get(1);
        J1.miser(50);
        J2.miser(100);
        assertEquals(150,J1.voirSommeEnJeu());
    }
}

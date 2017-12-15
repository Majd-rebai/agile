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
        instanceP.getJoueurs().get(0).miser(m,instanceP);
        assertEquals(1000-m,instanceP.getJoueurs().get(0).getMontant());
        assertEquals(instanceP.getMiseTotale(), m);
        assertEquals(m,instanceP.getJoueurs().get(0).getMiseAct());
        //test suivre
        instanceP.getJoueurs().get(0).suivre(instanceP.getDernierMise(), instanceP);
        assertEquals(m,instanceP.getJoueurs().get(0).getMiseAct());
        //test relance
        instanceP.getJoueurs().get(0).relancer(300,instanceP.getDernierMise(), instanceP );
        assertEquals(instanceP.getDernierMise(),300);
        //test faireTapis
        instanceP.getJoueurs().get(0).faireTapis(instanceP);
        assertEquals(0,instanceP.getJoueurs().get(0).getMontant());
        assertEquals(instanceP.getJoueurs().get(0).getMiseAct(),instanceP.getDernierMise());
        //test passer
        instanceP.getJoueurs().get(0).passer();
        assertEquals(true,instanceP.getJoueurs().get(0).isExclu());
        //test etreExclu
        instanceP.getJoueurs().get(2).etreExclu(instanceP.getDernierMise());
        assertEquals(true, instanceP.getJoueurs().get(2).isExclu());
        
        
        
        
        
        
    }
}

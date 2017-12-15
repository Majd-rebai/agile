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
        int nbrJoueur =2;
        String[] nomJoueur ={"Majd","Bilel"};
        int[] montantJoueur ={1000,2000};
        Partie instanceP = new Partie();
        instanceP.init(nbrJoueur, nomJoueur, montantJoueur);
        int m = 200;
        int montantDebut=1000;
        Joueur instanceJ = new Joueur("toto",montantDebut,0);
        //test miser
        instanceJ.miser(m,instanceP);
        assertEquals(montantDebut-m,instanceJ.getMontant());
        assertEquals(instanceP.getMiseTotale(), m);
        assertEquals(m,instanceJ.getMiseAct());
        //test suivre
        instanceJ.suivre(instanceP.getDernierMise(), instanceP);
        assertEquals(m,instanceJ.getMiseAct());
        //test relance
        instanceJ.relancer(300,instanceP.getDernierMise(), instanceP );
        assertEquals(instanceP.getDernierMise(),300);
        //test faireTapis
        instanceJ.faireTapis(instanceP);
        assertEquals(0,instanceJ.getMontant());
        assertEquals(instanceJ.getMiseAct(),instanceP.getDernierMise());
        //test passer
        instanceJ.passer();
        assertEquals(true,instanceJ.isExclu());
        
        
        
        
    }
}

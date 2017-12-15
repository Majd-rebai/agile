/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oualha
 */
public class PartieTest {
    
    public PartieTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDeck method, of class Partie.
     */
    @Test
    public void testSetDeck() {
        System.out.println("setDeck");
        Deck deck = null;
        Partie instance = null;
        instance.setDeck(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Partie.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Partie instance = null;
        Deck expResult = null;
        Deck result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJoueurs method, of class Partie.
     */
    @Test
    public void testSetJoueurs() {
        System.out.println("setJoueurs");
        List<Joueur> joueurs = null;
        Partie instance = null;
        instance.setJoueurs(joueurs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoueurs method, of class Partie.
     */
    @Test
    public void testGetJoueurs() {
        System.out.println("getJoueurs");
        Partie instance = null;
        List expResult = null;
        List result = instance.getJoueurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDernierMise method, of class Partie.
     */
    @Test
    public void testSetDernierMise() {
        System.out.println("setDernierMise");
        int dernierMise = 0;
        Partie instance = null;
        instance.setDernierMise(dernierMise);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiseTotale method, of class Partie.
     */
    @Test
    public void testSetMiseTotale() {
        System.out.println("setMiseTotale");
        int miseTotale = 0;
        Partie instance = null;
        instance.setMiseTotale(miseTotale);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbrJoueur method, of class Partie.
     */
    @Test
    public void testSetNbrJoueur() {
        System.out.println("setNbrJoueur");
        int nbrJoueur = 0;
        Partie instance = null;
        instance.setNbrJoueur(nbrJoueur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTapis method, of class Partie.
     */
    @Test
    public void testSetTapis() {
        System.out.println("setTapis");
        Carte[] tapis = null;
        Partie instance = null;
        instance.setTapis(tapis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDernierMise method, of class Partie.
     */
    @Test
    public void testGetDernierMise() {
        System.out.println("getDernierMise");
        Partie instance = null;
        int expResult = 0;
        int result = instance.getDernierMise();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiseTotale method, of class Partie.
     */
    @Test
    public void testGetMiseTotale() {
        System.out.println("getMiseTotale");
        Partie instance = null;
        int expResult = 0;
        int result = instance.getMiseTotale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbrJoueur method, of class Partie.
     */
    @Test
    public void testGetNbrJoueur() {
        System.out.println("getNbrJoueur");
        Partie instance = null;
        int expResult = 0;
        int result = instance.getNbrJoueur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTapis method, of class Partie.
     */
    @Test
    public void testGetTapis() {
        System.out.println("getTapis");
        Partie instance = null;
        Carte[] expResult = null;
        Carte[] result = instance.getTapis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of piocheInitiale method, of class Partie.
     */
    @Test
    public void testPiocheInitiale() {
        System.out.println("piocheInitiale");
        Partie instance = null;
        instance.piocheInitiale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

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
        Partie par = new Partie(0,0,4);
    }
    
    @After
    public void tearDown() {
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

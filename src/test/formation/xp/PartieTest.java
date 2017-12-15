/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;


import junit.framework.TestCase;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class PartieTest extends TestCase{
    
    

    /**
     * Test of init method, of class Partie.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        int nbrJoueur =2;
        String[] nomJoueur ={"Majd","Bilel"};
        int[] montantJoueur ={100,200};
        Partie instance = new Partie();
        instance.init(nbrJoueur, nomJoueur, montantJoueur);
        assertEquals(2, instance.getNbrJoueur() ) ;

    }
}

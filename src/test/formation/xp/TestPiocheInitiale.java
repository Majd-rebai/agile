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
import java.util.ArrayList;


public class TestPiocheInitiale extends TestCase{
    
    

    /**
     * Test of init method, of class Partie.
     */
    @Test
    public void testPiocheInitiale() {
        
        int nbrJoueur =2;
        String[] nomJoueur ={"Majd","Bilel"};
        int[] montantJoueur ={100,200};
        Partie instance = new Partie();
        instance.init(nbrJoueur, nomJoueur, montantJoueur);
        instance.piocheInitiale();
        ArrayList <Carte>  main = instance.getJoueurs().get(0).getMain();
        assertEquals(2, main.size());

    }
}
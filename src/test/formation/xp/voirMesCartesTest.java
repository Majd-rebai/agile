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
/**
 *
 * @author bradai
 */
public class voirMesCartesTest extends TestCase {
    
    @Test
    public void testVoirMesCartes() {

        int nbrJoueur =2;
        String[] nomJoueur ={"Majd","Bilel"};
        int[] montantJoueur ={100,200};
        Partie instance = new Partie();
        instance.init(nbrJoueur, nomJoueur, montantJoueur);
        Joueur joueur1 = instance.getJoueurs().get(0);
        Carte[] main = joueur1.getMain();
        assertEquals(main, joueur1.voirMesCartes());
    }
}

package formation.xp;


import junit.framework.TestCase;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestNbJoueurs extends TestCase {
	@Test
	public void testNbJoueurs() {
            int nbrJoueur =2;
            String[] nomJoueur ={"Majd","Bilel"};
            int[] montantJoueur ={100,200};
            Partie instance = new Partie();
            instance.initNbrJoueurs(nomJoueur, montantJoueur);
            //insérer 2 sur la console
            assertEquals(2, instance.getJoueurs().size() ) ;
            
	}
}

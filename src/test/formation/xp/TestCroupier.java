package formation.xp;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCroupier extends TestCase {
	@Test
	public void test() {
            int nbrJoueur =2;
            String[] nomJoueur ={"Majd","Bilel"};
            int[] montantJoueur ={100,200};
            Partie instance = new Partie();
            instance.init(nbrJoueur, nomJoueur, montantJoueur);

	}
}
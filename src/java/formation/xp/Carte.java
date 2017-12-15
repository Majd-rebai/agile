/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

/**
 *
 * @author rebai
 */
public class Carte {
    public enum Color {
        TREFLE,
        PIQUE,
        COEUR,
        CARREAU
        ;
    }
    int value;
    Color color;
    Carte(int value,Color color){
        this.color=color;
        this.value=value;
    }
}

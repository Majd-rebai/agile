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
    @Override
    // voir mes cartes
    public String toString(){
        if (this.value<10){
            return ""+this.value+" "+this.color.name();
        }
        else{
            if (this.value == 11){
                return "J "+this.color.name();
            }
            if (this.value == 12){
                return "Q "+this.color.name();
            }
            if (this.value == 14){
                return "K "+this.color.name();
            }
            else{
                return "A "+this.color.name();
            }
        }
    }
}

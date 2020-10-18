import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Laba2{
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Crabrawler("Crabrawler_1", 2);
        Pokemon p2 = new Pokemon("Fighter", 1);
        Pokemon p3 = new Vileplume("Vileplume", 2);
        b.addAlly(p1);
        b.addFoe(p3);
        b.go();
    }


}

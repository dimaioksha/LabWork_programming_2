package pokemons;
import ru.ifmo.se.pokemon.Type;
import pokemons.Crabrawler;
import ru.ifmo.se.pokemon.Pokemon;
import skills.IceHammer;
public class Crabominable extends Crabrawler{
    public Crabominable(String name, int level){
        super(name, level);
        this.addType(Type.FIGHTING);
        this.addType(Type.ICE);
        this.addMove(new IceHammer());
        this.setStats(97.0d, 132.0d, 77.0d, 62.0d, 67.0d, 43.0d);
    }
    public Crabominable(){
        this("Crabominable", 1);
    }

}
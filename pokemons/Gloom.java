package pokemons;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.Oddish;
import skills.Absorb;
public class Gloom extends Oddish{
    public Gloom(String name, int level){
        super(name, level);
        this.addMove(new Absorb());
        this.setStats(60.0d, 65.0d, 70.0d, 85.0d, 75.0d, 40.0d);
    }
    public Gloom(){
        this("Gloom", 1);
    }

}
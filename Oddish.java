package pokemons;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import skills.Sludge;
import skills.Dazzling;
public class Oddish extends Pokemon{
    public Oddish(String name, int level){
        super(name, level);
        this.addType(Type.GRASS);
        this.addType(Type.POISON);
        this.addMove(new Sludge());
        this.addMove(new Dazzling());
        this.setStats(
            45.0d,
            50.0d,
            55.0d,
            75.0d,
            65.0d,
            30.0d
        );
    }
    public Oddish(){
        this("Oddish", 1);
    }
}
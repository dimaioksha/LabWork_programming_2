package pokemons;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import skills.Dizzy;
import skills.FrostBreath;
import skills.RockTomb;
public class Crabrawler extends Pokemon{

    public Crabrawler(String name, int level){
        super(name, level);
        this.addType(Type.FIGHTING);
        this.addMove(new Dizzy());
        this.addMove(new FrostBreath());
        this.addMove(new RockTomb());
        this.setStats(
            47.0d,
            82.0d,
            57.0d,
            42.0d,
            47.0d,
            63.0d
        );}

    public Crabrawler(){
        this("Crabrawler", 1);
    }
}
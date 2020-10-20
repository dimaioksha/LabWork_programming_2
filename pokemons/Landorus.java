package pokemons;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import skills.Sludge;
import skills.Hammer;
import skills.Focus;
public class Landorus extends Pokemon{
    public Landorus(String name, int level)
    {
        super(name, level);
        this.addType(Type.GROUND);
        this.addType(Type.FLYING);
        this.addMove(new Sludge());
        this.addMove(new Focus());
        this.addMove(new Hammer());
        this.setStats(
                89.0d,
                125.0d,
                90.0d,
                115.0d,
                80.0d,
                101.0d
        );
    }
    public Landorus() {this("Landorus", 1);}

}
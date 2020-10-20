package skills;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
public class Dazzling extends SpecialMove{
    public Dazzling(){
        super(Type.FAIRY, 60, 90);
    }
    @Override
    public String describe(){
        return "Dazzling Gleam!";
    }
}
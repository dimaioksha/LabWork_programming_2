package skills;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class Rock extends PhysicalMove{

    public Rock(){  
        super(Type.PSYCHIC, 50, 90);
    }
    @Override
    protected String describe(){
        return "Throw Rock!";
    }
}
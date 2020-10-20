package skills;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
public class RockTomb extends PhysicalMove{
    public RockTomb(){
        super(Type.PSYCHIC, 60, 95);
    }

    @Override
    public void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().chance(1).turns(-1).stat(Stat.SPEED, -1));

    }
    
    @Override
    public String describe(){
        return "RockTomb !";
    }

}
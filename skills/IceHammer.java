package skills;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
public class IceHammer extends PhysicalMove{
    public IceHammer(){
        super(Type.ICE, 100, 90);    
    }
    @Override
    public void applyOppEffects(Pokemon p){

        p.addEffect(new Effect().chance(1).turns(-1).stat(Stat.SPEED, -1));
    }
    @Override
    public String describe(){
        return "uses Ice Hammer!";
    }
}
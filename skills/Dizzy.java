package skills;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
public class Dizzy extends PhysicalMove{
    public Dizzy(){
        super(Type.PSYCHIC, 70, 100);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2).turns(-1);
        e.confuse(p);
    }
    @Override
    public String describe(){
        return "Dizzy Punch!";
    }
}
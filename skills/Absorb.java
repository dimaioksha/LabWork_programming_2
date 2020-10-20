package skills;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
public class Absorb extends SpecialMove{
    public Absorb(){
        super(Type.GRASS, 20,100);
    }
    @Override
    public void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.HP, (int)p.getHP() + 20);
        p.addEffect(e);
    }
    @Override
    public String describe(){
        return "Absorbing damage";
    }
}
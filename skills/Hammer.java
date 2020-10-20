package skills;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import  ru.ifmo.se.pokemon.Stat;
import  ru.ifmo.se.pokemon.Pokemon;
public class Hammer extends StatusMove{
    public Hammer(){
        super(Type.FIGHTING, 100, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) { 
        Effect e = new Effect().chance(0.5).turns(6).stat(Stat.SPEED, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe(){
        return "Hammer Arm";
    }
}
package skills;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
public class Focus extends SpecialMove{

    public Focus(){
        super(Type.FIGHTING, 120, 70);
    }
    
    @Override
    protected void applyOppDamage(Pokemon pokemon, double power) {
        pokemon.setMod(Stat.HP, (int) Math.round(power));
        Effect e = new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe(){
        return "Focus Blast";
    } 

}
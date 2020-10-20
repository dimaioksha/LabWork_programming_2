package skills;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
public class FrostBreath extends SpecialMove {
    public FrostBreath(){
        super(Type.ICE, 60, 90);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) Math.round(damage));
    } 
    @Override
    public String describe() {
        return "FrostBreath! ";
    }
}

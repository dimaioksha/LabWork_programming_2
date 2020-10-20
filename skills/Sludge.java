package skills;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
public class Sludge extends SpecialMove{
    public Sludge(){

        super(Type.POISON, 100, 90);

    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double power) {
        pokemon.setMod(Stat.HP, (int) Math.round(power));
        Effect e = new Effect().chance(0.3).turns(1);
        e.poison(pokemon);       
    }
    @Override
    protected String describe(){
        return "Sludge Bomb";
    }

}
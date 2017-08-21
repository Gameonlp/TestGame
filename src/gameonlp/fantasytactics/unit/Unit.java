package gameonlp.fantasytactics.unit;

import gameonlp.fantasytactics.Updatable;
import gameonlp.fantasytactics.mapping.Behaviour;
import gameonlp.fantasytactics.ui.Texture;

import java.util.HashMap;

public class Unit implements Updatable, Behaviour {
    private int maxHP, hp, maxMP, mp;
    private Attack[] attacks;
    private Behaviour behaviour;
    private Texture texture;
    private HashMap<AttackType, Integer> defenses = new HashMap<>();

    @Override
    public void update() {

    }

    @Override
    public void isMovedOn(Unit moved) {

    }

    @Override
    public void isUsed(Unit user) {

    }

    @Override
    public void isAttacked(Unit attacker, Attack attack) {

    }
}

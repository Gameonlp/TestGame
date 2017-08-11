package gameonlp.fantasytactics.mapping;

import gameonlp.fantasytactics.ui.Texture;
import gameonlp.fantasytactics.unit.Attack;
import gameonlp.fantasytactics.unit.Unit;

public class InteractableTile extends Tile implements Behaviour {
    private Behaviour behaviour;

    public InteractableTile(Texture texture, boolean walkable, boolean flyable, boolean buildable, Behaviour behaviour) {
        super(texture, walkable, flyable, buildable);
        this.behaviour = behaviour;
    }

    public void isMovedOn(Unit moved) {
        behaviour.isMovedOn(moved);
    }

    public void isUsed(Unit user) {
        behaviour.isUsed(user);
    }

    public void isAttacked(Unit attacker, Attack attack) {
        behaviour.isAttacked(attacker, attack);
    }
}

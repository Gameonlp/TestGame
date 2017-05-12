package gameonlp.fantasytactics.mapping;

import gameonlp.fantasytactics.unit.Attack;
import gameonlp.fantasytactics.unit.Unit;

public interface Behaviour {
    void isMovedOn(Unit moved);

    void isUsed(Unit user);

    void isAttacked(Unit attacker, Attack attack);
    //void isMovedOn();
}

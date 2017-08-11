package gameonlp.fantasytactics.unit;

import gameonlp.fantasytactics.Updatable;
import gameonlp.fantasytactics.mapping.Behaviour;

public class Unit implements Updatable {
    private int maxHP, hp, maxMP, mp;
    private Attack[] attacks;
    private Behaviour behaviour;

    @Override
    public void update() {

    }

}

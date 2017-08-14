package gameonlp.fantasytactics.unit;

import gameonlp.fantasytactics.Updatable;
import gameonlp.fantasytactics.mapping.Behaviour;
import gameonlp.fantasytactics.ui.Texture;

public class Unit implements Updatable {
    private int maxHP, hp, maxMP, mp;
    private Attack[] attacks;
    private Behaviour behaviour;
    private Texture texture;

    @Override
    public void update() {

    }

}

package gameonlp.fantasytactics.unit;

import java.util.Map;

public class Attack {
    private Map<AttackType, Integer> damages;

    public Map<AttackType, Integer> getDamages() {
        return damages;
    }

    public void setDamages(Map<AttackType, Integer> damages) {
        this.damages = damages;
    }
}

package gameonlp.fantasytactics.mapping;

import gameonlp.fantasytactics.Updatable;
import gameonlp.fantasytactics.ui.Texture;
import gameonlp.fantasytactics.unit.Attack;
import gameonlp.fantasytactics.unit.Unit;

public class Tile implements Updatable, Behaviour {

    private Texture texture;
    private boolean walkable;
    private boolean flyable;
    private boolean buildable;

    public Tile(Texture texture, boolean walkable, boolean flyable, boolean buildable) {
        this.texture = texture;
        this.walkable = walkable;
        this.flyable = flyable;
        this.buildable = buildable;
    }

    public boolean isWalkable() {
        return walkable;
    }

    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public void setFlyable(boolean flyable) {
        this.flyable = flyable;
    }

    public boolean isBuildable() {
        return buildable;
    }

    public void setBuildable(boolean buildable) {
        this.buildable = buildable;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

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
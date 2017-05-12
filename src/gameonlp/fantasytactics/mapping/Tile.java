package gameonlp.fantasytactics.mapping;

import gameonlp.fantasytactics.Texture;

public class Tile {


    //TODO figure out animation entry point
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
}
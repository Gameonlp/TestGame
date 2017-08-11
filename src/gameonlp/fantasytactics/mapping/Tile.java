package gameonlp.fantasytactics.mapping;

import gameonlp.fantasytactics.Updatable;
import gameonlp.fantasytactics.ui.TextureDecorator;

public class Tile implements Updatable {

    private TextureDecorator texture;
    private boolean walkable;
    private boolean flyable;
    private boolean buildable;

    public Tile(TextureDecorator texture, boolean walkable, boolean flyable, boolean buildable) {
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

    public TextureDecorator getTexture() {
        return texture;
    }

    public void setTexture(TextureDecorator texture) {
        this.texture = texture;
    }

    @Override
    public void update() {

    }
}
package gameonlp.fantasytactics.ui;

import gameonlp.fantasytactics.Updatable;

import java.awt.image.BufferedImage;
import java.util.PriorityQueue;

public class Texture implements Updatable {
    BufferedImage texture;
    int x;
    int y;
    int height;
    int width;
    boolean scaled;

    private PriorityQueue<TextureModifier> textureModifierPriorityQueue;

    public Texture(BufferedImage texture) {
        this.texture = texture;
        this.textureModifierPriorityQueue = new PriorityQueue<>();
    }

    public void draw(int x, int y, int height, int width, boolean scaled) {
        if (!textureModifierPriorityQueue.isEmpty()) {
            Texture t = this;
            for (TextureModifier textureModifier : textureModifierPriorityQueue) {
                t = textureModifier.modify(t);
            }
        }
        // TODO draw with graphic component
    }

    @Override
    public void update() {
        this.draw(x, y, height, width, scaled);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setScaled(boolean scaled) {
        this.scaled = scaled;
    }
}

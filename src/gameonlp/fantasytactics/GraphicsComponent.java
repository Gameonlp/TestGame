package gameonlp.fantasytactics;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GraphicsComponent extends Thread {

    private final JPanel clippingArea;
    private final Graphics2D backBuffer;

    GraphicsComponent(JPanel clippingArea, Graphics2D backBuffer) {
        this.clippingArea = clippingArea;
        this.backBuffer = backBuffer;
    }

    public void drawScaledTexture(BufferedImage image, int x, int y, int height, int width, boolean scaled) {
        // TODO draw scaled
    }

    public void drawTexture(BufferedImage image, int x, int y) {
        backBuffer.drawImage(image, x, y, null);
    }
}

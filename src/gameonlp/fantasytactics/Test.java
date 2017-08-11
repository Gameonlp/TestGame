package gameonlp.fantasytactics;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Test {

    GameQueue queue = GameQueue.getInstance();

    public static void main(String[] args) {
        BufferedImage backBufferImage = new BufferedImage(1280, 720, BufferedImage.TYPE_INT_ARGB);
        Graphics2D backBuffer = backBufferImage.createGraphics();
        JPanel clippingArea = new JPanel() {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1280, 720);
            }

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(backBufferImage, 0, 0, null);
            }
        };

        JFrame mainFrame = new JFrame();
        mainFrame.setContentPane(clippingArea);
        mainFrame.pack();
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);

        long time;
        long newTime = 0;
        float fps = 0;
        boolean running = true;

        backBuffer.setBackground(new Color(0, 0, 0, 0));

        while (running) {
            backBuffer.clearRect(0, 0, 1280, 720);
            time = newTime;
            newTime = System.currentTimeMillis();
            fps = (1000 / (newTime - time)) * 0.95F + (fps * 0.05F);


            backBuffer.setColor(new Color(0, 0, 0, 255));
            backBuffer.drawString((int) fps + " FPS", 0, 12);
            clippingArea.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

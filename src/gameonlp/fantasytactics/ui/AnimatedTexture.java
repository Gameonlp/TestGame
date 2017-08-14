package gameonlp.fantasytactics.ui;

import java.awt.image.BufferedImage;

public class AnimatedTexture extends Texture {

    private BufferedImage wholeTexture;
    private int currentAnimationsequence, currentFrame;
    private int[][] animationSequences;
    private boolean looping;
    private int frameHeight;
    private int frameWidth;

    public AnimatedTexture(int height, int width, BufferedImage wholeTexture, int[][] animationSequences, int frameHeight, int frameWidth) {
        super(wholeTexture.getSubimage(0, 0, frameWidth, frameHeight));
        this.wholeTexture = wholeTexture;
        this.animationSequences = animationSequences;
        this.frameHeight = frameHeight;
        this.frameWidth = frameWidth;
    }

    @Override
    public void update() {
        this.draw(x, y, height, width, scaled);
        if (animationSequences[currentAnimationsequence].length < currentFrame && !looping) {
            currentAnimationsequence = 0;
            currentFrame = 0;
        } else if (looping) {
            currentFrame = 0;
        } else {
            ++currentFrame;
        }
    }

    @Override
    public void draw(int x, int y, int height, int width, boolean scaled) {
        int frameX = animationSequences[currentAnimationsequence][currentFrame] % (wholeTexture.getWidth() / frameWidth) * frameWidth;
        int frameY = animationSequences[currentAnimationsequence][currentFrame] / (wholeTexture.getWidth() / frameWidth) * frameHeight;
        this.texture = wholeTexture.getSubimage(frameX, frameY, frameWidth, frameHeight);
        super.draw(x, y, height, width, scaled);
    }

    public void setCurrentAnimationsequence(int currentAnimationsequence) {
        this.currentAnimationsequence = currentAnimationsequence;
    }
}

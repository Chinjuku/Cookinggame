package src.Code;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CatWalking extends CatAnimated {
    private boolean flipSprite = true;

    public CatWalking(){
        super("src/typing_game/CatSpriteSheet2.png", 1280, 720, 1, 6, 100);
    }

    @Override
    public BufferedImage getBufferedImage() {
        return frames[currentFrame];
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        if (!flipSprite) {
            g2d.scale(-1, 1);
            g2d.translate(-width, 0);
        }
        g2d.drawImage(frames[currentFrame], x, y, width, height, null);
    }
    @Override
    public void move() {
        x += 20;
        if (x >= 1280 | x <= -800){
            flipSprite = !flipSprite;
            x = -800;
        }
    }
    @Override
    public void jump() {}
}

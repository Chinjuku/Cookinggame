package src.Code;
import javax.swing.*;
import java.awt.image.BufferedImage;

public interface CatBehavior {
    void move();
    void jump();
    BufferedImage getBufferedImage();
}
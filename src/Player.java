package src;

import java.awt.Image;
/* Player sprite */
public class Player {
    private int lives = 20;
    Image playerImage;

    public void setPlayerImage(Image image) {
        playerImage = image;
    }

    public void dies(int reduce){
        lives -= reduce;
    }

    public int getLives() {
        return lives;
    }
}

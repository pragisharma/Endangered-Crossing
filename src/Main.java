package src;
import processing.core.PApplet;

/* Driver Class: displays the game */
public class Main {
    public static void main(String[] args){
	    Game drawing = new Game();
		PApplet.runSketch(new String[]{""}, drawing);
		drawing.windowResizable(true);
     }
}
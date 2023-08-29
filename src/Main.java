package src;

import java.awt.Container;

import javax.swing.JFrame;

import src.Obstacles.Farmer;

/* Driver Class: displays the game */
public class Main {
    public static void main(String[] args){
	    JFrame window = new JFrame("Recycle Rush");
	    window.setBounds(300, 10, 900, 800); 
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Game game = new Game();
	   
	     
	    Container c = window.getContentPane();
	    c.add(game);
	    
	    window.setResizable(false);
	    window.setVisible(true);
     }
}
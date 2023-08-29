package src;

import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;

public class StartPage {
	Font font = new Font("Serif", Font.PLAIN, 50);
	Font title = new Font("Monospaced", Font.BOLD, 100);
	Color lightGreen = new Color(0, 150, 20);
	
	Rectangle start = new Rectangle(250, 250, 400, 100);
	Rectangle information = new Rectangle(250, 400, 400, 100);
	Rectangle gameManuel = new Rectangle(250, 550, 400, 100);

	public void paint(Graphics g) { //draws a starting page
		//buttons
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 1000);
		
		g.setColor(Color.green);
		g.fillRect(250, 250, 400, 100);

		g.fillRect(250, 400, 400, 100);

		g.fillRect(250, 550, 400, 100);
		
		//set up text
		g.setColor(Color.black);
		g.setFont(font);	
		
		// text
		g.drawString("Play", 400, 310);
		g.drawString("How to Play", 320, 610);
		g.drawString("Information", 320, 460);
		g.drawString("Choose character", 320, 460);


		g.setFont(title);
		g.drawString("Endangered Crossing", 100, 150);


	}

	public Rectangle getStart() {
		return start;
	}

	public Rectangle getInfo() {
		return information;
	}

	public Rectangle getManuel() {
		return gameManuel;
	}
}

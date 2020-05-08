//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape {
	public SnowMan(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 0);
	}

	public void draw(Graphics window) {
		// add code here to make a snowman
		window.fillOval(550, 290, 50, 50);
		window.fillOval(525, 325, 100, 100);
		window.fillOval(500, 400, 150, 150);
		
		window.setColor(Color.black);
		window.fillOval(565, 300, 5, 5);
		window.fillOval(580, 300, 5, 5);
		
		window.setColor(Color.orange);
		window.fillOval(575,315, 10, 10);
	}

	public void moveAndDraw(Graphics window) {
		draw(window);
	}
}

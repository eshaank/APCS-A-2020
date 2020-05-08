//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class WinterScenePanel extends JPanel implements Runnable {
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private AbstractShape tree;

	public WinterScenePanel() {
		setVisible(true);
		Math.random();
		// refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();

		// populate the list with 50 unique snowflakes
		for (int i = 0; i < 50; i++) {
			shapes.add(new FancySnowFlake(((int) (Math.random() * 700) + 50), (int) (Math.random() * 60) + 10,
					(int) (Math.random() * 5) + 5, (int) (Math.random() * 5) + 5, Color.white, 0,
					(int) (Math.random() * 5) + 1));
		}
		// instantiate a snowman
		sMan = new SnowMan(500, 400, 200, 150);

		tree = new Tree(100, 475, 100, 50, Color.green);
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		window.setColor(Color.BLUE);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("MAKE A WINTER SCENE!", 40, 40);

		// make the snowman appear
		sMan.draw(window);

		// make the snowflakes appear and move down the screen
		for (AbstractShape s : shapes) {
			s.moveAndDraw(window);
			if (s.getYPos() > 570) {
				s.setYPos((int) (Math.random() * 30) + 10);
			}
		}
		tree.draw(window);
		// check to see if any of the snowflakes need to be reset to the top of the
		// screen
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(35);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
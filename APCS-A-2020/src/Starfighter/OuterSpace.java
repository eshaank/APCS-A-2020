package Starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;
	private AlienHorde horde;
	private Bullets shots;
	private boolean takenShot;
	private int waitTimer = 0;
	private boolean gameOver = false;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace() {
		setBackground(Color.black);

		keys = new boolean[5];

		// instantiate other instance variables
		// Ship, Alien
		ship = new Ship(400, 500, 30, 30, 3);
		horde = new AlienHorde(10);
		shots = new Bullets();
		takenShot = false;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// after paint is called a certain number of times, a bullet can now be fired
		// this prevents a huge line of bullets from being shot when holding down space
		// bar
		waitTimer++;
		if (waitTimer > 50)
			takenShot = false;

		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0, 0, 800, 600);
		horde.removeDeadOnes(shots.getList());
		horde.drawEmAll(graphToBack);
		ship.draw(graphToBack);
		if (shots.size() > 0) {
			shots.drawEmAll(graphToBack);
			shots.moveEmAll();
		}

		// add code to move Ship, Alien, etc.

		if (keys[0] == true) {
			ship.move("l");
		}
		if (keys[1] == true) {
			ship.move("r");
		}
		if (keys[2] == true) {
			ship.move("u");
		}
		if (keys[3] == true) {
			ship.move("d");
		}

		// shoot bullet
		if (keys[4] == true) {
			if (takenShot == false) {
				shots.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5, ship.getY(), 3));
				takenShot = true;
				waitTimer = 0;
			}
		}

		horde.moveEmAll();
		// horde.checkWallHit();

		// add in collision detection to see if Bullets hit the Aliens and if Bullets
		// hit the Ship

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		// repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		// repaint();
	}

	public void keyTyped(KeyEvent e) {
		// no code needed here
	}

	public void run() {
		try {
			while (gameOver == false) {
				Thread.currentThread().sleep(9);
				repaint();
				for (Alien a : horde.getAliens()) {
					if (ship.hitByAlien(a)) {
						JOptionPane.showMessageDialog(null, "You lose");
						ship.setImage("pu.jpg");
						repaint();
						gameOver = true;
					}
				}

				if (horde.getAliens().size() < 1) {
					JOptionPane.showMessageDialog(null, "You win");
					gameOver = true;
				}
			}
		} catch (Exception e) {
		}
	}
}
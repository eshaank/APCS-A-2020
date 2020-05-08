package Pong;
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

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private Block topWall;
	private Block bottomWall;
	private boolean[] keys;
	private BufferedImage back;
	private int blueScore;
	private int yellowScore;

	public Pong() {
		// set up all variables related to the game
		ball = new SpeedUpBall(300, 300, 20, 20, Color.pink, 2, 2);
		leftPaddle = new Paddle(100, 100, 10, 50, Color.blue, 10);
		rightPaddle = new Paddle(700, 450, 10, 50, Color.yellow, 10);
		topWall = new Block(0, 0, 800, 10, Color.black);
		bottomWall = new Block(0, 540, 800, 10, Color.black);
		keys = new boolean[4];
		blueScore = 0;
		yellowScore = 0;

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.black);

		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		window.drawString("Blue Score: " + blueScore, 500, 20);
		window.drawString("Yellow Score: " + yellowScore, 500, 30);

		// see if ball hits left wall or right wall
		if (ball.getX() <= 10) {
			graphToBack.setColor(Color.white);
			yellowScore++;
			ball.draw(graphToBack, Color.white);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(300, 300);
			ball.setXSpeed(-2);
			ball.setYSpeed(2);
		}

		if (ball.getX() >= getWidth() - ball.getWidth() - 10) {
			blueScore++;
			ball.draw(graphToBack, Color.white);
			graphToBack.clearRect(500, 20, 20, 10);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(300, 300);
			ball.setXSpeed(2);
			ball.setYSpeed(2);

		}
		// see if the ball hits the top or bottom wall
		if (ball.didCollideBottom(bottomWall) || ball.didCollideTop(topWall)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		// see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle)) {
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
			} else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}

		// see if the ball hits the right paddle
		if (ball.didCollideRight(rightPaddle)) {
			if (ball.getX() + ball.getWidth() + ball.getXSpeed() <= rightPaddle.getX()) {
				ball.setYSpeed(-ball.getYSpeed());
			} else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}

		// see if the paddles need to be moved
		if (keys[0] == true) {
			// move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {

	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}

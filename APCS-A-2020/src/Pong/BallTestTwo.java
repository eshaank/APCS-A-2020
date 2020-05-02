package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable {
	private Ball ball;

	public BallTestTwo() {
		setBackground(Color.WHITE);
		setVisible(true);

		// instantiate a new Ball
		ball = new Ball();

		// test the Ball thoroughly
		System.out.println(ball);

		// test all constructors
		ball = new Ball(20, 20);
		ball = new Ball(30, 30, 30, 30);
		ball = new Ball(10, 10, 10, 10, Color.RED);
		ball = new Ball(15, 15, 15, 15, Color.blue, 2, 2);

		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		ball.moveAndDraw(window);

		if (!(ball.getX() >= 10 && ball.getX() <= 550)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (!(ball.getY() >= 10 && ball.getY() <= 450)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(19);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
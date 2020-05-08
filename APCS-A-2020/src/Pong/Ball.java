package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		// super(200,200);
		super();
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors

	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 4;
		ySpeed = 2;
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 4;
		ySpeed = 2;
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 4;
		ySpeed = 2;
	}

	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x, y, w, h, c);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}

	// add the set methods
	public void setXSpeed(int xspd) {
		xSpeed = xspd;
	}

	public void setYSpeed(int yspd) {
		ySpeed = yspd;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		super.draw(window, Color.white);

		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);

		// draw the ball at its new location
		super.draw(window);
	}

	public boolean equals(Object obj) {
		Ball testBall = (Ball) obj;
		if (super.equals(obj) && this.getXSpeed() == testBall.getXSpeed() && this.getYSpeed() == testBall.getYSpeed()) {
			return true;
		}
		return false;
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	// add a toString() method
	public String toString() {
		String output = "";
		output = super.toString() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Block test = (Block) obj;
		if ((this.getX() <= test.getX() + test.getWidth() - this.getXSpeed())
				&& ((this.getY() >= test.getY() && this.getY() <= test.getY() + test.getHeight())
						|| (this.getY() + this.getHeight() >= test.getY()
								&& this.getY() + this.getHeight() < test.getY() + test.getHeight()))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Block test = (Block) obj;
		if ((this.getX() + this.getWidth() + this.getXSpeed() >= test.getX())
				&& ((this.getY() >= test.getY() && this.getY() <= test.getY() + test.getHeight())
						|| (this.getY() + this.getHeight() >= test.getY()
								&& this.getY() + this.getHeight() < test.getY() + test.getHeight()))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Block test = (Block) obj;
		if (this.getY() <= test.getY() + test.getHeight()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Block test = (Block) obj;
		if (this.getY() + this.getHeight() >= test.getY()) {
			return true;
		}
		return false;
	}
}
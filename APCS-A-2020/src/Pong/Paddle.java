package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	// add the other Paddle constructors

	public Paddle(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x, y);
		speed = 5;
	}

	public Paddle(int x, int y, int s) {
		// TODO Auto-generated constructor stub
		super(x, y);
		setSpeed(s);

	}

	public Paddle(int x, int y, int w, int h, int s) {
		// TODO Auto-generated constructor stub
		super(x, y, w, h);
		setSpeed(s);
	}

	public Paddle(int x, int y, int w, int h, Color c, int s) {
		// TODO Auto-generated constructor stub
		super(x, y, w, h, c);
		setSpeed(s);
	}

	public void moveUpAndDraw(Graphics window) {
		super.draw(window, Color.white);

		setY(getY() - speed);

		super.draw(window);

	}

	public void moveDownAndDraw(Graphics window) {
		super.draw(window, Color.WHITE);

		setY(getY() + speed);

		super.draw(window);
	}

	// add get methods
	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		String output = "";
		output = super.toString() + " " + speed;
		return output;
	}
}
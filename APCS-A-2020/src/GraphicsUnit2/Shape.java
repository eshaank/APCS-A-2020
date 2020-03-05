package GraphicsUnit2;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Shape {
	// instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

	/*
	 * The constructor is used to initialize all instance variables. The constructor
	 * makes the object.
	 */
	public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		xPos = x;
		// finish this constructor
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
	}

	/*
	 * The draw method draws the shape on the screen.
	 */
	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(xPos, yPos, width, height);
		
		// draw whatever you want
		// ^
		// [ :: ]
		// ()

	}

	/*
	 * This draw method will be used to erase the shape.
	 */
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(xPos, yPos, width, height);
	}

	public void moveAndDraw(Graphics window) {
		// not needed yet
		window.setColor(color);
		window.fillRect(xPos, yPos, width, height);
		xPos += xSpeed;
		yPos += ySpeed;
	}

	// add in set and get methods for xPos, yPos, xSpeed, and ySpeed
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setY(int y) {
		yPos = y;
	}
	
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	public void setYSpeed(int y) {
		ySpeed = y;
	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color + " " + xSpeed + " " + ySpeed;
	}
}
package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		setColor(Color.blue);
		setPos(100, 200);
		setWidth(10);
		setHeight(10);
	}

	// add other Block constructors - x , y , width, height, color

	public Block(int x, int y) {
		setPos(x, y);
		setWidth(10);
		setHeight(10);
		setColor(Color.cyan);
	}

	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(Color.black);
	}

	public Block(int x, int y, int w, int h, Color col) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(col);
	}

	// add the other set methods
	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void setColor(Color col) {
		this.color = col;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public boolean equals(Object obj) {
		Block testBlock = (Block) obj;
		if (this.getColor().equals(testBlock.getColor()) && this.getWidth() == testBlock.getWidth()
				&& this.getHeight() == testBlock.getHeight()) {
			return true;
		} else {
			return false;
		}
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		String output = "";
		output = getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		return output;
	}

}
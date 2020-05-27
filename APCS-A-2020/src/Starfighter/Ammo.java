package Starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s) {
		super(x, y, 10, 10);
		speed = s;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.red);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void move(String direction) {

		if (direction.equals("u"))
			setY(getY() - getSpeed());
		if (direction.equals("d"))
			setY(getY() + getSpeed());
		if (direction.equals("l"))
			setX(getX() - getSpeed());
		if (direction.equals("r"))
			setX(getX() + getSpeed());
	}

	public boolean hitAlien(Object o) {
		Alien a = (Alien) o;

		if (this.getX() + this.getWidth() > a.getX() && this.getX() < a.getX() + a.getWidth()) {
			if (this.getY() < a.getY() + a.getHeight() && this.getY() + this.getHeight() > a.getY()) {
				return true;
			}
		}

		return false;
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}
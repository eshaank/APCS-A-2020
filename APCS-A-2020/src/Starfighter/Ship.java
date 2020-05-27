package Starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;

	public Ship() {
		this(10, 10, 10, 10, 10);
	}

	public Ship(int x, int y) {
		this(x, y, 10, 10, 10);
	}

	public Ship(int x, int y, int s) {
		this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Couldn't locate image file");
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void setImage(String directory) {
		try {
			URL url = getClass().getResource(directory);
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Couldn't locate image file");
		}
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

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public boolean hitByAlien(Object o) {
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
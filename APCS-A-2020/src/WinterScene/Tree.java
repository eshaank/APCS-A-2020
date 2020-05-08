package WinterScene;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape {

	public Tree(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.black);
		window.fillRect(super.getXPos(), super.getYPos(), super.getWidth(), super.getHeight());
		window.setColor(Color.green);
		int[] xPoints1 = { super.getXPos() - super.getWidth(), super.getXPos() + 2 * super.getWidth(),
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints1 = { super.getYPos(), super.getYPos(), super.getYPos() - super.getHeight() };
		int[] xPoints2 = { super.getXPos() - super.getWidth() * 3 / 5, super.getXPos() + super.getWidth() * 8 / 5,
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints2 = { super.getYPos() - 4 * super.getHeight() / 5, super.getYPos() - super.getHeight() * 4 / 5,
				super.getYPos() - 2 * super.getHeight() };
		window.fillPolygon(xPoints1, yPoints1, 3);
		window.fillPolygon(xPoints2, yPoints2, 3);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		draw(window);
	}

}
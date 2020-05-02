package Pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {

	public SpeedUpBall() {
		super();
	}

	public SpeedUpBall(int x, int y) {
		super(x, y);

	}

	public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
		super(x, y, 10, 10, Color.black, xSpd, ySpd);

	}

	public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, Color.blue, xSpd, ySpd);

	}

	public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);

	}

	public void setXSpeed(int xSpd) {
		if (xSpd == 0) {
			super.setXSpeed(0);
		} else if (xSpd < 0) {
			super.setXSpeed(xSpd - 1);
		} else {
			super.setXSpeed(xSpd + 1);
		}

	}

	public void setYSpeed(int ySpd) {
		if (ySpd == 0) {
			super.setYSpeed(0);
		} else if (ySpd < 0) {
			super.setYSpeed(ySpd - 1);
		} else {
			super.setYSpeed(ySpd + 1);
		}
	}
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}
	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xspd, int yspd) {
		super(x,y,wid,ht,col,xspd,yspd);
	}

	@Override
	public void draw(Graphics window) {
		window.setColor(super.getColor());
	    window.fillRect(super.getXPos(), super.getYPos(), getWidth(), getHeight());
	}
	public void draw(Graphics window, Color col) {
;
		Random rand = new Random();
		int randy = rand.nextInt(49);
		
		int random = (int) (50/randy * super.getWidth() * 0.33);
//		int[] x = {super.getXPos(),super.getXPos()-8,super.getXPos(),super.getXPos()+8,super.getXPos(),super.getXPos()+28,super.getXPos()+23,
//				super.getXPos()+8,super.getXPos(),super.getXPos()-28, super.getXPos()-23,super.getXPos()-8,super.getXPos()};
//		int[] y = {super.getYPos(),super.getYPos()-28,super.getYPos()-48,super.getYPos()-28,super.getYPos(),super.getYPos()+8,super.getYPos()+38, 
//				super.getYPos()+18,super.getYPos(),super.getYPos()+8,super.getYPos()+38,super.getYPos()+18,super.getYPos()};  
				 
		int[] x = {super.getXPos(),super.getXPos()-random,super.getXPos(),super.getXPos()+random,super.getXPos(),super.getXPos()+10,super.getXPos()+random,
				super.getXPos()+random,super.getXPos(),super.getXPos()-10, super.getXPos()-random,super.getXPos()-random,super.getXPos()};
		int[] y = {super.getYPos(),super.getYPos()-random,super.getYPos()-random,super.getYPos()-random,super.getYPos(),super.getYPos()+random,super.getYPos()+random, 
				super.getYPos()+10,super.getYPos(),super.getYPos()+random,super.getYPos()+10,super.getYPos()+random,super.getYPos()};
				
		//System.out.println(s);
		int z = x.length;
	    window.setColor(col);
	    //window.fillRect(super.getXPos(), super.getYPos(), getWidth(), getHeight());
	    window.drawPolygon(x, y, z);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		//draw(window, Color.white);
		super.setYPos(super.getYPos()+super.getYSpeed());
	    draw(window, Color.white);
	}
	
}

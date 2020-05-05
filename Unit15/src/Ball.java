//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei) {
		super (x, y, wid, hei);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei, Color col) {
		super (x, y, wid, hei, col);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int wid, int hei, Color col, int xspee, int yspee) {
		super (x, y, wid, hei, col);
		xSpeed = xspee;
		ySpeed = yspee;
	}
	//add the other Ball constructors
	 
   //add the set methods
   public void setXSpeed(int x) {
	   xSpeed = x;
   }
   public void setYSpeed(int y) {
	   ySpeed = y;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		if (super.equals(other) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed()) {
			return true;
		}
		return false;
	}   
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
   //add the get methods

   //add a toString() method
}
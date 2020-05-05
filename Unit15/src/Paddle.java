//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }
   public Paddle(int x, int y) {
	   super(x, y, 20, 40, Color.red);
	   speed = 5;
   }
   public Paddle(int x, int y, int wid, int ht) {
	   super(x, y, wid, ht, Color.red);
	   speed = 5;
   }
   public Paddle (int x, int y, int ht) {
	   super (x, y, 20, ht, Color.red);
	   speed = 5;
   }
   public Paddle (int x, int y, int wid, int ht, int spd) {
	   super (x, y, wid, ht, Color.red);
	   speed = spd;
   }
   public Paddle(int x, int y, int wid, int ht, Color col) {
	   super (x, y, wid, ht, col);
	   speed = 5;
   }
   public Paddle (int x, int y, int wid, int ht, Color col, int spd) {
	   super (x, y, wid, ht, col);
	   speed = spd;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY()-getSpeed());
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY()+getSpeed());
	   draw(window);
   }
   public int getSpeed() {
	   return speed;
   }
   //add get methods
   
   public String toString() {
	   return super.toString() + " " + speed;
   }
   //add a toString() method
}
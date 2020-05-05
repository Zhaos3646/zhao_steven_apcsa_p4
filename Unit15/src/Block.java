//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y) {
		setPos(x, y);
		width = 10;
		height = 10;
		color = Color.black;
	}
	public Block (int x, int y, int wid, int hei) {
		setPos(x, y);
		setDim(wid, hei);
		color = Color.black;
	}
	public Block (int x, int y, int wid, int hei, Color col) {
		setPos(x, y);
		setDim(wid, hei);
		setColor(col);
	}

   public void setColor(Color col)
   {
	   color = col;
   }
   public void setPos(int x, int y) {
	   setX(x);
	   setY(y);
   }
   public void setDim(int wid, int hei) {
	   width = wid;
	   height = hei;
   }
   public void setX(int x) {
	   xPos = x;
   }
   public void setY(int y) {
	   yPos = y;
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
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   public int getX() {
	   return xPos;
   }
   public int getY() {
	   return yPos;
   }
   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block) obj;
		if (getX() == other.getX() && getY() == other.getY() && getWidth() == other.getWidth() && getHeight() == other.getHeight() && getColor() == other.getColor()) {
			return true;
		}
		return false;
	}   

   //add the other get methods
    public String toString() {
    	return "x: " + xPos + "y: " + yPos + "width: " + width + "height: " + height + "Color: " + color;
    }

   //add a toString() method  - x , y , width, height, color
}
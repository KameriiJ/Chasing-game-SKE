package TwoPlayerMode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * This class has the Tiles object constructor.
 * This object is the wall in the map.
 * @author KameriiJ
 */
public class Tiles extends Rectangle{
	
	private static final long serialVersionUID = 1L;
	
	public Tiles(int x,int y){
		setBounds(x,y,32,32);
	}
	
	public void render(Graphics g){
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}
}

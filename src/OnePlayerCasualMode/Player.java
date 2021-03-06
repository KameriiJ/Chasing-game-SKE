package OnePlayerCasualMode;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * This class control player's direction and functions of items.
 * @author KameriiJ
 */
public class Player extends Rectangle {

	private static final long serialVersionUID = 1L;

	public boolean rigth, left, up, down;
	public boolean normalToffy;
	public int speed = 4;
	private int timePlayer;
	private int timeSize;
	public int playerSize = 30;

	public Player(int x, int y) {
		setBounds(x, y, 30, 30);
	}
	
	/**
	 * This method do the player movement(control with keyPressed method in Game class).
	 * It control the time of function of 5 items.
	 * 1.) increasing player's speed
	 * 2.) decreasing player's speed
	 * 3.) increasing enemy's speed
	 * 4.) decreasing enemy's speed 
	 */
	public void tick() {
		 
		if (rigth && canMove(x+speed,y)) {
			x += speed;
		}
		if (left && canMove(x-speed,y)) {
			x -= speed;
		}
		if (up && canMove(x, y-speed)) {
			y -= speed;
		}
		if (down && canMove(x, y+speed)) {
			y += speed;
		}
		
		Level level = OnePlayerCasualMode.Game.level;
		Bot en = OnePlayerCasualMode.Game.enemy;
		
		for(int i = 0;i < level.item.size();i++){
			if(this.intersects(level.item.get(i))){
				normalToffy = true;
				timePlayer = 0;
				level.item.remove(i);
				break;
			}
		}
		
		if((timePlayer >= 0)&&(timePlayer < 2)&& normalToffy) {
			if(level.rand == 0) {
				speed = 8;
			}
			else if(level.rand == 1) {
				speed = 2;
			}
			else if(level.rand == 2) {
				en.speedE = 8;
			}
			else if(level.rand == 3) {
				en.speedE = 2;
			}
		}
		
		if(timePlayer == 60*2) {
			normalToffy = false;
			timePlayer = 0;
			speed = 4;
			en.speedE = 4;
		}
		if(timeSize == 60*4) {
			playerSize = 30;
			timeSize = 0;
		}
		
		for(int i = 0;i < level.smallItem.size();i++){
			if(this.intersects(level.smallItem.get(i))){
				timeSize = 0;
				playerSize = 16;
				level.smallItem.remove(i);
				break;
			}
		}
		
			Bot enemy = OnePlayerCasualMode.Game.enemy;
			if(enemy.intersects(this)) {
				OnePlayerCasualMode.Game.resultCS.setResult(1);
                return;
			}
			
			timeSize++;
			timePlayer++;
	}
	
	/**
	 * This method check the direction(right left up or down) that can move or not.
	 */
	private boolean canMove(int nextX,int nextY){
		Rectangle bounds = new Rectangle(nextX,nextY,width,height);
		Level level = OnePlayerCasualMode.Game.level;
		
		for(int xx = 0;xx < level.tiles.length;xx++){
			for(int yy = 0;yy < level.tiles[0].length;yy++){
				if(level.tiles[xx][yy] != null){
					if(bounds.intersects(level.tiles[xx][yy])){
						return false;
					}
				}
			}
		}
		return true;
	}

	public void render(Graphics g) {
		BotSheet sheet = OnePlayerCasualMode.Game.playerSheet;
		g.drawImage(sheet.getBot(0, 0), x, y, playerSize, playerSize, null);
	}
}


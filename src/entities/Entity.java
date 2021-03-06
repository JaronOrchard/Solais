package entities;

import static org.lwjgl.opengl.GL11.*;

import solais.Board;
import solais.Coordinate;
import solais.Player;

public abstract class Entity {
	
	protected final Board parentBoard;
	protected Coordinate position;
	protected float angle;
	protected int health;
	// Refresh rates?  (Map of string label to long time)
	
	public Coordinate getPosition() { return position; } 
	public int getHealth() { return health; }
	
	public Entity(Board parentBoard, Coordinate position, float angle) {
		this.parentBoard = parentBoard;
		this.position = new Coordinate(position);
		this.angle = angle;
		this.health = 1;
	}
	
	/**
	 * Causes the Entity to act, be it moving or interacting with the Player or something else.
	 * @param player The player
	 * @param time The current system time in milliseconds
	 */
	public abstract void update(Player player, long time);
	
	/**
	 * Draw the Entity on the screen.
	 */
	public abstract void draw();
	
	/**
	 * React to being shot by a hostile bullet.
	 */
	public abstract void shot();
	
	/**
	 * Draw additional components that appear when the game is in debug mode.
	 */
	public void drawDebugMode() {
		glBegin(GL_LINES);
			glColor3f(1, 0, 0);
			glVertex3f(position.getX(), 0.4f, position.getZ());
			glVertex3f(position.getX() + (float)Math.cos(Math.toRadians(angle)), 0.4f, position.getZ() - (float)Math.sin(Math.toRadians(angle)));
			
			glColor3f(0, 1, 0);
			glVertex3f(position.getX(), 0, position.getZ());
			glVertex3f(position.getX(), 1, position.getZ());
		glEnd();
	}
	
}

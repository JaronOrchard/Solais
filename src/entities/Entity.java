package entities;

import solais.Coordinate;

public abstract class Entity {
	
	protected Coordinate position;
	protected float angle;
	protected int health;
	// Refresh rates?  (Map of string label to long time)
	
	public Entity(Coordinate position, float angle) {
		this.position = new Coordinate(position);
		this.angle = angle;
		this.health = 1;
	}
	
	/**
	 * Causes the Entity to act, be it moving or interacting with the Player or something else.
	 * @param time The current system time in milliseconds
	 */
	public abstract void update(long time);
	
	/**
	 * Draw the Entity on the screen.
	 */
	public abstract void draw();
	
}

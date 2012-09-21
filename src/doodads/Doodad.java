package doodads;

public abstract class Doodad {
	
	private int cellX;
	private int cellZ;
	public int getCellX() { return cellX; }
	public int getCellZ() { return cellZ; }
	
	public Doodad(int cellX, int cellZ) {
		this.cellX = cellX;
		this.cellZ = cellZ;
	}
	
	/**
	 * @return {@code true} if an entity cannot pass through this Object, {@code false} otherwise.
	 */
	public abstract boolean isSolid();
	
	/**
	 * Draws the object in the scene.
	 */
	public abstract void draw();
	
	/**
	 * Determines what happens when the player faces the Object and hits the space bar to activate it.
	 */
	public abstract void activate();
	
}

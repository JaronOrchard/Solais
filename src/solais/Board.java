package solais;

import java.util.ArrayList;
import java.util.List;

import doodads.Doodad;



public class Board {
	
	private static final float PI = 3.1415926535f;
	private static final float DEG_TO_RAD = PI / 180f;
	
	private static final int NUM_CELLS = 64; // Number of cells on a side of the board
	public int getNumCells() { return NUM_CELLS; }
		
	private Cell[][] cells;
	public Cell[][] getCells() { return cells; }
	
	private List<Doodad> doodads;
	public List<Doodad> getDoodads() { return doodads; }
	
	public Board() {
		cells = new Cell[NUM_CELLS][NUM_CELLS];
		doodads = new ArrayList<Doodad>();
	}
	
	/**
	 * Draws the state of the board through the eyes of the given player.
	 * @param player The player
	 */
	public void draw(Player player) {
		for (int x = 0; x < NUM_CELLS; x++) {
			for (int z = 0; z < NUM_CELLS; z++) {
				cells[x][z].draw(x, z);
			}
		}
		for (Doodad d : doodads) {
			d.draw();
		}
	}
	
	/**
	 * Activates the Doodad at the cell one space away from the player.  Called when the space bar is hit.
	 * @param player The player (used to get the player's location)
	 */
	public void activateDoodad(Player player) {
		int cellX = (int)(Math.cos((player.getAngle() - 90f) * DEG_TO_RAD) + player.getPosition().getX());
		int cellZ = (int)(Math.sin((player.getAngle() - 90f) * DEG_TO_RAD) + player.getPosition().getZ());
		for (Doodad d : doodads) {
			if (d.getCellX() == cellX && d.getCellZ() == cellZ) {
				d.activate();
			}
		}
	}
	
	/**
	 * Given a starting position and a desired end position, checks against the state of the board and performs
	 * collision detection, then returns a {@link Coordinate} representing the final end position.
	 * @param from The starting position of the object
	 * @param to The desired ending position of the object
	 * @return The final ending position of the object.  This will be the same as {@code to} if the object did not collide with
	 * anything on the board, or may be an entirely different value if a collision was detected and handled.
	 */
	public Coordinate attemptMovement(Coordinate from, Coordinate to) {
		Coordinate end = new Coordinate(to);
		
		// Perform collision detection:
		// 		CURRENT COLLISION DETECTION STATUS:
		// 		Level: 1
		//		EXP: 2 / 15
		//		Rank: The second-cheapest money can buy
		//		Catchphrase: "Why are these walls so sticky?"
		
		// Each cell on the board takes up one square.  So cell [5][14] would stretch from [5.0, 14.0] inclusive to (6.0, 15.0) exclusive.
		// Determine the cell the entity is in:
		int entityCellX = (int)from.getX();
		int entityCellZ = (int)from.getZ();
		// Determine the edges of the bounding box of the player's movement.  If it collides, we won't let the player move at all.
		float movementBoxLeft = Math.min(from.getX(), to.getX());
		float movementBoxRight = Math.max(from.getX(), to.getX());
		float movementBoxTop = Math.min(from.getZ(), to.getZ());
		float movementBoxBottom = Math.max(from.getZ(), to.getZ());
		
		// Go through all 8 adjacent cells and see if the entity collided with any of them.
		// It's bad, I know.  That's why it's level 1!  We need some Rare Candies up in here.
		// 1 2 3
		// 4 E 5
		// 6 7 8
		if (entityCellX > 0 && entityCellZ > 0 && cells[entityCellX-1][entityCellZ-1].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX-1) - 0.1f, (float)(entityCellX-1) + 1.1f, (float)(entityCellZ-1) - 0.1f, (float)(entityCellZ-1) + 1.1f))
				return from;
		}
		if (entityCellZ > 0 && cells[entityCellX][entityCellZ-1].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX) - 0.1f, (float)(entityCellX) + 1.1f, (float)(entityCellZ-1) - 0.1f, (float)(entityCellZ-1) + 1.1f))
				return from;
		}
		if (entityCellX < NUM_CELLS-1 && entityCellZ > 0 && cells[entityCellX+1][entityCellZ-1].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX+1) - 0.1f, (float)(entityCellX+1) + 1.1f, (float)(entityCellZ-1) - 0.1f, (float)(entityCellZ-1) + 1.1f))
				return from;
		}
		if (entityCellX > 0 && cells[entityCellX-1][entityCellZ].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX-1) - 0.1f, (float)(entityCellX-1) + 1.1f, (float)(entityCellZ) - 0.1f, (float)(entityCellZ) + 1.1f))
				return from;
		}
		if (entityCellX < NUM_CELLS-1 && cells[entityCellX+1][entityCellZ].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX+1) - 0.1f, (float)(entityCellX+1) + 1.1f, (float)(entityCellZ) - 0.1f, (float)(entityCellZ) + 1.1f))
				return from;
		}
		if (entityCellX > 0 && entityCellZ < NUM_CELLS-1 && cells[entityCellX-1][entityCellZ+1].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX-1) - 0.1f, (float)(entityCellX-1) + 1.1f, (float)(entityCellZ+1) - 0.1f, (float)(entityCellZ+1) + 1.1f))
				return from;
		}
		if (entityCellZ < NUM_CELLS-1 && cells[entityCellX][entityCellZ+1].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX) - 0.1f, (float)(entityCellX) + 1.1f, (float)(entityCellZ+1) - 0.1f, (float)(entityCellZ+1) + 1.1f))
				return from;
		}
		if (entityCellX < NUM_CELLS-1 && entityCellZ < NUM_CELLS-1 && cells[entityCellX+1][entityCellZ+1].getSolid()) {
			if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
									   (float)(entityCellX+1) - 0.1f, (float)(entityCellX+1) + 1.1f, (float)(entityCellZ+1) - 0.1f, (float)(entityCellZ+1) + 1.1f))
				return from;
		}
		
		// Also go through all solid Doodads and see if the entity collided with any of them.
		for (Doodad d : doodads) {
			if (d.isSolid()) {
				if (boundingBoxesIntersect(movementBoxLeft, movementBoxRight, movementBoxTop, movementBoxBottom,
										(float)(d.getCellX()) - 0.1f, (float)(d.getCellX()) + 1.1f, (float)(d.getCellZ()) - 0.1f, (float)(d.getCellZ()) + 1.1f))
					return from;
			}
		}
		
		// Additionally -- don't ever let the entity leave the boundary of the board:
		if (to.getX() < 0) { end.setX(0f); }
		if (to.getZ() < 0) { end.setZ(0f); }
		if (to.getX() > NUM_CELLS) { end.setX((float)NUM_CELLS); }
		if (to.getZ() > NUM_CELLS) { end.setZ((float)NUM_CELLS); }
		
		return end;
	}
	
	private boolean boundingBoxesIntersect(float box1Left, float box1Right, float box1Top, float box1Bottom,
										   float box2Left, float box2Right, float box2Top, float box2Bottom) {
		return !(box2Left > box1Right ||
				 box2Right < box1Left ||
				 box2Top > box1Bottom ||
				 box2Bottom < box1Top);
	}
	
}

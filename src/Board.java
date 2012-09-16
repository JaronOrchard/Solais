

public class Board {
	
	private static final int NUM_CELLS = 64; // Number of cells on a side of the board
	
	private Cell[][] cells;
	
	public Board() {
		
		
		Color floorColor = new Color(108, 81, 60); // temporary
		Color altFloorColor = new Color(123, 96, 75); // temporary
		Color ceilingColor = new Color(117, 111, 75); // temporary
		
		cells = new Cell[128][128];
		for (int x = 0; x < NUM_CELLS; x++) {
			for (int z = 0; z < NUM_CELLS; z++) {
				cells[x][z] = new Cell(0, 0, 0, 0, ((x + z) % 2 == 1 ? floorColor : altFloorColor), ceilingColor, false, false, false);
			}
		}
		createOuterWalls();
		
		cells[20][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[19][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[18][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[17][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[16][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[15][8] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[15][7] = new Cell(Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, floorColor, ceilingColor, true, true, false);
		cells[15][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[14][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[13][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[12][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[11][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		cells[10][6] = new Cell(Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, floorColor, ceilingColor, true, true, false);
		
	}
	
	private void createOuterWalls() {
		
		Color floorColor = new Color(108, 81, 60); // temporary
		Color ceilingColor = new Color(117, 111, 75); // temporary
		
		
		for (int x = 0; x < NUM_CELLS; x++) {
			cells[x][0] = new Cell(0, 0, Textures.STONE_WALL, 0, floorColor, ceilingColor, true, true, false);
			cells[x][NUM_CELLS-1] = new Cell(Textures.STONE_WALL, 0, 0, 0, floorColor, ceilingColor, true, true, false);
		}
		for (int z = 0; z < NUM_CELLS; z++) {
			cells[0][z] = new Cell(0, Textures.STONE_WALL, 0, 0, floorColor, ceilingColor, true, true, false);
			cells[NUM_CELLS-1][z] = new Cell(0, 0, 0, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		}
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

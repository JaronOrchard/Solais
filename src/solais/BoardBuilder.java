package solais;

import entities.Boxman;

public class BoardBuilder {
	
	public static Board buildLevel01() {
		Board board = new Board();
		
		// Initialize empty cells:
		for (int x = 0; x < board.getNumCells(); x++) {
			for (int z = 0; z < board.getNumCells(); z++) {
				board.getCells()[x][z] = new Cell(0, 0, 0, 0, ((x + z) % 2 == 1 ? Textures.GENERIC_FLOOR : Textures.GENERIC_ALT_FLOOR), Textures.GENERIC_CEILING, false);
			}
		}
		
		
		// Create an outer ring of cells:
		for (int x = 0; x < board.getNumCells(); x++) {
			board.getCells()[x][0] = new Cell(0, 0, Textures.STONE_WALL, 0, Textures.NONE, Textures.NONE, true);
			board.getCells()[x][board.getNumCells() - 1] = new Cell(Textures.STONE_WALL, 0, 0, 0, Textures.NONE, Textures.NONE, true);
		}
		for (int z = 0; z < board.getNumCells(); z++) {
			board.getCells()[0][z] = new Cell(0, Textures.STONE_WALL, 0, 0, Textures.NONE, Textures.NONE, true);
			board.getCells()[board.getNumCells() - 1][z] = new Cell(0, 0, 0, Textures.STONE_WALL, Textures.NONE, Textures.NONE, true);
		}
		
		for (int x = 5; x < board.getNumCells(); x += 5) {
			for (int z = 5; z < board.getNumCells(); z += 5) {
				board.getCells()[x][z] = new Cell(Textures.RED_BRICK, Textures.RED_BRICK, Textures.BLUE_BRICK, Textures.BLUE_BRICK, Textures.NONE, Textures.NONE, true);
			}
		}
		
		
		board.getEntities().add(new Boxman(board, new Coordinate(8.5f, 0, 8.5f), 0));
		
		return board;
	}
	
}

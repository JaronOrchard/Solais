package solais;

import doodads.Door;

public class BoardBuilder {
	
	public static Board buildLevel01() {
		Board board = new Board();
		
		Color floorColor = new Color(108, 81, 60);
		Color altFloorColor = new Color(123, 96, 75);
		Color ceilingColor = new Color(117, 111, 75);
		
		// Initialize empty cells:
		for (int x = 0; x < board.getNumCells(); x++) {
			for (int z = 0; z < board.getNumCells(); z++) {
				board.getCells()[x][z] = new Cell(0, 0, 0, 0, ((x + z) % 2 == 1 ? floorColor : altFloorColor), ceilingColor, false, false, false);
			}
		}
		
		// NW room:
		board.getCells()[0][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[0][1] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[0][2] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[0][3] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[0][4] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[0][5] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[0][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[2][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[3][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[4][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[6][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[7][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[8][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[9][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[10][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[11][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[12][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[13][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[14][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[15][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.UNDER_CONSTRUCTION, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[2][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.UNDER_CONSTRUCTION, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[4][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.UNDER_CONSTRUCTION, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.UNDER_CONSTRUCTION, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[6][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[7][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[8][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[9][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[10][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[11][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[12][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[13][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[14][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[15][6] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][0] = new Cell(Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][1] = new Cell(Textures.STONE_WALL, Textures.HALLWAYTEST, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][2] = new Cell(Textures.STONE_WALL, Textures.HALLWAYTEST, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][4] = new Cell(Textures.STONE_WALL, Textures.HALLWAYTEST, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][5] = new Cell(Textures.STONE_WALL, Textures.HALLWAYTEST, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][6] = new Cell(Textures.STONE_WALL, Textures.HALLWAYTEST, Textures.STONE_WALL, Textures.STONE_WALL, floorColor, ceilingColor, true, true, false);
		
		// NE room:
		board.getCells()[17][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[19][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[20][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[23][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[26][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[27][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[28][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[29][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[30][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[17][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[19][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[20][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[23][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[26][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[27][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.UNDER_CONSTRUCTION, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[28][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.UNDER_CONSTRUCTION, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[30][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.UNDER_CONSTRUCTION, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][0] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.UNDER_CONSTRUCTION, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][1] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][2] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][3] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][4] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][5] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][6] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][3] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][3] = new Cell(Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, floorColor, ceilingColor, true, true, false);
		board.getCells()[23][3] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][3] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][3] = new Cell(Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, Textures.HALLWAYTEST_GRATE, floorColor, ceilingColor, true, true, false);
		board.getCells()[26][3] = new Cell(Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, Textures.HALLWAYTEST, floorColor, ceilingColor, true, true, false);
		
		// SW room:
		board.getCells()[1][7] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][8] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][10] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][11] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][14] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][18] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][20] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][21] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][7] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][8] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][10] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][11] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][14] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][18] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][21] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[1][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[2][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[3][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[4][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[5][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		
		// SE jagged hallway:
		board.getCells()[27][7] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[27][8] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[27][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[26][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][10] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][11] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[23][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][14] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[20][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[19][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][18] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][21] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[18][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[19][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[20][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[21][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][22] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][21] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][20] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[22][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[23][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[24][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][19] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][18] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[25][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[26][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[27][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[28][16] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[28][15] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[28][14] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[28][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[29][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[30][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][13] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][12] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][11] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][10] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][9] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][8] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[31][7] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		
		// South hall:
		board.getCells()[6][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[7][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[8][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[9][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[10][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[14][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[15][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[17][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[6][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[7][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[8][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[9][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[10][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[11][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[13][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[14][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[15][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[16][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[17][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		
		// Under construction:
		board.getCells()[11][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[12][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[13][17] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		board.getCells()[12][23] = new Cell(Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, Textures.UNDER_CONSTRUCTION, floorColor, ceilingColor, true, true, false);
		
		
		board.getDoodads().add(new Door(16, 3, true, false));
		board.getDoodads().add(new Door(3, 6, true, true));
		board.getDoodads().add(new Door(29, 6, true, true));
		board.getDoodads().add(new Door(5, 20, true, false));
		board.getDoodads().add(new Door(18, 20, true, false));
		
		
		return board;
	}
	
}

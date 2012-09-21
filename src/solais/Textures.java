package solais;

public class Textures {
	
	public static final int NONE = 0;
	
	public static final int HALLWAYTEST = 1;
	public static final int HALLWAYTEST_GRATE = 2;
	public static final int STONE_WALL = 3;
	public static final int UNDER_CONSTRUCTION = 99;
	
	// 1000s - Walls
	public static final int BLUE_BRICK = 1001;
	public static final int ORANGE_BRICK = 1002;
	public static final int RED_BRICK = 1003;
	
	// 2000s - Floors
	public static final int BLUE_TILE = 2001;
	public static final int ORANGE_TILE = 2002;
	public static final int RED_TILE = 2003;
	public static final int GENERIC_FLOOR = 2998;
	public static final int GENERIC_ALT_FLOOR = 2999;
	
	// 3000s - Ceilings
	public static final int GENERIC_CEILING = 3999;
	
	public static void initializeTextures() {
		TextureLoader.loadTexture(HALLWAYTEST, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/HallwayTest.png")));
		TextureLoader.loadTexture(HALLWAYTEST_GRATE, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/HallwayTestGrate.png")));
		TextureLoader.loadTexture(STONE_WALL, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/StoneWall.png")));
		TextureLoader.loadTexture(UNDER_CONSTRUCTION, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/UnderConstruction.png")));
		
		TextureLoader.loadTexture(BLUE_BRICK, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/blue_brick.png")));
		TextureLoader.loadTexture(ORANGE_BRICK, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/orange_brick.png")));
		TextureLoader.loadTexture(RED_BRICK, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/red_brick.png")));
		
		TextureLoader.loadTexture(BLUE_TILE, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/blue_tile.png")));
		TextureLoader.loadTexture(ORANGE_TILE, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/orange_tile.png")));
		TextureLoader.loadTexture(RED_TILE, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/red_tile.png")));
		TextureLoader.loadTexture(GENERIC_FLOOR, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/FloorColor.png")));
		TextureLoader.loadTexture(GENERIC_ALT_FLOOR, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/AltFloorColor.png")));
		
		TextureLoader.loadTexture(GENERIC_CEILING, TextureLoader.loadImage(ClassLoader.getSystemResourceAsStream("resources/textures/CeilingColor.png")));
		
	}
	
}

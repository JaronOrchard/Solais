import java.io.InputStream;

public class Textures {
	public static final int HALLWAYTEST = 1;
	public static final int HALLWAYTEST_GRATE = 2;
	public static final int STONE_WALL = 3;
	
	public final static InputStream HALLWAYTEST_RESOURCE = ClassLoader.getSystemResourceAsStream("resources/textures/HallwayTest.png");
	public final static InputStream HALLWAYTEST_GRATE_RESOURCE = ClassLoader.getSystemResourceAsStream("resources/textures/HallwayTestGrate.png");
	public final static InputStream STONE_WALL_RESOURCE = ClassLoader.getSystemResourceAsStream("resources/textures/StoneWall.png");	
	
	public static void initializeTextures() {
		TextureLoader.loadTexture(HALLWAYTEST, TextureLoader.loadImage(HALLWAYTEST_RESOURCE));
		TextureLoader.loadTexture(HALLWAYTEST_GRATE, TextureLoader.loadImage(HALLWAYTEST_GRATE_RESOURCE));
		TextureLoader.loadTexture(STONE_WALL, TextureLoader.loadImage(STONE_WALL_RESOURCE));
	}
	
}

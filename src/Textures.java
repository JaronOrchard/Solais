import java.io.InputStream;

public class Textures {
	public static final int HALLWAYTEST_TEXTURE = 1;
	public static final int HALLWAYTEST_GRATE_TEXTURE = 2;
	
	public final static InputStream HALLWAYTEST_RESOURCE = ClassLoader.getSystemResourceAsStream("resources/textures/HallwayTest.png");
	public final static InputStream HALLWAYTEST_GRATE_RESOURCE = ClassLoader.getSystemResourceAsStream("resources/textures/HallwayTestGrate.png");
	
}
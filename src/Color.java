
/**
 * Constructs a Color instance that has awesome memory savings because it only uses one int!
 * <br/><br/>
 * Do NOT pass in values more than 255 for any parameter.  I'm not checking for them.  Don't do it!
 */
public class Color {
	
	private int color;
	
	/**
	 * Constructs a new Color object, setting the alpha value to 255 (opaque).
	 * All other parameters range from 0 to 255.
	 * @param red
	 * @param green
	 * @param blue
	 */
	public Color(int red, int green, int blue) {
		this(red, green, blue, 255);
	}
	
	/**
	 * Constructs a new Color object.  Each parameter ranges from 0 to 255.
	 * @param red
	 * @param green
	 * @param blue
	 * @param alpha
	 */
	public Color(int red, int green, int blue, int alpha) {
		color = (red << 24) + (green << 16) + (blue << 8) + (alpha);
	}
	
	public int getRedInt() { return (color >>> 24); }
	public int getGreenInt() { return ((color >>> 16) % 256); }
	public int getBlueInt() { return ((color >>> 8) % 256); }
	public int getAlphaInt() { return (color & 255); }
	
	public float getRed() { return (float)getRedInt() / 255.0f; }
	public float getGreen() { return (float)getGreenInt() / 255.0f; }
	public float getBlue() { return (float)getBlueInt() / 255.0f; }
	public float getAlpha() { return (float)getAlphaInt() / 255.0f; }
	
}
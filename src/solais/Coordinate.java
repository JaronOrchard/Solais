package solais;

public class Coordinate {
	
	private float x;
	private float y;
	private float z;
	
	public float getX() { return x; }
	public float getY() { return y; }
	public float getZ() { return z; }
	
	public void setX(float v) { x = v; }
	public void setY(float v) { y = v; }
	public void setZ(float v) { z = v; }
	public void setAll(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void incrementX(float v) { x += v; }
	public void incrementY(float v) { y += v; }
	public void incrementZ(float v) { z += v; }
	
	public Coordinate(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Coordinate(Coordinate clone) {
		this.x = clone.getX();
		this.y = clone.getY();
		this.z = clone.getZ();
	}
	
}

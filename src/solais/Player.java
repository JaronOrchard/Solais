package solais;
import static org.lwjgl.opengl.GL11.*;

public class Player {
	
	private static final float PI = 3.1415926535f;
	private static final float DEG_TO_RAD = PI / 180;
	
	private static final float DEFAULT_MOVEMENT_SPEED = 0.05f;
	private static final float DEFAULT_TURNING_SPEED = 3.5f;
	
	private String name;
	private Coordinate position; // Current position
	private Coordinate desiredPosition; // The player would like to go here as a result of keyboard inputs
	private float angle;
	private float movementSpeed;
	private float turningSpeed;
	
	
	public String getName() { return name; }
	public Coordinate getPosition() { return position; }
	public Coordinate getDesiredPosition() { return desiredPosition; }
	public float getAngle() { return angle; }
	public float getMovementSpeed() { return movementSpeed; }
	public float getTurningSpeed() { return turningSpeed; }
	
	public Player(String name, Coordinate position, float angle) {
		this.name = name;
		this.position = new Coordinate(position);
		this.desiredPosition = new Coordinate(position);
		this.angle = angle;
		this.movementSpeed = DEFAULT_MOVEMENT_SPEED;
		this.turningSpeed = DEFAULT_TURNING_SPEED;
	}
	
	/**
	 * @return {@code true} if {@link #position} is different from {@link #desiredPosition}, {@code false} otherwise.
	 */
	public boolean moved() { 
		return (position.getX() != desiredPosition.getX() ||
				position.getY() != desiredPosition.getY() ||
				position.getZ() != desiredPosition.getZ());
	}
	public void setPosition(Coordinate pos) {
		position.setAll(pos.getX(), pos.getY(), pos.getZ());
		desiredPosition.setAll(pos.getX(), pos.getY(), pos.getZ());
	}
	
	/**
	 * <b>Call this before drawing anything!</b>
	 * <br/><br/>
	 * Rotates and translates everything that is drawn to view it from the player's perspective.
	 * <br/><br/>
	 * Taken in part from http://www.lloydgoodall.com/tutorials/first-person-camera-control-with-lwjgl/
	 */
	public void orientCamera() {
		//float pitch = 0f; // Unused currently
		//glRotatef(pitch, 1.0f, 0.0f, 0.0f); // Rotate the pitch around the X-axis
		glRotatef(this.angle, 0.0f, 1.0f, 0.0f); // Rotate the yaw around the Y-axis
		glTranslatef(-this.position.getX(), -this.position.getY(), -this.position.getZ()); // Translate to the player's location
	}
	
	public void turnLeft() {
		angle -= turningSpeed;
		while (angle < 0f) { angle += 360f; }
	}
	
	public void turnRight() {
		angle += turningSpeed;
		while (angle >= 360f) { angle -= 360f; }
	}
	
	public void moveForward() { moveInDirection(angle); }
	public void moveBackward() { moveInDirection(angle + 180f); }
	public void strafeLeft() { moveInDirection(angle + 270f); }	
	public void strafeRight() { moveInDirection(angle + 90f); }
	
	private void moveInDirection(float angle) {
		float xChange = (float) (Math.cos((angle - 90f) * DEG_TO_RAD) * movementSpeed);
		float zChange = (float) (Math.sin((angle - 90f) * DEG_TO_RAD) * movementSpeed);
		desiredPosition.incrementX(xChange);
		desiredPosition.incrementZ(zChange);
	}
		
}

package solais;
import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.util.glu.GLU;

import bullets.PlayerBullet;

public class Solais {
	
	private static final int WINDOW_WIDTH = 900;
	private static final int WINDOW_HEIGHT = 600;
	private static final String SOLAIS_WINDOW_TITLE = "Solais (Alpha version)";
	private static final int maxFPS = 100;
	
	private boolean debugModeEnabled = false;
	
	private Board board;
	private Player player;
	
	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(WINDOW_WIDTH, WINDOW_HEIGHT));
			Display.create();
			Display.setTitle(SOLAIS_WINDOW_TITLE);
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		Textures.initializeTextures();
		initializeGame();
		
		lastFPS = getTime();
		
		while (!Display.isCloseRequested()) {
			// Initialize scene:
			initializeOpenGLFor3D();
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
			glLoadIdentity();
			player.orientCamera();
			
			// Get input and move the player:
			getKeyboardAndMouseInput();
			if (player.moved()) {
				player.setPosition(board.attemptMovement(player.getPosition(), player.getDesiredPosition()));
			}
			
			// Update the board, including all entities and bullets:
			board.update(player);
			
			// Draw new scene:
			board.draw(player);
			if (debugModeEnabled) { board.drawDebugMode(); }
			
			// Draw HUD:
			initializeOpenGLFor2D();
			HUD.draw(player);
			
			updateFPS(); // Uncomment to update the title bar with the FPS
			Display.update();
			//Display.sync(maxFPS);
		}

		Display.destroy();
	}
	
	int fps;
	long lastFPS;
	
	/**
	 * Get the time in milliseconds
	 * @return The system time in milliseconds
	 */
	public static long getTime() {
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
	public void updateFPS() {
	    if (getTime() - lastFPS > 1000) {
	        Display.setTitle(SOLAIS_WINDOW_TITLE + " | FPS: " + fps); 
	        fps = 0; //reset the FPS counter
	        lastFPS += 1000; //add one second
	    }
	    fps++;
	}
	
	/**
	 * Detects keyboard and mouse input and makes the main player react accordingly.
	 */
	private void getKeyboardAndMouseInput() {
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) { player.turnLeft(); }
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) { player.turnRight(); }
		if (Keyboard.isKeyDown(Keyboard.KEY_UP) || Keyboard.isKeyDown(Keyboard.KEY_W)) { player.moveForward(); }
		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN) || Keyboard.isKeyDown(Keyboard.KEY_S)) { player.moveBackward(); }
		if (Keyboard.isKeyDown(Keyboard.KEY_A)) { player.strafeLeft(); }
		if (Keyboard.isKeyDown(Keyboard.KEY_D)) { player.strafeRight(); }
		
		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) { // Key was pressed (not released)
				if (Keyboard.getEventKey() == Keyboard.KEY_SPACE) {
					board.activateDoodad(player);
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_E) {
					board.addBullet(new PlayerBullet(new Coordinate(player.getPosition()), player.getAngle()));
				}
				if (Keyboard.getEventKey() == 41) { // Backtick (`) key
					toggleDebugMode();
				}
			}
		}
	}
	
	private void initializeOpenGLFor3D() {
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		GLU.gluPerspective(60.0f, (float)WINDOW_WIDTH/(float)WINDOW_HEIGHT, 0.05f, 100f);
		
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		
		glShadeModel(GL_SMOOTH);
		glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		glClearDepth(1.0);
		glEnable(GL_DEPTH_TEST);
		glDepthFunc(GL_LEQUAL);
		glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
		
		// Fog:
		glEnable(GL_FOG);
		FloatBuffer fogColor = BufferUtils.createFloatBuffer(4);
        fogColor.put(0.0f).put(0.0f).put(0.0f).put(1.0f).flip();
		glFog(GL_FOG_COLOR, fogColor); // Sets the fog color
		glFogi(GL_FOG_MODE, GL_LINEAR);
		glFogf(GL_FOG_START, 0f);
		glFogf(GL_FOG_END, 20f);
		
		// This section was from my code in Dr. White's graphics class.  I have no idea if I want it?
		
		//glColorMaterial (GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE);
		//glEnable (GL_COLOR_MATERIAL);
		
		//glEnable(GL_NORMALIZE);
		//glCullFace(GL_BACK);	
		//glEnable(GL_CULL_FACE);
		
		//glDisable(GL_LIGHTING);
		//glPixelStorei(GL_UNPACK_ALIGNMENT, 1);
		
	}
	
	private void initializeOpenGLFor2D() {
		glDisable(GL_DEPTH_TEST);
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, WINDOW_WIDTH, 0, WINDOW_HEIGHT, 1, -1); // So this applies only to 2D sections and should go away, I hear?
		
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
	    glEnable(GL_BLEND);
	    
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
	}
	
	private void initializeGame() {
		player = new Player("Player", new Coordinate(5.5f, 0.5f, 3.5f), 0);
		board = BoardBuilder.buildLevel01();
	}
	
	public static void main(String[] argv) {
		Solais solais = new Solais();
		solais.start();
	}
	
	private void toggleDebugMode() {
		debugModeEnabled = !debugModeEnabled;
		System.out.println("Debug mode is now " + (debugModeEnabled ? "ON" : "OFF"));
	}
	
}

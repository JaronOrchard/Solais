package solais;

import static org.lwjgl.opengl.GL11.*;

public class HUD {
	
	/**
	 * Draws all HUD elements for the given player.
	 * @param player The player whose stats should be drawn on the on-screen HUD
	 */
	public static void draw(Player player) {
		drawLifeBar(player);
	}
	
	/**
	 * Draws the player's life bar.
	 * @param player The current player
	 */
	private static void drawLifeBar(Player player) {
		glBegin(GL_QUADS);
			// Outer border:
			glColor4f(0.0f, 0.0f, 0.0f, 1.0f);
			
			glVertex2f(20,20);
			glVertex2f(226,20);
			glVertex2f(226,23);
			glVertex2f(20,23);
			
			glVertex2f(20,47);
			glVertex2f(226,47);
			glVertex2f(226,50);
			glVertex2f(20,50);
			
			glVertex2f(20,20);
			glVertex2f(20,50);
			glVertex2f(23,50);
			glVertex2f(23,20);
			
			glVertex2f(223,20);
			glVertex2f(223,50);
			glVertex2f(226,50);
			glVertex2f(226,20);
			
			float pctLife = (float)player.getCurrentHealth() / (float)player.getMaxHealth();
			float healthBarDivider = (200 * Math.max(Math.min(pctLife, 1), 0)) + 23;
			
			// Inner bar:
			glColor4f(0.0f, 0.4f, 0.0f, 0.85f);
			glVertex2f(23,23);
			glVertex2f(23,47);
			glVertex2f(healthBarDivider,47);
			glVertex2f(healthBarDivider,23);
			
			if (pctLife < 1.0f) {
				glColor4f(0.2f, 0.2f, 0.2f, 0.85f);
				glVertex2f(223,23);
				glVertex2f(223,47);
				glVertex2f(healthBarDivider,47);
				glVertex2f(healthBarDivider,23);
			}
			
		glEnd();
	}
	
}

package doodads;

import static org.lwjgl.opengl.GL11.*;
import solais.Textures;

/**
 * A normal Door.  Can be opened and closed by activating it, and is solid when closed.
 */
public class Door extends Doodad {

	boolean closed;
	boolean facesNorthSouth;
	
	/**
	 * Constructs a Door {@link Object}.
	 * @param cellX The x cell the Door is in
	 * @param cellZ The z cell the Door is in
	 * @param isClosed {@code true} if the Door starts off closed (thus impassable), {@code false} to start it off wide open
	 * @param facesNorthSouth {@code true} if the Door faces north-south, {@code false} if the Door faces east-west
	 */
	public Door(int cellX, int cellZ, boolean isClosed, boolean facesNorthSouth) {
		super(cellX, cellZ);
		this.closed = isClosed;
		this.facesNorthSouth = facesNorthSouth;
	}
	
	public boolean isSolid() {
		return closed;
	}

	public void activate() {
		closed = !closed; // Open/shut door
	}

	public void draw() {
		glPushMatrix();
			glTranslatef((float)getCellX(), 0f, (float)getCellZ()); // Move cell to where it is supposed to be
			
			if (!facesNorthSouth) {
				glTranslatef(0f, 0f, 1f);
				glRotatef(90f, 0f, 1f, 0f);
			}
			if (!closed) {
				glTranslatef(0.55f, 0f, 0.55f);
				glRotatef(-90f, 0f, 1f, 0f);
			}
			
			// Draw front/back:
			glColor3f(1f, 1f, 1f);
			glEnable(GL_TEXTURE_2D);
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glBindTexture(GL_TEXTURE_2D, Textures.UNDER_CONSTRUCTION);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(1f, 1f, 0.45f);
					glTexCoord2d(1,0);
					glVertex3f(0f, 1f, 0.45f);
					glTexCoord2d(1,1); 
					glVertex3f(0f, 0f, 0.45f);
					glTexCoord2d(0,1); 
					glVertex3f(1f, 0f, 0.45f);
				glEnd();
			glPopMatrix();
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glTranslatef(1f, 0f, 1f);
				glRotatef(180f, 0f, 1f, 0f);
				glBindTexture(GL_TEXTURE_2D, Textures.UNDER_CONSTRUCTION);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(1f, 1f, 0.45f);
					glTexCoord2d(1,0);
					glVertex3f(0f, 1f, 0.45f);
					glTexCoord2d(1,1); 
					glVertex3f(0f, 0f, 0.45f);
					glTexCoord2d(0,1); 
					glVertex3f(1f, 0f, 0.45f);
				glEnd();
			glPopMatrix();
			
			// Draw sides:
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glTranslatef(1f, 0f, 0f);
				glRotatef(-90f, 0f, 1f, 0f);
				glBindTexture(GL_TEXTURE_2D, Textures.UNDER_CONSTRUCTION);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(0.55f, 1f, 0f);
					glTexCoord2d(1,0);
					glVertex3f(0.45f, 1f, 0f);
					glTexCoord2d(1,1); 
					glVertex3f(0.45f, 0f, 0f);
					glTexCoord2d(0,1); 
					glVertex3f(0.55f, 0f, 0f);
				glEnd();
			glPopMatrix();
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glTranslatef(0f, 0f, 1f);
				glRotatef(90f, 0f, 1f, 0f);
				glBindTexture(GL_TEXTURE_2D, Textures.UNDER_CONSTRUCTION);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(0.55f, 1f, 0f);
					glTexCoord2d(1,0);
					glVertex3f(0.45f, 1f, 0f);
					glTexCoord2d(1,1); 
					glVertex3f(0.45f, 0f, 0f);
					glTexCoord2d(0,1); 
					glVertex3f(0.55f, 0f, 0f);
				glEnd();
			glPopMatrix();
			glDisable(GL_TEXTURE_2D);
			
		glPopMatrix();
		
	}
	
}

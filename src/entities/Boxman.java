package entities;

import static org.lwjgl.opengl.GL11.*;
import solais.Coordinate;
import solais.Textures;

public class Boxman extends Entity {
	
	public Boxman(Coordinate position, float angle) {
		super(position, angle);
		health = 5;
	}
	
	@Override
	public void update(long time) {
		angle = (angle += 1) % 360;
	}
	
	@Override
	public void draw() {
		glPushMatrix();
			glTranslatef(position.getX(), 0f, position.getZ()); // Move it to its final location
			
			glTranslatef(0.5f, 0f, 0.5f); // Move it back
			glRotatef(angle, 0f, 1f, 0f); // Rotate it
			glTranslatef(-0.5f, 0f, -0.5f); // Move so its center is on its origin for rotation purposes
			
			// Draw front/back:
			glColor3f(1f, 1f, 1f);
			glEnable(GL_TEXTURE_2D);
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glBindTexture(GL_TEXTURE_2D, Textures.BOXMAN_FACE_MAD);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(0.8f, 0.8f, 0.2f);
					glTexCoord2d(1,0);
					glVertex3f(0.2f, 0.8f, 0.2f);
					glTexCoord2d(1,1); 
					glVertex3f(0.2f, 0.2f, 0.2f);
					glTexCoord2d(0,1); 
					glVertex3f(0.8f, 0.2f, 0.2f);
				glEnd();
			glPopMatrix();
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glTranslatef(1f, 0f, 1f);
				glRotatef(180f, 0f, 1f, 0f);
				glBindTexture(GL_TEXTURE_2D, Textures.BOXMAN_FACE_MAD);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(0.8f, 0.8f, 0.2f);
					glTexCoord2d(1,0);
					glVertex3f(0.2f, 0.8f, 0.2f);
					glTexCoord2d(1,1); 
					glVertex3f(0.2f, 0.2f, 0.2f);
					glTexCoord2d(0,1); 
					glVertex3f(0.8f, 0.2f, 0.2f);
				glEnd();
			glPopMatrix();
			
			// Draw sides:
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glTranslatef(1f, 0f, 0f);
				glRotatef(-90f, 0f, 1f, 0f);
				glBindTexture(GL_TEXTURE_2D, Textures.BOXMAN_FACE_HAPPY);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(0.8f, 0.8f, 0.2f);
					glTexCoord2d(1,0);
					glVertex3f(0.2f, 0.8f, 0.2f);
					glTexCoord2d(1,1); 
					glVertex3f(0.2f, 0.2f, 0.2f);
					glTexCoord2d(0,1); 
					glVertex3f(0.8f, 0.2f, 0.2f);
				glEnd();
			glPopMatrix();
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
				glTranslatef(0f, 0f, 1f);
				glRotatef(90f, 0f, 1f, 0f);
				glBindTexture(GL_TEXTURE_2D, Textures.BOXMAN_FACE_HAPPY);
				glBegin(GL_QUADS);
					glTexCoord2d(0,0); 
					glVertex3f(0.8f, 0.8f, 0.2f);
					glTexCoord2d(1,0);
					glVertex3f(0.2f, 0.8f, 0.2f);
					glTexCoord2d(1,1); 
					glVertex3f(0.2f, 0.2f, 0.2f);
					glTexCoord2d(0,1); 
					glVertex3f(0.8f, 0.2f, 0.2f);
				glEnd();
			glPopMatrix();
			glDisable(GL_TEXTURE_2D);
			
		glPopMatrix();
		
	}
	
}

package entities;

import static org.lwjgl.opengl.GL11.*;
import bullets.EnemyBullet;
import solais.Board;
import solais.Coordinate;
import solais.Player;
import solais.Solais;
import solais.Textures;

public class Boxman extends Entity {
	
	private final long startTime;
	private final long secondsToSwivel = 3 * 1000; // 3 sec
	private final double degreesToSwivel = 30;
	
	public Boxman(Board parentBoard, Coordinate position, float angle) {
		super(parentBoard, position, angle);
		health = 5;
		startTime = Solais.getTime();
	}
	
	@Override
	public void update(Player player, long currentTime) {
		angle = (float) -Math.toDegrees(Math.atan2(position.getX() - player.getPosition().getX() + 0.5, position.getZ() - player.getPosition().getZ() + 0.5));
		angle += (Math.sin(((double)((currentTime - startTime) % secondsToSwivel) / (double)secondsToSwivel) * Math.PI * 2) * degreesToSwivel);
	}
	
	@Override
	public void draw() {
		glPushMatrix();
			glTranslatef(position.getX(), 0f, position.getZ()); // Move it to its final location
			
			glTranslatef(0.5f, 0f, 0.5f); // Move it back
			glRotatef(-angle, 0f, 1f, 0f); // Rotate it
			glTranslatef(-0.5f, 0f, -0.5f); // Move so its center is on its origin for rotation purposes
			
			// Draw front/back:
			glColor3f(1f, 1f, 1f);
			glEnable(GL_TEXTURE_2D);
			glPushMatrix();
				glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
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

	@Override
	public void shot() {
		health--;
		if (health > 0) {
			parentBoard.addBullet(new EnemyBullet(new Coordinate(position.getX() + 0.5f, 0.5f, position.getZ() + 0.5f), angle));
		}
	}
	
}

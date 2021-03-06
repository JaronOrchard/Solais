package solais;
import static org.lwjgl.opengl.GL11.*;

public class Cell {
	private int northWallTexture;
	private int eastWallTexture;
	private int southWallTexture;
	private int westWallTexture;
	private int floorTexture;
	private int ceilingTexture;
	private boolean solid;
	
	public int getNorthWallTexture() { return northWallTexture; }
	public int getEastWallTexture() { return eastWallTexture; }
	public int getSouthWallTexture() { return southWallTexture; }
	public int getWestWallTexture() { return westWallTexture; }
	public int getFloorTexture() { return floorTexture; }
	public int getCeilingTexture() { return ceilingTexture; }
	public boolean getSolid() { return solid; }
	
	public Cell(int nTexture, int eTexture, int sTexture, int wTexture, int fTexture, int cTexture, boolean solid) {
		this.northWallTexture = nTexture;
		this.eastWallTexture = eTexture;
		this.southWallTexture = sTexture;
		this.westWallTexture = wTexture;
		this.floorTexture = fTexture;
		this.ceilingTexture = cTexture;
		this.solid = solid;
	}
	
	public void draw(int x, int z) {
		
		glPushMatrix();
			glTranslatef((float)x, 0f, (float)z); // Move cell to where it is supposed to be
			
			glEnable(GL_TEXTURE_2D);
			if (!hasNorthWall() || !hasEastWall() || !hasSouthWall() || !hasWestWall()) {
				drawFloor();
				drawCeiling();
			}	
			if (hasNorthWall()) { drawNorthWall(); }
			if (hasEastWall()) { drawEastWall(); }
			if (hasSouthWall()) { drawSouthWall(); }
			if (hasWestWall()) { drawWestWall(); }
			glDisable(GL_TEXTURE_2D);
			
		glPopMatrix();
	}
	
	private boolean hasNorthWall() { return northWallTexture != 0; }
	private boolean hasEastWall() { return eastWallTexture != 0; }
	private boolean hasSouthWall() { return southWallTexture != 0; }
	private boolean hasWestWall() { return westWallTexture != 0; }
	
	private void drawFloor() {
		glColor3f(1f, 1f, 1f);
		glPushMatrix();
			glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
			glBindTexture(GL_TEXTURE_2D, this.floorTexture);
			glBegin(GL_QUADS);
				glTexCoord2d(0,0); 
				glVertex3f(1f, 0f, 1f);
				glTexCoord2d(1,0);
				glVertex3f(0f, 0f, 1f);
				glTexCoord2d(1,1); 
				glVertex3f(0f, 0f, 0f);
				glTexCoord2d(0,1); 
				glVertex3f(1f, 0f, 0f);
			glEnd();
		glPopMatrix();
	}
	
	private void drawCeiling() {
		glColor3f(1f, 1f, 1f);
		glPushMatrix();
			glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
			glBindTexture(GL_TEXTURE_2D, this.ceilingTexture);
			glBegin(GL_QUADS);
				glTexCoord2d(0,0); 
				glVertex3f(1f, 1f, 1f);
				glTexCoord2d(1,0);
				glVertex3f(0f, 1f, 1f);
				glTexCoord2d(1,1); 
				glVertex3f(0f, 1f, 0f);
				glTexCoord2d(0,1); 
				glVertex3f(1f, 1f, 0f);
			glEnd();
		glPopMatrix();
	}
	
	private void drawNorthWall() {
		glColor3f(1f, 1f, 1f);
		glPushMatrix();
			glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
			glBindTexture(GL_TEXTURE_2D, this.northWallTexture);
			glBegin(GL_QUADS);
				glTexCoord2d(0,0); 
				glVertex3f(1f, 1f, 0f);
				glTexCoord2d(1,0);
				glVertex3f(0f, 1f, 0f);
				glTexCoord2d(1,1); 
				glVertex3f(0f, 0f, 0f);
				glTexCoord2d(0,1); 
				glVertex3f(1f, 0f, 0f);
			glEnd();
		glPopMatrix();
	}
	
	private void drawEastWall() {
		glColor3f(1f, 1f, 1f);
		glPushMatrix();
			glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
			glTranslatef(1f, 0f, 0f);
			glRotatef(-90f, 0f, 1f, 0f);
			glBindTexture(GL_TEXTURE_2D, this.eastWallTexture);
			glBegin(GL_QUADS);
				glTexCoord2d(0,0); 
				glVertex3f(1f, 1f, 0f);
				glTexCoord2d(1,0);
				glVertex3f(0f, 1f, 0f);
				glTexCoord2d(1,1); 
				glVertex3f(0f, 0f, 0f);
				glTexCoord2d(0,1); 
				glVertex3f(1f, 0f, 0f);
			glEnd();
		glPopMatrix();
	}
	
	private void drawSouthWall() {
		glColor3f(1f, 1f, 1f);
		glPushMatrix();
			glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
			glTranslatef(1f, 0f, 1f);
			glRotatef(180f, 0f, 1f, 0f);
			glBindTexture(GL_TEXTURE_2D, this.southWallTexture);
			glBegin(GL_QUADS);
				glTexCoord2d(0,0); 
				glVertex3f(1f, 1f, 0f);
				glTexCoord2d(1,0);
				glVertex3f(0f, 1f, 0f);
				glTexCoord2d(1,1); 
				glVertex3f(0f, 0f, 0f);
				glTexCoord2d(0,1); 
				glVertex3f(1f, 0f, 0f);
			glEnd();
		glPopMatrix();
	}
	
	private void drawWestWall() {
		glColor3f(1f, 1f, 1f);
		glPushMatrix();
			glTexEnvf(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
			glTranslatef(0f, 0f, 1f);
			glRotatef(90f, 0f, 1f, 0f);
			glBindTexture(GL_TEXTURE_2D, this.westWallTexture);
			glBegin(GL_QUADS);
				glTexCoord2d(0,0); 
				glVertex3f(1f, 1f, 0f);
				glTexCoord2d(1,0);
				glVertex3f(0f, 1f, 0f);
				glTexCoord2d(1,1); 
				glVertex3f(0f, 0f, 0f);
				glTexCoord2d(0,1); 
				glVertex3f(1f, 0f, 0f);
			glEnd();
		glPopMatrix();
	}
	
}

/**
 * 
 */
package org.ggj.supernatural.RenderObjects;

import java.io.InputStream;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.Texture;

/**
 * @author Colby Dame
 *
 */
public class WorldObject extends Image {

	private float X;
	private float Y;
	private boolean Passable;
	
	/**
	 * 
	 */
	public float GetX() { return X; }
	public float GetY() { return Y; }
	public boolean IsPassable() { return Passable; }
	public void SetX(float X) { this.X = X; }
	public void SetX(float Y) { this.Y = Y; }
	public void SetPassable( boolean Passable ) { this.Passable = Passable; }
	
	public WorldObject(Image other, float X, float Y, boolean Passable) {
		super(other);
		this.X = X;
		this.Y = Y;
		this.Passable = Passable;
	}


}

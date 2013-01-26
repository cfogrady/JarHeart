/**
 * 
 */
package org.ggj.supernatural.RenderObjects.Movable;

import org.ggj.supernatural.RenderObjects.WorldObject;
import org.newdawn.slick.Image;

/**
 * @author Colby Dame
 *
 */
public class Entity extends WorldObject {
	
	public static enum SpriteDirection { North, East, South, West }
	SpriteDirection Orientation;

	public SpriteDirection getOrientation() {
		return Orientation;
	}

	public void setOrientation(SpriteDirection orientation) {
		Orientation = orientation;
	}

	/**
	 * @param other
	 * @param X
	 * @param Y
	 * @param Passable
	 */
	public Entity(Image other, float X, float Y, boolean Passable) {
		super(other, X, Y, Passable);
		Orientation = SpriteDirection.South;
		// TODO Auto-generated constructor stub
	}

}

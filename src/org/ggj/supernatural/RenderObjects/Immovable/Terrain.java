/**
 * 
 */
package org.ggj.supernatural.RenderObjects.Immovable;

import org.ggj.supernatural.RenderObjects.WorldObject;
import org.newdawn.slick.Image;

/**
 * @author Colby Dame
 *
 */
public class Terrain extends WorldObject {

	public Terrain(Image other, float X, float Y, boolean Passable) {
		/**
		 * All non movable terrain
		 * 
		 * @param other Sprite
		 * @param X X coordinate
		 * @param Y Y coordinate
		 * @param Passable If the tile is passable
		 */
		super(other, X, Y, Passable);
		// TODO Auto-generated constructor stub
	}

}

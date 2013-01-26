/**
 * 
 */
package org.ggj.supernatural.RenderObjects.Movable;

import java.util.Iterator;

import org.ggj.supernatural.RenderObjects.WorldObject;
import org.ggj.supernatural.WorldMap.WorldMap;
import org.newdawn.slick.Image;

/**
 * @author Colby Dame
 *
 */
public class Entity extends WorldObject {
	
	public static enum SpriteDirection { North, East, South, West }
	protected SpriteDirection Orientation;
	protected float Speed;
	protected WorldMap Map;

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
	public Entity(Image other, float X, float Y, boolean Passable, WorldMap Map) {
		super(other, X, Y, Passable);
		this.Map = Map;
		Speed = 5.0f;
		Orientation = SpriteDirection.South;
		// TODO Auto-generated constructor stub
	}
	
	public boolean CollidesWith(WorldObject Compare){
		return false;
	}
	
	public boolean HasMovementCollisions(float Movement, Entity.SpriteDirection Direction){
		
		Entity TempPlayer = (Entity) this.clone();
		switch(Direction){
		case North: TempPlayer.SetY(TempPlayer.GetY() - Movement);
			break;
		case South: TempPlayer.SetY(TempPlayer.GetY() + Movement);
			break;
		case East: TempPlayer.SetX(TempPlayer.GetX() + Movement);
			break;
		case West: TempPlayer.SetX(TempPlayer.GetX() - Movement);
			break;
		}
		
		Iterator<WorldObject> Itr = Map.iterator();
		while(Itr.hasNext()){
			WorldObject Temp = Itr.next();
			if(Temp.IsPassable())
				continue;
			else if(TempPlayer.CollidesWith(Temp)){
				return true;					
			}
			
		}
		return false;
	}
	
}

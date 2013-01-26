/**
 * 
 */
package org.ggj.supernatural.RenderObjects.Movable.Player;


import java.util.*;
import org.ggj.supernatural.RenderObjects.WorldObject;
import org.ggj.supernatural.RenderObjects.Movable.Entity;
import org.ggj.supernatural.WorldMap.WorldMap;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

/**
 * @author Colby Dame
 *
 */
public class Player extends Entity {
	
	GameContainer GC;
	WorldMap Map;


	/**
	 * @param other
	 * @param X
	 * @param Y
	 * @param Passable
	 * @param GC Gamecontainer for Slick2D
	 */
	public Player(Image other, float X, float Y, boolean Passable, WorldMap Map, GameContainer GC) {
		super(other, X, Y, Passable, Map);
		this.GC = GC;
		
		// TODO Auto-generated constructor stub
	}

	public void Update(){
		Input input = GC.getInput();
		
		if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON))
		{
		}

		if(input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)){
			
			if(!HasMovementCollisions(Speed, SpriteDirection.West))
				X -= Speed;
		}
 
		if(input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)){
			if(!HasMovementCollisions(Speed, SpriteDirection.East))
				X += Speed;
		}

		if(input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)){
			if(!HasMovementCollisions(Speed, SpriteDirection.North))
				Y -= Speed;
		}
		
		if(input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)){
			if(!HasMovementCollisions(Speed, SpriteDirection.South))
				Y += Speed;
		}
		
		super.Update();
	}
}

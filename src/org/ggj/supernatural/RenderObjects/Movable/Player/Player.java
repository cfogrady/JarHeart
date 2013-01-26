/**
 * 
 */
package org.ggj.supernatural.RenderObjects.Movable.Player;

import org.ggj.supernatural.RenderObjects.Movable.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

/**
 * @author Colby Dame
 *
 */
public class Player extends Entity {
	
	GameContainer GC;

	/**
	 * @param other
	 * @param X
	 * @param Y
	 * @param Passable
	 * @param GC Gamecontainer for Slick2D
	 */
	public Player(Image other, float X, float Y, boolean Passable, GameContainer GC) {
		super(other, X, Y, Passable);
		this.GC = GC;
		
		// TODO Auto-generated constructor stub
	}

	public void Update(){
		Input input = GC.getInput();
		
		if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON))
		{
		}

		if(input.isKeyDown(Input.KEY_A))
		{
			X -= 20;
		}
 
		if(input.isKeyDown(Input.KEY_D))
		{
			X += 20;
		}

		if(input.isKeyDown(Input.KEY_W))
		{
			Y -= 20;
		}
		
		if(input.isKeyDown(Input.KEY_S)){
			
			Y += 20;
		}
		
		super.Update();
	}
}

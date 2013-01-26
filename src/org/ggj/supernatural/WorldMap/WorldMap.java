package org.ggj.supernatural.WorldMap;

import java.util.*;

import org.ggj.supernatural.RenderObjects.WorldObject;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class WorldMap {
	
	private Vector<WorldObject> TileMap;
	
	public WorldMap (int Width, int Height) throws SlickException {
		
		/** Holds the vector that contains all drawable objects in the world
		 *  @param Width Width
		 *  @param Height Height
		 */
		TileMap = new Vector<WorldObject>();
		Image Ground = new Image("sprites/ground_center.png");
		
		for(int X = 0; X < Width; X += 32){
			for(int Y = 0; Y < Height; Y += 32){
				WorldObject Tile = new WorldObject(Ground, (float)(X), (float)(Y), true);
				TileMap.add(Tile);
			}
		}
	}
	
	public void Update(){
		Iterator<WorldObject> Itr = TileMap.iterator();
		while(Itr.hasNext()){
			WorldObject Temp = Itr.next();
			Temp.draw(Temp.GetX(),Temp.GetY(),1);
		}
		
	}

}

package org.ggj.supernatural.WorldMap;

import java.util.*;

import org.ggj.supernatural.RenderObjects.WorldObject;
import org.ggj.supernatural.RenderObjects.Movable.Player.Player;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class WorldMap {
	
	private Vector<WorldObject> TileMap;
	GameContainer GC;
	Player PlayerCharacter;
	
	/** Holds the vector that contains all drawable objects in the world
	 *  @param Width Width
	 *  @param Height Height
	 */
	public WorldMap (int Width, int Height, GameContainer GC) throws SlickException {
		this.GC = GC;

		TileMap = new Vector<WorldObject>();
		Image Ground = new Image("sprites/ground_center.png");
		
		for(int X = 0; X < Width; X += 32){
			for(int Y = 0; Y < Height; Y += 32){
				WorldObject Tile = new WorldObject(Ground, (float)(X), (float)(Y), true);
				TileMap.add(Tile);
			}
		}
		PlayerCharacter = new Player(new Image("sprites/plane.png"), 100, 100, true, this, GC);
	}
	
	public void Update(){
		Iterator<WorldObject> Itr = TileMap.iterator();
		while(Itr.hasNext()){
			WorldObject Temp = Itr.next();
			Temp.Update();
		}
		PlayerCharacter.Update();
	}
	
	public void Draw(){
		Iterator<WorldObject> Itr = TileMap.iterator();
		while(Itr.hasNext()){
			WorldObject Temp = Itr.next();
			Temp.Draw();
		}
		PlayerCharacter.Draw();
	}
	
	public Iterator<WorldObject> iterator(){
		return TileMap.iterator();
	}
	


}

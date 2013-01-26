package org.ggj.supernatural;

import org.ggj.supernatural.WorldMap.WorldMap;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class SuperNatural extends BasicGame {
	
	//Top Left is 0,0
	//Images are rendered with coordinates at top left
	WorldMap Map = null;
	Image plane = null;
	//Image land = null;
	float x = 4;
	float y = 3;
	float scale = 1;
	
	public static final String gameName = "JarHeart";
	
	public SuperNatural()
	{
		super(gameName);
	}
	
	@Override
	public void init(GameContainer gc) 
			throws SlickException {
		plane = new Image("sprites/plane.png");
		Map = new WorldMap(800,600,gc);
		//land = new Image("sprites/land.jpeg");
	}
 
	@Override
	public void update(GameContainer gc, int delta) 
			throws SlickException     
	{
		Map.Update();
	}
 
	public void render(GameContainer gc, Graphics g) 
			throws SlickException 
	{
		//land.draw(0, 0);

		Map.Draw();
		plane.draw(x, y, scale);
	}
 
	public static void main(String[] args) 
			throws SlickException
	{
		AppGameContainer app = 
				new AppGameContainer(new SuperNatural());
 
		app.setDisplayMode(800, 600, false);
		app.start();
	}

}

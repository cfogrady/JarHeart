package org.ggj.supernatural;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class SuperNatural extends BasicGame {
	
	Image plane = null;
	Image land = null;
	float x = 400;
	float y = 300;
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
	}
 
	@Override
	public void update(GameContainer gc, int delta) 
			throws SlickException     
	{

	}
 
	public void render(GameContainer gc, Graphics g) 
			throws SlickException 
	{
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

package org.ggj.supernatural;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class SuperNatural extends BasicGame {
	
	public static final String gameName = "Super Natural";
	
	public SuperNatural()
	{
		super(gameName);
	}
	
	@Override
	public void init(GameContainer gc) 
			throws SlickException {
	}
 
	@Override
	public void update(GameContainer gc, int delta) 
			throws SlickException     
	{

	}
 
	public void render(GameContainer gc, Graphics g) 
			throws SlickException 
	{
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

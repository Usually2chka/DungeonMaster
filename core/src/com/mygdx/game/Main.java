package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.Screens.UserInterfaceScreens.LoadScreen;
import com.mygdx.game.Screens.UserInterfaceScreens.MainMenu;

public class Main extends Game {
	
	@Override
	public void create () {
		LoadScreen screen = new LoadScreen();
		this.setScreen(screen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
}

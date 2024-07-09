package com.mygdx.game.Managers;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class TextureManager {
    private AssetManager manager;// = new AssetManager();
    public TextureManager()
    {
        if (manager == null)
            manager = new AssetManager();
    }
    public void loadingAll()
    {
        manager.load("StartGame190x46.png", Texture.class);
        manager.load("StartGame_Click190x46.png", Texture.class);
        manager.load("badLogic.jpg", Texture.class);
    }
    public void unLoadStartTexture()
    {
        manager.unload("badLogic.jpg");
    }
    public Texture getStartGameButton()
    {
        return manager.get("StartGame190x46.png");
    }

    public Texture getStartGameClickButton()
    {
        return manager.get("StartGame_Click190x46.png");
    }

    public boolean update()
    {
        return manager.update();
    }
}

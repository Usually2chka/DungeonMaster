package com.mygdx.game.Screens.UserInterfaceScreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.mygdx.game.Main;
import com.mygdx.game.Managers.TextureManager;

public class LoadScreen implements Screen {

    private Image splashImage;
    private Texture splashTexture;
    private Stage splashStage;
    private TextureManager manager;
    private Action action;
    private boolean startLoading = false;
    public LoadScreen()
    {
        manager = new TextureManager();
    }

    @Override
    public void show() {
        splashTexture = new Texture("badLogic.jpg");
        splashTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        splashImage = new Image(splashTexture);
        splashImage.setSize(480, 160);
        splashStage = new Stage(new FitViewport(480, 160, new OrthographicCamera(480, 160)));
        splashStage.addActor(splashImage);
        splashImage.addAction(Actions.run(new Runnable() {
            @Override
            public void run() {
                manager.loadingAll();
                startLoading = true;
            }
        }));


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        splashStage.act();
        splashStage.draw();
        if(manager.update() && startLoading){
            ((Main)Gdx.app.getApplicationListener()).setScreen(new MainMenu(manager));
            manager.unLoadStartTexture();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        splashTexture.dispose();
        splashStage.dispose();
    }
}

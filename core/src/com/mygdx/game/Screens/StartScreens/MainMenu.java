package com.mygdx.game.Screens.StartScreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


public class MainMenu implements Screen {

    private Stage stage;
    private Viewport viewport = new StretchViewport(600, 300);
    private Texture none;
    private Texture click;
    public MainMenu()
    {
        stage = new Stage(viewport);

        none = new Texture("StartGame190x46.png");
        click = new Texture("StartGame_Click190x46.png");

        Drawable noneDr = new TextureRegionDrawable(new TextureRegion(none));
        Drawable clickDr = new TextureRegionDrawable(new TextureRegion(click));

        Button button = new Button(noneDr, clickDr);
        button.setPosition((viewport.getScreenWidth() / 2) / 100, (viewport.getScreenHeight() / 2) / 100);
        button.setSize(190, 46);
        stage.addActor(button);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 0.5f, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);

        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
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
        stage.dispose();
        none.dispose();
        click.dispose();
    }
}

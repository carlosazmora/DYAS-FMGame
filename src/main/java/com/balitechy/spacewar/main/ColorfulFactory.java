package com.balitechy.spacewar.main;

public class ColorfulFactory implements GameRenderFactory{

    @Override
    public BackgroundRenderer crearBackgroundRenderer(Game game) {
        return new ColorfulBackgroundRenderer() {
        };
    }

    @Override
    public PlayerRenderer crearPlayerRenderer(Game game) {
        return new ColorfulPlayerRenderer();
    }

    @Override
    public BulletRenderer crearBulletRenderer(Game game) {
        return new ColorfulBulletRenderer();
    }
}

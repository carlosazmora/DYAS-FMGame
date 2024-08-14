package com.balitechy.spacewar.main;

public class RetroFactory implements GameRenderFactory{

    @Override
    public BackgroundRenderer crearBackgroundRenderer(Game game) {
        return new RetroBackgroundRenderer() {
        };
    }

    @Override
    public PlayerRenderer crearPlayerRenderer(Game game) {
        return new RetroPlayerRenderer();
    }

    @Override
    public BulletRenderer crearBulletRenderer(Game game) {
        return new RetroBulletRenderer();
    }
}

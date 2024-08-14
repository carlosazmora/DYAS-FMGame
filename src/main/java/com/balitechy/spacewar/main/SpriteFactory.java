package com.balitechy.spacewar.main;

public class SpriteFactory implements GameRenderFactory{

    @Override
    public BackgroundRenderer crearBackgroundRenderer(Game game) {
        return new SpriteBackgroundRenderer(game) {
        };
    }

    @Override
    public PlayerRenderer crearPlayerRenderer(Game game) {
        return new SpritePlayerRenderer(game);
    }

    @Override
    public BulletRenderer crearBulletRenderer(Game game) {
        return new SpriteBulletRenderer(game);
    }
}

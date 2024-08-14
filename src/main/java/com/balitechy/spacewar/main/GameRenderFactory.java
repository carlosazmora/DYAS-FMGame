package com.balitechy.spacewar.main;

import java.awt.*;
import java.io.IOException;

public interface GameRenderFactory {

    BackgroundRenderer crearBackgroundRenderer (Game game);
    PlayerRenderer crearPlayerRenderer (Game game);
    BulletRenderer crearBulletRenderer (Game game);
}

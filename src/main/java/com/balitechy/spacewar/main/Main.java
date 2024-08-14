package com.balitechy.spacewar.main;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        GameRenderFactory gameRenderFactory = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, que estilo de juego deseas?:" +
                "\n1) Sprites \n2) Retro \n3) Colores");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                gameRenderFactory = new SpriteFactory();
                break;

            case 2:
                //gameRenderFactory = new RetroFactory();
                break;

            case 3:
                //gameRenderFactory = new ColorfulFactory();
                break;

            default:
                System.out.println("Ingresaste una opción invalida");
                System. exit(0);
                break;
        }

        Game game = new Game(gameRenderFactory);
        game.setPreferredSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
        game.setMaximumSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
        game.setMinimumSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));

        JFrame frame = new JFrame(game.TITLE);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();
    }
}

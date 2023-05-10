package gg.petrushka.logic;

import gg.petrushka.Main;

import java.awt.*;

public class Camera {

    private static int x = Main.player.getX();
    private static int y = Main.player.getY();
    private static int width = 2080;
    private static int height = 1200;

    public static void reloadPos(){
        x = Main.player.getX();
        y = Main.player.getY();
    }
    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static Rectangle getViewPort(){
        return new Rectangle(x, y, width, height);
    }
}

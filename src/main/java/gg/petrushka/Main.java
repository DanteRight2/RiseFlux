package gg.petrushka;

import gg.petrushka.graphics.GameWindow;
import gg.petrushka.graphics.menus.ChapterMenu;
import gg.petrushka.logic.GameThread;
import gg.petrushka.logic.inventory.GameInventory;
import gg.petrushka.logic.player.Player;
import gg.petrushka.logic.player.PlayerState;

public class Main {

    public static Player player;
    public static GameWindow window;
    public static GameThread thread;
    public static void main(String[] args) {
         player = new Player();
         player.setX(880);
         player.setY(1920);
         player.canMove = true;
         player.isOffsetMoving = false;
         player.state = PlayerState.CHAPTER_MENU;
         ChapterMenu.loadContent();
         GameInventory.loadContent();
         window = new GameWindow();
         window.open();
    }
}
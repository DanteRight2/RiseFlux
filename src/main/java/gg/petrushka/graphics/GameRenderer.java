package gg.petrushka.graphics;

import gg.petrushka.Main;
import gg.petrushka.chapters.ChapterManager;
import gg.petrushka.graphics.menus.ChapterMenu;
import gg.petrushka.logic.Camera;
import gg.petrushka.logic.inventory.GameInventory;
import gg.petrushka.logic.player.Player;
import gg.petrushka.logic.player.PlayerState;
import gg.petrushka.room.GroundTile;
import gg.petrushka.room.ObjectTile;

import javax.swing.*;
import java.awt.*;

public class GameRenderer extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        Player player1 = Main.player;
        int transX = player1.getX();
        int transY = player1.getY();
        Rectangle view = Camera.getViewPort();
        if(Main.player.state != PlayerState.CHAPTER_MENU){
            for(GroundTile tile : ChapterManager.chapter1Data.room.groundTiles){
                if(!view.intersects(tile.getX(), tile.getY(), tile.getSize(), tile.getSize())) continue;
                graphics2D.drawImage(tile.getTileImage(), tile.getX() - transX, tile.getY() - transY, 80, 80, this);
            }
            for(ObjectTile tile : ChapterManager.chapter1Data.room.objectLayer){
                if(!view.intersects(tile.getX(), tile.getY(), tile.getWidth(), tile.getHeight())) continue;
                graphics2D.drawImage(tile.getImage(), tile.getX() - transX, tile.getY() - transY, tile.getWidth() + 15, tile.getHeight() + 20, this);
                if(player1.getYOffset() + 70 > tile.getY() - transY){
                    graphics2D.drawImage(ImageManager.player, player1.getXOffset(), player1.getYOffset(), player1.getWidth(), player1.getHeight(), this);
                }
            }
        }
        if(Main.player.state == PlayerState.CHAPTER_MENU){
            ChapterMenu.drawMenu(graphics2D);
        }
        GameInventory.drawInventory(graphics2D);
    }

    public void sort(){
        ChapterManager.chapter1Data.room.objectLayer.sort(new YComparator());
    }
}

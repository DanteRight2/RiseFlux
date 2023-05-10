package gg.petrushka.graphics.menus;

import gg.petrushka.Main;
import gg.petrushka.chapters.ChapterData;
import gg.petrushka.chapters.ChapterManager;
import gg.petrushka.logic.GameThread;
import gg.petrushka.logic.animations.PlayerAnimator;
import gg.petrushka.logic.inventory.GameInventory;
import gg.petrushka.logic.player.PlayerState;
import gg.petrushka.room.RoomLoader;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class ChapterMenu {

    private static Font font;
    public static int selectedChapter = 1;

    public static void drawMenu(Graphics2D graphics2D){
        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(0, 0, 1920, 1080);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setFont(font);
        drawChaptersButtons(graphics2D);
    }

    private static final Color color = new Color(248, 23, 62);
    private static void drawChaptersButtons(Graphics2D graphics2D){
        if(selectedChapter == 1){
            graphics2D.setColor(Color.ORANGE);
            font = font.deriveFont(50f);
            graphics2D.setFont(font);
            graphics2D.drawString("Глава 1", 300, 200);
            graphics2D.drawString("Зло", 850, 200);
            //graphics2D.drawString("[Изображение]", 1200, 200);
            graphics2D.setColor(Color.WHITE);
            font = font.deriveFont(42f);
            graphics2D.setFont(font);

            graphics2D.setColor(color);

            graphics2D.drawString("Глава 2", 300, 400);
            graphics2D.drawString("Очищение", 850, 400);
            //graphics2D.drawString("[Изображение]", 1200, 550);

            graphics2D.drawString("Глава 3", 300, 600);
            graphics2D.drawString("Добро", 850, 600);
            //graphics2D.drawString("[Изображение]", 1200, 900);

            graphics2D.setColor(Color.WHITE);
            graphics2D.drawString("Выйти", 870, 1020);
        }

        if(selectedChapter == 2){
            graphics2D.drawString("Глава 1", 300, 200);
            graphics2D.drawString("Зло", 850, 200);
            //graphics2D.drawString("[Изображение]", 1200, 200);

            graphics2D.setColor(color);

            graphics2D.drawString("Глава 2", 300, 400);
            graphics2D.drawString("Очищение", 850, 400);
            //graphics2D.drawString("[Изображение]", 1200, 550);

            graphics2D.drawString("Глава 3", 300, 600);
            graphics2D.drawString("Добро", 850, 600);
            //graphics2D.drawString("[Изображение]", 1200, 900);

            graphics2D.setColor(Color.ORANGE);
            font = font.deriveFont(50f);
            graphics2D.setFont(font);
            graphics2D.drawString("Выйти", 870, 1020);
            graphics2D.setColor(Color.WHITE);
            font = font.deriveFont(42f);
            graphics2D.setFont(font);
        }

        /*graphics2D.drawLine(230, 100, 1620, 100);
        graphics2D.drawLine(230, 300, 1620, 300);
        graphics2D.drawLine(230, 500, 1620, 500);
        graphics2D.drawLine(230, 700, 1620, 700);*/
    }

    public static void startChapter1(){
        ChapterManager.chapter1Data = new ChapterData();
        ChapterManager.chapter1Data.room = RoomLoader.room1;
        ChapterManager.chapter1Data.room.setPlayMode();
        ChapterManager.chapter1Data.roomNum = 1;
        PlayerAnimator.loadAnimations();
        Main.window.renderer.sort();
        Main.player.state = PlayerState.INNOCENT;
        GameInventory.addItem(0, 3);
        Main.window.setMovementController();
        Main.window.renderer.repaint();
        Main.thread = new GameThread();
        Main.thread.start();
    }

    public static void loadContent(){
        try {
            InputStream is = ChapterMenu.class.getResourceAsStream("/pixel.ttf");
            assert is != null;
            font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = font.deriveFont(40f);
        } catch (IOException | FontFormatException e){
            e.printStackTrace();
        }
    }
}

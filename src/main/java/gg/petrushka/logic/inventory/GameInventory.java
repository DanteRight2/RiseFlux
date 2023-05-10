package gg.petrushka.logic.inventory;

import gg.petrushka.Main;
import gg.petrushka.graphics.menus.ChapterMenu;
import gg.petrushka.logic.player.PlayerState;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class GameInventory {

    private static Font pixel;
    private static final int[] items = new int[12];
    public static int selectedSlot = 6;

    public static void addItem(int slot, int id){
        items[slot] = id;
    }

    public static void removeItem(int slot){
        items[slot] = 0;
    }

    public static int getItem(int slot){
        return items[slot];
    }

    public static String getItemName(int slot){
        String name = null;
        int item = items[slot];
        if(item == 0){
            name = "[ѕ”—“ќ]";
        }
        if(item == 1){
            name = "“Ємн’леб";
        }
        if(item == 2){
            name = "—квернѕирог";
        }
        if(item == 3){
            name = "“ЄмнЋеденец";
        }
        return name;
    }
    public static int getItemHeal(int slot){
        int heal = 0;
        int item = items[slot];
        if(item == 1){
            heal = 5;
        }
        if(slot == 2){
            heal = 8;
        }
        if(slot == 3){
            heal = 12;
        }
        return heal;
    }
    private static final Color dark = new Color(0f, 0f, 0f, 0.65f);
    public static void drawInventory(Graphics2D graphics2D){
        if(Main.player.state != PlayerState.IN_INVENTORY) return;
        graphics2D.setColor(dark);
        graphics2D.fillRect(0, 0, 1920, 1080);
        Font font = pixel;
        graphics2D.setFont(font.deriveFont(65f));
        graphics2D.setColor(Color.ORANGE);
        graphics2D.drawString("»нвентарь", 700, 100);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setFont(font.deriveFont(30f));
        for(int i = 0; i < 12; i++){
            if(selectedSlot == i){
                graphics2D.setColor(Color.ORANGE);
                graphics2D.setFont(font.deriveFont(37f));
                graphics2D.drawString(getItemName(i), 160, 200 + 55 * i);
                graphics2D.setColor(Color.WHITE);
                graphics2D.setFont(font.deriveFont(30f));
                continue;
            }
            if(getItem(i) == 0){
                graphics2D.setColor(Color.GRAY);
                graphics2D.drawString(getItemName(i), 160, 200 + 55 * i);
                graphics2D.setColor(Color.WHITE);
                continue;
            }
            graphics2D.drawString(getItemName(i), 160, 200 + 55 * i);
        }
    }

    public static void loadContent(){
        try {
            InputStream is = ChapterMenu.class.getResourceAsStream("/pixel.ttf");
            assert is != null;
            pixel = Font.createFont(Font.TRUETYPE_FONT, is);
            pixel = pixel.deriveFont(40f);
        } catch (IOException | FontFormatException e){
            e.printStackTrace();
        }
    }
}

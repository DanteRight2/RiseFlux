package gg.petrushka.logic.controllers;

import gg.petrushka.Main;
import gg.petrushka.graphics.menus.ChapterMenu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChapterMenuController implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 81 && ChapterMenu.selectedChapter == 1){
            ChapterMenu.startChapter1();
        }
        if(code == 81 && ChapterMenu.selectedChapter == 2){
            System.exit(-1);
        }
        if(code != KeyEvent.VK_UP && code != KeyEvent.VK_DOWN) return;
        if(code == KeyEvent.VK_UP){
            if(ChapterMenu.selectedChapter == 1) return;
            ChapterMenu.selectedChapter--;
        }
        if(code == KeyEvent.VK_DOWN){
            if(ChapterMenu.selectedChapter == 2) return;
            ChapterMenu.selectedChapter++;
        }
        Main.window.renderer.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

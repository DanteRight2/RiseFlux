package gg.petrushka.logic;

import gg.petrushka.Main;

public class GameThread extends Thread{


    @Override
    public void run(){
        while (true){
            Main.player.updatePosition();
            Main.window.renderer.repaint();
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

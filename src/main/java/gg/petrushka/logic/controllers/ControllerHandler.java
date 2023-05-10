package gg.petrushka.logic.controllers;

import gg.petrushka.Main;
import gg.petrushka.logic.animations.PlayerAnimator;
import gg.petrushka.logic.inventory.GameInventory;
import gg.petrushka.logic.player.Player;
import gg.petrushka.logic.player.PlayerState;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControllerHandler implements KeyListener {
    private final Player player = Main.player;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 69){
            if(player.state == PlayerState.IN_INVENTORY){
                player.state = PlayerState.INNOCENT;
                return;
            }
            if(player.state == PlayerState.INNOCENT){
                player.state = PlayerState.IN_INVENTORY;
            }
        }
        if(code == KeyEvent.VK_UP){
            if(player.state == PlayerState.IN_INVENTORY && GameInventory.selectedSlot >= 1){
                GameInventory.selectedSlot--;
            }
            player.isUp = true;
        }
        if(code == KeyEvent.VK_DOWN){
            if(player.state == PlayerState.IN_INVENTORY && GameInventory.selectedSlot <= 10){
                GameInventory.selectedSlot++;
            }
            player.isDown = true;
        }
        if(code == KeyEvent.VK_LEFT){
            player.isLeft = true;
        }
        if(code == KeyEvent.VK_RIGHT){
            player.isRight = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            player.isUp = false;
        }
        if(code == KeyEvent.VK_DOWN){
            player.isDown = false;
        }
        if(code == KeyEvent.VK_LEFT){
            player.isLeft = false;
        }
        if(code == KeyEvent.VK_RIGHT){
            player.isRight = false;
        }
    }
}

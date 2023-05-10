package gg.petrushka.logic.player;

import gg.petrushka.graphics.ImageManager;
import gg.petrushka.logic.Camera;
import gg.petrushka.logic.animations.PlayerAnimator;

public class Player {

    public PlayerState state = PlayerState.CHAPTER_MENU;
    private int x;
    private int y;
    private int width = 90;
    private int height = 200;

    private int xOffset = 950;
    private int yOffset = 500;

    private final int speed = 4;
    public boolean isUp = false;
    public boolean isDown = false;
    public boolean isRight = false;
    public boolean isLeft = false;
    public boolean canMove = false;
    public boolean isOffsetMoving = false;
    private String direction = "down";

    public void updatePosition(){
        if(!canMove) return;
        if(state != PlayerState.INNOCENT) return;
        Camera.reloadPos();
        if(isOffsetMoving){
            if(isUp){
                yOffset -= speed;
                PlayerAnimator.stopLeftWalkAnimation();
                PlayerAnimator.stopRightWalkAnimation();
                ImageManager.player = ImageManager.playerUp;
                direction = "up";
                return;
            }
            if(isDown){
                yOffset += speed;
                PlayerAnimator.stopLeftWalkAnimation();
                PlayerAnimator.stopRightWalkAnimation();
                ImageManager.player = ImageManager.playerDown;
                direction = "down";
                return;
            }
            if(isRight && isLeft){
                xOffset -= speed;
                PlayerAnimator.stopRightWalkAnimation();
                PlayerAnimator.startLeftWalkAnimation();
                Camera.reloadPos();
                direction = "left";
                return;
            }
            if(isLeft){
                xOffset -= speed;
                PlayerAnimator.stopRightWalkAnimation();
                PlayerAnimator.startLeftWalkAnimation();
                direction = "left";
                return;
            }
            if(isRight){
                xOffset += speed;
                PlayerAnimator.stopLeftWalkAnimation();
                PlayerAnimator.startRightWalkAnimation();
                direction = "right";
                return;
            }
        }
        if(!isOffsetMoving){
            if(isUp){
                y -= speed;
                PlayerAnimator.stopDownWalkAnimation();
                PlayerAnimator.stopLeftWalkAnimation();
                PlayerAnimator.stopRightWalkAnimation();
                ImageManager.player = ImageManager.playerUp;
                direction = "up";
                return;
            }
            if(isDown){
                y += speed;
                PlayerAnimator.stopLeftWalkAnimation();
                PlayerAnimator.stopRightWalkAnimation();
                PlayerAnimator.startDownWalkAnimation();
                direction = "down";
                return;
            }
            if(isRight && isLeft){
                x -= speed;
                PlayerAnimator.stopDownWalkAnimation();
                PlayerAnimator.stopRightWalkAnimation();
                PlayerAnimator.startLeftWalkAnimation();
                Camera.reloadPos();
                direction = "left";
                return;
            }
            if(isLeft){
                x -= speed;
                PlayerAnimator.stopDownWalkAnimation();
                PlayerAnimator.stopRightWalkAnimation();
                PlayerAnimator.startLeftWalkAnimation();
                direction = "left";
                return;
            }
            if(isRight){
                x += speed;
                PlayerAnimator.stopDownWalkAnimation();
                PlayerAnimator.stopLeftWalkAnimation();
                PlayerAnimator.startRightWalkAnimation();
                direction = "right";
            }
        }
        if(!isUp && !isRight && !isLeft && !isDown){
            PlayerAnimator.stopDownWalkAnimation();
            PlayerAnimator.stopRightWalkAnimation();
            PlayerAnimator.stopLeftWalkAnimation();
            if(direction == "up"){
                ImageManager.player = ImageManager.playerUp;
                return;
            }
            if(direction == "right"){
                ImageManager.player = ImageManager.playerRight;
                return;
            }
            if(direction == "left"){
                ImageManager.player = ImageManager.playerLeft;
                return;
            }
            if(direction == "down"){
                ImageManager.player = ImageManager.playerDown;
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getXOffset() {
        return xOffset;
    }

    public void setXOffset(int xOffset) {
        this.xOffset = xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }

    public void setYOffset(int yOffset) {
        this.yOffset = yOffset;
    }

}

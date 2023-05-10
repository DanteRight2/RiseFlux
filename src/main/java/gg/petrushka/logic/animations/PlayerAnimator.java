package gg.petrushka.logic.animations;

import gg.petrushka.Main;
import gg.petrushka.graphics.ImageManager;

import java.awt.image.BufferedImage;

public class PlayerAnimator {
    private static final BufferedImage[] leftImages = new BufferedImage[4];
    private static final BufferedImage[] rightImages = new BufferedImage[4];
    private static final BufferedImage[] downImages = new BufferedImage[4];
    private static final BufferedImage[] upImages = new BufferedImage[4];
    private static FrameAnimation leftAnim;
    private static FrameAnimation rightAnim;
    private static FrameAnimation downAnim;
    private static FrameAnimation upAnim;
    public static void loadAnimations(){
        rightImages[0] = ImageManager.playerRight;
        rightImages[1] = ImageManager.playerRight1;
        rightImages[2] = ImageManager.playerRight;
        rightImages[3] = ImageManager.playerRight2;
        leftImages[0] = ImageManager.playerLeft;
        leftImages[1] = ImageManager.playerLeft1;
        leftImages[2] = ImageManager.playerLeft;
        leftImages[3] = ImageManager.playerLeft2;
        downImages[0] = ImageManager.playerDown;
        downImages[1] = ImageManager.playerDown1;
        downImages[2] = ImageManager.playerDown;
        downImages[3] = ImageManager.playerDown2;
        rightAnim = new FrameAnimation(rightImages, 275, ImageManager.player);
        leftAnim = new FrameAnimation(leftImages, 275, ImageManager.player);
        downAnim = new FrameAnimation(downImages, 275, ImageManager.player);
    }


    private static boolean isDownStarted = false;
    public static void startDownWalkAnimation(){
        if(isDownStarted) return;
        downAnim.start();
        isDownStarted =  true;
    }

    public static void stopDownWalkAnimation(){
        if(!isDownStarted) return;
        downAnim.stop();
        isDownStarted = false;
    }

    private static boolean isLeftStarted = false;
    public static void startLeftWalkAnimation(){
        if(isLeftStarted) return;
        leftAnim.start();
        isLeftStarted = true;
    }
    public static void stopLeftWalkAnimation(){
        if(!isLeftStarted) return;
        leftAnim.stop();
        isLeftStarted = false;
    }
    private static boolean isRightStarted = false;
    public static void startRightWalkAnimation(){
        if(isRightStarted) return;
        rightAnim.start();
        isRightStarted = true;
    }
    public static void stopRightWalkAnimation(){
        if(!isRightStarted) return;
        rightAnim.stop();
        isRightStarted = false;
    }
    public static void startUpWalkAnimation(){
    }

}

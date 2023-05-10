package gg.petrushka.logic.animations;

import gg.petrushka.Main;
import gg.petrushka.graphics.ImageManager;

import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

public class FrameAnimation {

    public BufferedImage image;
    public BufferedImage[] frames;
    public int playingTime;
    private Timer timer;

    public FrameAnimation(BufferedImage[] frames, int time, BufferedImage image){
        this.frames = frames;
        this.playingTime = time;
        timer = new Timer();
    }

    private int a = 0;
    public void start(){
        if(timer == null){
            timer = new Timer();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ImageManager.player = frames[a];
                a++;
                if(a >= frames.length){
                    a = 0;
                }
            }
        }, 0, playingTime);
    }

    public void stop(){
        timer.purge();
        timer.cancel();
        if(timer != null){
            timer = null;
        }
    }
}

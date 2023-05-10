package gg.petrushka.room;

import gg.petrushka.Main;
import gg.petrushka.graphics.ImageManager;

import java.awt.image.BufferedImage;
import java.io.Serializable;

public class GroundTile implements Serializable {

    private int x;
    private int y;
    private int size = 40;

    private int tileImage = 1;

    public GroundTile(){

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BufferedImage getTileImage() {
        BufferedImage image = null;
        if(tileImage == 1){
            image = ImageManager.darkImage;
        }

        if(tileImage == 2){
            image = ImageManager.roadImg;
        }
        if(tileImage == 3){
            image = ImageManager.leftRoadIMG;
        }
        if(tileImage == 4){
            image = ImageManager.rightRoadImg;
        }
        if(tileImage == 5){
            image = ImageManager.topRoadImg;
        }
        if(tileImage == 6){
            image = ImageManager.southRoad;
        }
        if(tileImage == 7){
            image = ImageManager.leftSouthImg;
        }
        if(tileImage == 8){
            image = ImageManager.leftTopImg;
        }
        if(tileImage == 9){
            image = ImageManager.rightSouthImg;
        }
        if(tileImage == 10){
            image = ImageManager.rightTopImg;
        }
        return image;
    }
    public int getTileImageToInt(){
        return tileImage;
    }

    public void setTileImage(int tileImage) {
        this.tileImage = tileImage;
    }
}

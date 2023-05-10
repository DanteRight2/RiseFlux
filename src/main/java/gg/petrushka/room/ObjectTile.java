package gg.petrushka.room;

import gg.petrushka.Main;
import gg.petrushka.graphics.ImageManager;

import java.awt.image.BufferedImage;
import java.io.Serializable;

public class ObjectTile implements Serializable {

    public int width;
    public int height;
    public int x;
    public int y;
    public ObjectType objectType;
    private int image;

    public ObjectTile(int x, int y, ObjectType objectType){
        if(objectType == ObjectType.TREE){
            width = 90;
            height = 110;
            image = 1;
        }
        if(objectType == ObjectType.STONE){
            width = 40;
            height = 40;
            image = 2;
        }
        if(objectType == ObjectType.STICK){
            width = 20;
            height = 20;
            image = 3;
        }
        if(objectType == ObjectType.STUMP){
            width = 50;
            height = 35;
            image = 4;
        }
        this.x = x;
        this.y = y;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public BufferedImage getImage() {
        BufferedImage tile = null;
        if(image == 1){
            tile = ImageManager.treeImg;
        }
        if(image == 2){
            tile = ImageManager.stoneImg;
        }
        if(image == 3){
            tile = ImageManager.stickImg;
        }
        if(image == 4){
            tile = ImageManager.treeImg;
        }
        return tile;
    }

}

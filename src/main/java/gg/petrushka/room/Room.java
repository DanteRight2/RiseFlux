package gg.petrushka.room;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Room implements Serializable {

    public List<GroundTile> groundTiles = new ArrayList<>();
    public List<ObjectTile> objectLayer = new ArrayList<>();
    public final int borderX = 0;
    public final int borderY = 0;
    private String name = "roommm";
    public int borderWidth;
    public int borderHeight;

    public Room(int width, int height){
        int scale;
        scale = 40;
        setBorderWidth(width * scale);
        setBorderHeight(height * scale);
        for(int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                GroundTile tile = new GroundTile();
                tile.setX(x * scale);
                tile.setY(y * scale);
                groundTiles.add(tile);
                tile.setTileImage(1);
            }
        }
    }
    public int getBorderX() {
        return borderX;
    }

    public int getBorderY() {
        return borderY;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public int getBorderHeight() {
        return borderHeight;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setBorderHeight(int borderHeight) {
        this.borderHeight = borderHeight;
    }

    public List<GroundTile> getGroundTiles() {
        return groundTiles;
    }

    public List<ObjectTile> getObjectLayer() {
        return objectLayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayMode(){
        for (GroundTile tile : groundTiles) {
            tile.setSize((int) (tile.getSize() * 2));
            tile.setX((int) (tile.getX() * 2 - (tile.getX() * 2 / 41)));
            tile.setY((int) (tile.getY() * 2 - (tile.getY() * 2 / 41)));
        }
        for(ObjectTile tile : getObjectLayer()){
            tile.width = (int) (tile.getWidth() * 2);
            tile.height = (int) (tile.getHeight() * 2);
            tile.x = (int) (tile.getX() * 2 - (tile.getX() * 2 / 42)) - 20;
            tile.y = (int) (tile.getY() * 2 - (tile.getY() * 2 / 41));
        }
    }
}

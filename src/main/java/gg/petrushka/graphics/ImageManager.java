package gg.petrushka.graphics;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageManager {

    public static BufferedImage darkImage;
    public static BufferedImage roadIMG;
    public static BufferedImage leftSouthImg;
    public static BufferedImage rightSouthImg;
    public static BufferedImage leftTopImg;
    public static BufferedImage rightTopImg;
    public static BufferedImage horizontalRoad;
    public static BufferedImage treeImg;
    public static BufferedImage stoneImg;
    public static BufferedImage stickImg;
    public static BufferedImage player;
    public static BufferedImage playerDown;
    public static BufferedImage playerDown1;
    public static BufferedImage playerDown2;
    public static BufferedImage playerLeft;
    public static BufferedImage playerLeft1;
    public static BufferedImage playerLeft2;
    public static BufferedImage playerRight;
    public static BufferedImage playerRight1;
    public static BufferedImage playerRight2;
    public static BufferedImage playerUp;
    public static BufferedImage roadImg;
    public static BufferedImage leftRoadIMG;
    public static BufferedImage rightRoadImg;
    public static BufferedImage topRoadImg;
    public static BufferedImage southRoad;

    public void loadImage(){
        try {
            darkImage = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/ground.png"));
            leftRoadIMG = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/leftRoad.png"));
            leftTopImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/tlRoad.png"));
            roadImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/road.png"));
            rightRoadImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/rightRoad.png"));
            topRoadImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/topRoad.png"));
            rightTopImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/trRoad.png"));
            southRoad = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/downRoad.png"));
            leftSouthImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/slRoad.png"));
            rightSouthImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/road/srRoad.png"));
            treeImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/objects/tree.png"));
            stoneImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/objects/stone.png"));
            stickImg = ImageIO.read(getClass().getResourceAsStream("/forestIMG/objects/stick.png"));
            playerDown = ImageIO.read(getClass().getResourceAsStream("/player/PlayerDown_0.png"));
            playerDown1 = ImageIO.read(getClass().getResourceAsStream("/player/PlayerDown_1.png"));
            playerDown2 = ImageIO.read(getClass().getResourceAsStream("/player/PlayerDown_2.png"));
            playerRight = ImageIO.read(getClass().getResourceAsStream("/player/PlayerRight_0.png"));
            playerRight1 = ImageIO.read(getClass().getResourceAsStream("/player/PlayerRight_1.png"));
            playerRight2 = ImageIO.read(getClass().getResourceAsStream("/player/PlayerRight_2.png"));
            playerLeft = ImageIO.read(getClass().getResourceAsStream("/player/PlayerLeft_0.png"));
            playerLeft1 = ImageIO.read(getClass().getResourceAsStream("/player/PlayerLeft_1.png"));
            playerLeft2 = ImageIO.read(getClass().getResourceAsStream("/player/PlayerLeft_2.png"));
            playerUp = ImageIO.read(getClass().getResourceAsStream("/player/PlayerUp_0.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

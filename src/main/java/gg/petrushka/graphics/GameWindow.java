package gg.petrushka.graphics;

import gg.petrushka.logic.controllers.ChapterMenuController;
import gg.petrushka.logic.controllers.ControllerHandler;

import javax.swing.*;
import java.awt.*;

public class GameWindow {

    private JFrame frame;
    public GameRenderer renderer;
    private final ChapterMenuController chapterMenuController = new ChapterMenuController();
    private final ControllerHandler controllerHandler = new ControllerHandler();
    public ImageManager imageManager = new ImageManager();
    public void open(){
        frame = new JFrame("RiseFlux");
        frame.setSize(1920, 1080);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setUndecorated(true);
        imageManager.loadImage();
        renderer = new GameRenderer();
        renderer.repaint();
        frame.setContentPane(renderer);
        frame.addKeyListener(chapterMenuController);
        frame.setVisible(true);
    }

    public void close(){
        frame.setVisible(false);
    }

    public void setMovementController(){
        frame.removeKeyListener(chapterMenuController);
        frame.addKeyListener(controllerHandler);
    }
}

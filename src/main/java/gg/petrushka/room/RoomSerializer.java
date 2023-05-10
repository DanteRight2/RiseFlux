package gg.petrushka.room;

import gg.petrushka.Main;

import java.io.*;

public class RoomSerializer {

    public Room deserializeRoom(String path){
        Room room = null;
        ClassLoader loader = getClass().getClassLoader();
        File file = new File(loader.getResource(path).getFile());
        ObjectInputStream inputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            inputStream = new ObjectInputStream(fileInputStream);
            room = (Room) inputStream.readObject();

        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return room;
    }
}

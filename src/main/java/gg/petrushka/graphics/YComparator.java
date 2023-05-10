package gg.petrushka.graphics;

import gg.petrushka.room.ObjectTile;

import java.util.Comparator;

public class YComparator implements Comparator<ObjectTile> {
    @Override
    public int compare(ObjectTile o1, ObjectTile o2) {
        return o1.getY() - o2.getY();
    }
}

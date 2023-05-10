package gg.petrushka.room;

public class RoomLoader {
    private static final RoomSerializer serializer = new RoomSerializer();
    public static Room room1 = serializer.deserializeRoom("rooms/Room_1.room");
    public static Room room2 = serializer.deserializeRoom("rooms/Room_2.room");
    public static Room room3 = serializer.deserializeRoom("rooms/Room_3.room");
    //public static Room room4 = serializer.deserializeRoom("rooms/Room_4.room");

}

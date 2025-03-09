package Lesson1;

public class Room {
    private boolean entrance;
    private int rooms;

    public Room(boolean entrance, int rooms) {
        this.entrance = entrance;
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isEntrance() {
        return entrance;
    }

    public void setEntrance(boolean entrance) {
        this.entrance = entrance;
    }

    public void print() {
        System.out.println("Комната проходная: " + entrance);
    }
}

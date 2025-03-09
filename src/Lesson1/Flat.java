package Lesson1;

public class Flat {
    private Room room;
    private int numberFlat;
    private int flats;

    public Flat(Room room, int numberFlat, int flats) {
        this.room = room;
        this.numberFlat = numberFlat;
        this.flats = flats;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public int getFlat() {
        return flats;
    }

    public void setFlat(int flat) {
        this.flats = flats;
    }

    public void print() {
        System.out.println("Номер квартиры: " + numberFlat + ", " + "количество комнат: " + room.getRooms());
    }
}

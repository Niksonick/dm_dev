package Lesson1;

public class Floor {
    private int numberFloor;
    private Flat flat;
    private int floors;

    public Floor(int numberFloor, int floors, Flat flat) {
        this.numberFloor = numberFloor;
        this.floors = floors;
        this.flat = flat;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public void print() {
        System.out.println("Номер этажа: " + numberFloor + ", " + "количество квартир: " + flat.getFlat());
    }
}

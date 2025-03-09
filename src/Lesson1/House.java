//Представить в виде классов и их композиции следующую модель.
//
//        - Каждый дом содержит свой номер (int), и этажей (int).
//
//        - Каждый этаж содержит номер этажа (int), и квартир (int).
//
//        - Каждая квартира содержит свой номер (int), и комнат (int).
//
//        - Каждая комната содержит поле проходная она или нет (boolean).
//
//В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
//
//Например, метод print класса этаж должен выводить на консоль:
//
//        “Этаж 2, количество квартир 18”
//
//Создание всех объектов вынести в отдельный класс с методом main.
//


package Lesson1;

public class House {
    private int numberHouse;
    private Floor floor;

    public House(int numberHouse, Floor floor) {
        this.numberHouse = numberHouse;
        this.floor = floor;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }


    public void print(){
        System.out.println("Номер дома: " + numberHouse + ", " + "количество этажей: " + floor.getFloors());
    }
}

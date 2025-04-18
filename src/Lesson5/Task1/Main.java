//Создать класс, описывающий банкомат.
//
//Банкомат задается тремя свойствами:
//        - количеством купюр номиналом 10, 20 и 50.
//
//Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
//
//Сделать методы для добавления денег в банкомат.
//
//        Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
//
//При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
//
//Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10
//
//        (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).

package Lesson5.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(100, 100, 100);
        bankomat.addMoney(10000, 100);
        System.out.println(bankomat.getMoney(480));

    }
}

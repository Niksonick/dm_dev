/*  Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку "****" перед каждым четырёхсимвольным элементом.
Оригинальные элементы должны остаться на месте.
Например:
        {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
        ->
        {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}      */


package Lesson7.Task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        MarkLength.markLength4(strings);
        System.out.println(strings);

    }
}

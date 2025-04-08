//  Создать класс Student, представляющий собой ученика.
//  Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
//  Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
//  Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.


package Lesson7.Task2;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ianov", 21, 4.9),
                new Student("Alisa", "Albertova", 22, 3.8),
                new Student("Sidr", "Sidorov", 24, 4.1),
                new Student("Alena", "Alinova", 19, 2.8)
        );

    }
}

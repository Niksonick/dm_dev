//Дана строка с текстом, в котором есть цифры от 0 до 9.
//
//Написать 2 метода:
//
//        - возвращающий массив цифр из переданной строки
//- возвращающий сумму цифр из переданного целочисленного массива
//
//Посчитать сумму всех чисел из строки
//
//Например:
//        “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
package Lesson4.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String value = "dasd 0 1 2 cadasdweqw 3, dasdas4, 5 dasdas 6 dasdas 9 1 1 ывфы 5 3";
        System.out.println(Arrays.toString(stringToChars(value)));
        System.out.println(summa(stringToChars(value)));

    }

    public static char[] stringToChars(String value) {
        value = value.replaceAll("[^-?0-9]+", "");
        char[] chars = value.toCharArray();
        return chars;
    }

    public static int summa(char[] chars) {
        int sum = 0;
        for (char aChar : chars) {
            sum += Character.getNumericValue(aChar);
        }
        return sum;
    }
}

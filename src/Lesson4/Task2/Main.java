//Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
//Границы чисел: от 1 до 3999.
//
//
//        Предусмотреть случай, когда меньший символ идёт перед большим:
//Например CM == 900.
//
//Соответствие:
//
//   M 1000
//
//   D 500
//
//   C 100
//
//   L 50
//
//   X 10
//
//   V 5
//
//   I 1
package Lesson4.Task2;

public class Main {
    public static void main(String[] args) {
        String value = "LXXX";
        int result = convetTo(value);
        System.out.println(result);
    }

    private static int convetTo(String number){
        int prevArabic = getArabic(number.charAt(number.length()-1));
        int result = prevArabic;
        for (int i = number.length() - 2; i >= 0; i--) {
            int currentArabic = getArabic(number.charAt(i));
            result += currentArabic < prevArabic ? -currentArabic : currentArabic;
            prevArabic = currentArabic;
        }
        return result;

    }

    private static int getArabic(char charNumber){
        return switch (charNumber){
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}

//Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях.
package Lesson4.Task1;

public class Main {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String palindrom = "А масса налево повела нас сама";
        boolean result = isPalindrome(palindrom);
        System.out.println(result);
    }

    private static boolean isPalindrome(String palindrom) {
        String reverse = palindrom.replace(SPACE, EMPTY);
        return new StringBuilder(reverse).reverse().toString().equalsIgnoreCase(reverse);

    }

}

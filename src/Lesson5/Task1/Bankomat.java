package Lesson5.Task1;

public class Bankomat {

    private int nominal50;
    private int nominal20;
    private int nominal10;

    private final static int amountnominal50 = 50;
    private final static int amountnominal20 = 20;
    private final static int amountnominal10 = 10;

    public Bankomat(int nominal50, int nominal20, int nominal10) {
        this.nominal50 = nominal50;
        this.nominal20 = nominal20;
        this.nominal10 = nominal10;
    }

    public int getNominal50() {
        return nominal50;
    }

    public int getNominal20() {
        return nominal20;
    }

    public int getNominal10() {
        return nominal10;
    }

    public void addMoney(int balance, int amount) {
        if(getNominal50() + balance > getNominal50() || getNominal20() + balance > getNominal20() || getNominal10() + balance > getNominal10()) {
            switch (amount){
                case amountnominal50 -> nominal50 = getNominal50() + balance;
                case amountnominal20 -> nominal20 = getNominal20() + balance;
                case amountnominal10 -> nominal10 = getNominal10() + balance;
            }
            } else {
            System.out.println("Невозможно добавить");
        }
        System.out.println("Депозит в размере " + amount + " успешно зачислен.");
        System.out.println("Ваш баланс: " + balance);
    }

    public boolean getMoney(int sum){
       if(sum % 10 != 0){
           System.out.println("Невозможно получить сумму");
           return false;
       } else {
           int amount50 = sum / 50;
           int amount20 = (sum - amount50 * 50) / 20;
           int amount10 = (sum - amount50 * 50 - amount20 * 20) / 10;
           System.out.println("Количество купюр 50 х " + amount50 + " Количество купюр 20 х " + amount20 + " Количество купюр 10 х " + amount10);
           return true;
       }
    }


}

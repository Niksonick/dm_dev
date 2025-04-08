package Lesson5.Task3;

public class TrainingGround {

    public static void main(String[] args) {
        Hero archer = new Archer("Лучник", 10);
        Hero warrior = new Warrior("Воин", 12);
        Hero mage = new Mage("Маг", 14);
        Enemy enemy = new Enemy("Лейвод", 90);

        attackEnemy(enemy, warrior, mage, archer);
    }


    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }

}

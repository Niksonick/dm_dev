package Lesson5.Task3;

public class Warrior extends Hero{


    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " нанес урон мечом " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

package Lesson5.Task3;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " лучник нанес урон " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

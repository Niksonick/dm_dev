package Lesson5.Task3;

public class Mage extends Hero {


    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " нанес урон ледяной стрелой " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}

//Задача 1
//Создать класс Pair, параметризованный двумя параметрами K и V.
//Класс должен хранить две переменные типов K и V соответственно.
//У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров,
//toString (для отображения состояния текущего объекта типа Pair)
//Задача 2
//Создать статический обобщённый метод swap в утилитном классе PairUtil (утилитный класс – это класс только со статическими методами,
//который имеет private конструктор и помечен ключевым словом final, чтобы предотвратить создание объектов этого класса, а также наследоваться от него).
//
//Метод должен принимать объект класса Pair и возвращать новый объект Pair, в которой элементы поменяны местами.

package Lesson6.Task1;

public class Pair<K, V> {
    K one;
    V two;

    public Pair(K one, V two) {
        this.one = one;
        this.two = two;
    }

    public K getOne() {
        return one;
    }

    public void setOne(K one) {
        this.one = one;
    }

    public V getTwo() {
        return two;
    }

    public void setTwo(V two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }
}

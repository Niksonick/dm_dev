package Lesson7.Task2;

public class Student {

    private double averageScore;
    private String name;
    private String lastName;
    private int age;

    public Student(String name, String lastName, int age, double averageScore) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return getName() + " " + getLastName();
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "averageScore=" + averageScore +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

package Lesson7.Task2.Comparator;

import Lesson7.Task2.Student;

import java.util.Comparator;

public class StudentMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageScore(), o2.getAverageScore());
    }
}

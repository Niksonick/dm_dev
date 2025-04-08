package Lesson7.Task2.Comparator;

import Lesson7.Task2.Student;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}

package OOP4.src;

import OOP4.src.Model.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }

}
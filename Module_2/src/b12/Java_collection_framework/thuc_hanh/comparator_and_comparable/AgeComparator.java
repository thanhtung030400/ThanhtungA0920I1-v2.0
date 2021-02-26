package b12.Java_collection_framework.thuc_hanh.comparator_and_comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student student, Student t1) {
        if (student.getAge() > t1.getAge()){
            return 1;
        }else if (student.getAge() == t1.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
}

package doc_ghi_file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList = FileUntil.readCSV();

        for (Student student : studentList){
            System.out.println(student);
        }
    }
}

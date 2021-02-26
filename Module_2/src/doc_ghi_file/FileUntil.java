package doc_ghi_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {
    private static final String FILE_PATH = "D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\doc_ghi_file\\Student.CSV";
    public static final String COMMA = ",";


    public static void writeCSV(Student student) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter buffWrite = new BufferedWriter(fileWriter);
            buffWrite.write(student.getId() + COMMA + student.getName() + "\n");

            buffWrite.flush();

            buffWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Student> readCSV() {
        List<Student> studentList = new ArrayList<>();
        File file = new File(FILE_PATH);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Student student;
            while ((line = buffRead.readLine()) != null) {
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1]);
                studentList.add(student);
            }
            buffRead.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}

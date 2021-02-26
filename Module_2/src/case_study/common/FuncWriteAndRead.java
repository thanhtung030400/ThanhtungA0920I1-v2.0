package case_study.common;

import case_study.models.House;
import doc_ghi_file.FileUntil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteAndRead {
//    private static final String FILE_PATH= "D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\case_study\\data\\house.csv";
//    public static final String COMMA = ",";
    private String path;
    private BufferedWriter reader;

    public static String readFile(String path){
        String rs = "";
        FileReader fileReader;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line =null;

            while ((line = reader.readLine()) != null){
                rs += line;
                rs += "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rs;
    }


    public static void writeFile(String path,String data,Boolean append){

        try {
            BufferedWriter writer;
            if (append){
                writer = new BufferedWriter(new FileWriter(path,true));
            }else{
                writer = new BufferedWriter(new FileWriter(path,false));
            }
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //??
//    public static void writeFile(String toString) {
//    }
    //??
}

import b16.IO_text_file.thuc_hanh.add_number_in_file_text.ReadFileExample;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\text"));
            String line = bufferedReader.readLine();
            while (line != null){
                lines ++;
                String[] word = line.split(" ");
                words += word.length;
                for (String word1:word){
                    characters += word1.length();
                }line= bufferedReader.readLine();

            }
            System.out.println("number of lines" + lines);
            System.out.println("number of words" + words);
            System.out.println("number of characters" + characters);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }



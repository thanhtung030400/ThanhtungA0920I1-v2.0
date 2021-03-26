package test_module_2.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtilsModule2 {
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    private static String path;

    public static List<String> readFile() {

        List<String> arrayContent = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayContent.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayContent;
    }

    public static void setFullPathFile(String fileName) {
        StringBuffer path = new StringBuffer("D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\test_module_2\\data\\");
        path.append(fileName);
        path.append(StringUtilsModules2.CSV);

        FileUtilsModule2.path = path.toString();
    }

    public static void writeFile(String[] content) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(StringUtilsModules2.concat(content, StringUtilsModules2.COMMA));
            bufferedWriter.newLine();
            ;
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

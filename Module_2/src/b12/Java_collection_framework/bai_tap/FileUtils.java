package b12.Java_collection_framework.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static String path="src/b12/Java_collection_framework/bai_tap/product.csv";
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    public static void writeFile(List<Product> list,boolean check){
        try {
           bufferedWriter = new BufferedWriter(new FileWriter(path, check));
            for (Product product:list) {
                bufferedWriter.write(product.getId()+","+product.getName()+","+product.getPrice());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static List<Product> readFile(){
        List<Product> list = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = null;
            String[] arr =null;
            while ((line = bufferedReader.readLine())!= null){
                arr =line.split(",");
                Product product = new Product(Integer.parseInt(arr[0]), arr[1],Integer.parseInt(arr[2]));
                list.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

//    public static void setFullPathFile(String fileName){
//        StringBuffer path = new StringBuffer("D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\b12\\Java_collection_framework\\bai_tap\\product.csv");
//        path.append(fileName);
//        path.append(StringUtils.CSV);
//        FileUtils.path = path.toString();
//    }
}

package b16.IO_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        File source = new File("src/b16/IO_text_file/bai_tap/copy_file_text/sourcefile.txt");
        File target = new File("src/b16/IO_text_file/bai_tap/copy_file_text/targetfile.txt");
        try {
            copyFile(source, target);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(File source, File destination) throws IOException {
        try(FileInputStream inputStream = new FileInputStream(source);
            FileOutputStream outputStream = new FileOutputStream(destination);){

//
//            Su dung transferFrom cua FileChannel
//            FileChannel sourceChannel = inputStream.getChannel();
//            FileChannel destinationChannel = outputStream.getChannel();
//
//            destinationChannel.transferFrom(sourceChannel, 0,sourceChannel.size());

//            Su dung inputstream va outputstream
            byte[] buffer = new byte[1024];
            int lineLength;
            while ((lineLength = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, lineLength);
            }
        }
    }
}
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader
//                = new BufferedReader(new FileReader(new File("src/b16/IO_text_file/bai_tap/copy_file_text/sourcefile.txt")));
//
//        String line;
//        while ((line = bufferedReader.readLine()) !=null){
//            System.out.println(line);
//        }
//
//        BufferedWriter bufferedWriter
//                = new BufferedWriter(new FileWriter(new File("src/b16/IO_text_file/bai_tap/copy_file_text/sourcefile.txt")));
//        bufferedWriter.newLine();
//        bufferedWriter.write("\"1.0.0.0\",\"1.0.0.255\",\"16777216\",\"16777471\",\"AU\",\"Australia\"\n" +
//                "\"1.0.1.0\",\"1.0.3.255\",\"16777472\",\"16778239\",\"CN\",\"China\"\n" +
//                "\"1.0.4.0\",\"1.0.7.255\",\"16778240\",\"16779263\",\"AU\",\"Australia\"\n" +
//                "\"1.0.8.0\",\"1.0.15.255\",\"16779264\",\"16781311\",\"CN\",\"China\"\n" +
//                "\"1.0.16.0\",\"1.0.31.255\",\"16781312\",\"16785407\",\"JP\",\"Japan\"\n" +
//                "\"1.0.32.0\",\"1.0.63.255\",\"16785408\",\"16793599\",\"CN\",\"China\"\n" +
//                "\"1.0.64.0\",\"1.0.127.255\",\"16793600\",\"16809983\",\"JP\",\"Japan\"\n" +
//                "\"1.0.128.0\",\"1.0.255.255\",\"16809984\",\"16842751\",\"TH\",\"Thailand\"");
//        bufferedWriter.close();
//    }


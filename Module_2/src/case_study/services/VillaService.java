package case_study.services;

import case_study.common.FuncWriteAndRead;
import case_study.models.Villa;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaService {
    public static ArrayList<Villa> villaArrayList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final String FILE_PATH_VILLA="D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\case_study\\data\\villa.csv";
    public static void addNewVilla(){
        ArrayList<Villa> villaArrayList = new ArrayList<>();
        System.out.println("Enter service name");
        String serviceName = scanner.nextLine();
        System.out.println("Enter rent type");
        String renType = scanner.nextLine();
        System.out.println("Enter usable area");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter cost rent");
        double costRent = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of customer");
        int maxNumOfPeo = Integer.parseInt(scanner.nextLine());
        System.out.println("Room standard");
        String roomStandard = scanner.nextLine();
        System.out.println("Describe service");
        String describeService = scanner.nextLine();
        System.out.println("Swimming pool area");
        double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("floor");
        int numOfFloor = Integer.parseInt(scanner.nextLine());
        Villa villa =new Villa(serviceName, renType, usableArea, costRent, maxNumOfPeo, roomStandard, describeService, swimmingPoolArea);
        villaArrayList.add(villa);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <villaArrayList.size(); i++){
            FuncWriteAndRead.writeFile(FILE_PATH_VILLA,villaArrayList.get(i).toString(),true);
        }
//        villaArrayList.add(villa);

    }
    public static void showAllVilla(){
        for (int i = 0; i < villaArrayList.size();i++){
            System.out.println(villaArrayList.get(i).toString());
        }
    }
}

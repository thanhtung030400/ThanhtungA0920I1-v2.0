package case_study.services;

import case_study.common.FuncWriteAndRead;
import case_study.models.House;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseService {
    public static ArrayList<House> houseArrayList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final String FILE_PATH_HOUSE = "D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\case_study\\data\\house.csv";
    public static void addNewHouse(){
        ArrayList<House> houseArrayList = new ArrayList<>();
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
        System.out.println("Enter standard room ");
        String roomStandard = scanner.nextLine();
        System.out.println("Describe service");
        String describeService = scanner.nextLine();
        System.out.println("floor");
        String numOfFloor = scanner.nextLine();
        House house = new House(serviceName, renType, usableArea, costRent, maxNumOfPeo, roomStandard, describeService, numOfFloor);
        houseArrayList.add(house);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <houseArrayList.size(); i ++){
            FuncWriteAndRead.writeFile(FILE_PATH_HOUSE,houseArrayList.get(i).toString(),true);
        }
//        houseArrayList.add(house);//-->listString
//        FuncWriteAndRead.write(houseArrayList,true);
    }
    public static void showAllHouse(){
//        List<House> list = FuncWriteAndRead.readFile();
        for(int i = 0; i<houseArrayList.size(); i++){
            System.out.println(houseArrayList.get(i).toString() );
        }
    }
}

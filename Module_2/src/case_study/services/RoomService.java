package case_study.services;

import b5.access_modifier_static_method_and_static_property.thuc_hanh.A;
import case_study.common.FuncWriteAndRead;
import case_study.models.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService {
    public static ArrayList<Room> roomArrayList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final String FILE_PATH_ROOM = "D:\\ThanhtungA0920I1v2.0\\Module_2\\src\\case_study\\data\\room.csv";
    public static void addNewRoom(){
        ArrayList<Room> roomArrayList = new ArrayList<>();
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
        System.out.println("Service include");
        String freeServiceInclude =scanner.nextLine();
        Room room = new Room(serviceName, renType, usableArea, costRent, maxNumOfPeo, freeServiceInclude);
        roomArrayList.add(room);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < roomArrayList.size(); i ++){
            FuncWriteAndRead.writeFile(FILE_PATH_ROOM,roomArrayList.get(i).toString(),true);
        }
//        roomArrayList.add(room);

    }
    public static void showAllRoom(){
        for (int i = 0 ; i < roomArrayList.size(); i++){
            System.out.println(roomArrayList.get(i).toString());
        }
    }
}

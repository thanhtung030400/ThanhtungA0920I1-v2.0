package final_test.controllers;


import final_test.commons.FileUtils;
import final_test.commons.StringUtils;
import final_test.commons.Validators;
import final_test.models.Car;
import final_test.models.Motorcycle;
import final_test.models.Truck;
import final_test.models.Vehicle;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean isExit;


    public static void main(String[] args) {
        MainController.displayMainMenu();
    }

    public static String CAR = "car";
    public static String MOTORCYCLE = "motorcycle";
    public static String TRUCK = "truck";
    public  static boolean isBackToMenu;

    private static void displayMainMenu() {
        int choose = 0;
        System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                "Chọn chức năng:\n" +
                "1. Thêm mới phương tiện.\n" +
                "2. Hiện thị phương tiện\n" +
                "3. Xóa phương tiện\n" +
                "4. Thoát\n");
        System.out.println("please choose");
        choose = scanner.nextInt();
        do {
            switch (choose){
                case 1:
                    addNewVehicle();
                    break;
                case 2:
                    showVehicle();
                    break;
                case 3:
                    deleteVehicle();
                    break;
                case 4:
                    isExit = true;
                    break;
            }
            if (isExit){
                break;
            }
        }while (choose >= 1 && choose <= 4);
    }


    private static void deleteVehicle() {
        List<String> list = FileUtils.readFile();
        showVehicle();
        System.out.println("press vehicle you want to delete");
        int choose = Integer.parseInt(scanner.nextLine());
        list.remove(choose-1);
        FileUtils.writeFile(list,false);
    }

    private static void showVehicle() {
        int choose = 0;
        do {
            System.out.println("1. Hiện thị xe tải.\n" +
                    "2. Hiện thị ôtô. \n" +
                    "3. Hiện  xe máy.\n"+
                    "4. Back to menu");
            System.out.println("please choose");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    showAllVehicle(TRUCK);
                    isBackToMenu = false;
                    break;
                case 2:
                    showAllVehicle(CAR);
                    isBackToMenu = false;
                    break;
                case 3:
                    showAllVehicle(MOTORCYCLE);
                    isBackToMenu = false;
                    break;
                case 4:
                    isBackToMenu = true;
                    break;
            }
            if (isBackToMenu || isExit){
                return;
            }
        }while (choose >= 1&& choose<=4);
    }

    private static void addNewVehicle() {
        int choose =0;
        do {
            System.out.println("1. Thêm xe tải,\n" +
                    " \t2. Thêm ôtô, \n" +
                    "3. Thêm  xe máy.\n"+
                    "4. back to menu");

            System.out.println("please choose");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    addNewVehicle(TRUCK);
                    isBackToMenu = false;
                    break;
                case 2:
                    addNewVehicle(CAR);
                    isBackToMenu= false;
                    break;
                case 3:
                    addNewVehicle(MOTORCYCLE);
                    isBackToMenu = false;
                    break;
                case 4:
                    isBackToMenu = true;
            }
            if (isBackToMenu || isExit){
                return;
            }
        }while ( choose >=1 && choose <= 5);
    }

    private static void addNewVehicle(String fileName) {

        int licensePlates = 0;
        do {
            System.out.println("input licensePlates");
            licensePlates = scanner.nextInt();
        }while (Validators.isValidVehicle(String.valueOf(licensePlates),Validators.VEHICLE_REGEX));

        scanner.nextLine();
        System.out.println("input brand");
        String brand = scanner.nextLine();

        System.out.println("yearOfProduction");
        int yearOfProduction = scanner.nextInt();

        scanner.nextLine();
        System.out.println("owner");
        String owner = scanner.nextLine();

        FileUtils.setFullPathFile(fileName);
        if (fileName.equals(TRUCK)){
            System.out.println("input payload ");
            int payLoad = scanner.nextInt();

            FileUtils. writeFile(new String[]{String.valueOf(licensePlates), brand, String.valueOf(yearOfProduction), owner,
                    String.valueOf(payLoad)});
        }else if (fileName.equals(CAR)){
            System.out.println("input number of seat ");
            int numOfSeat = scanner.nextInt();

            System.out.println("input models");
            String models = scanner.nextLine();

            FileUtils.writeFile(new String[]{String.valueOf(licensePlates), brand, String.valueOf(yearOfProduction), owner,
                    String.valueOf(numOfSeat), models});
        }else if (fileName.equals(MOTORCYCLE)) {
            System.out.println("input wattage");
            int wattage = scanner.nextInt();

            FileUtils.writeFile(new String[]{String.valueOf(licensePlates), brand, String.valueOf(yearOfProduction), owner,
                    String.valueOf(wattage)});
        }
    }

    public  static List<Vehicle> readAllVehicle(String fileName){
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesVehicle = FileUtils.readFile();
        List<Vehicle> vehicleList = new ArrayList<>();
        String[] propertiesElement= null;

        Vehicle vehicle  = null;
        for (String properties:propertiesVehicle){
            propertiesElement = properties.split(StringUtils.COMMA);
            if (fileName.equals(TRUCK)){
                vehicle = new Truck();

                ((Truck) vehicle).setPayLoad(Integer.parseInt(propertiesElement[4]));
            }else if (fileName.equals(CAR)){
                vehicle = new Car();

                ((Car) vehicle).setNumOfSeat(Integer.parseInt((propertiesElement[4])));
                ((Car) vehicle).setModels(propertiesElement[5]);
            }else if (fileName.equals(MOTORCYCLE)){
                vehicle =new Motorcycle();

                ((Motorcycle) vehicle).setWattage(Integer.parseInt(propertiesElement[4]));
            }
            vehicle.setLicensePlates(Integer.parseInt(propertiesElement[0]));
            vehicle.setBrand((propertiesElement[1]));
            vehicle.setYearOfProduction(Integer.parseInt(propertiesElement[2]));
            vehicle.setOwner(propertiesElement[3]);

            vehicleList.add(vehicle);
        }
        return vehicleList;
    }

    private static void showAllVehicle(String fileName) {
        System.out.println("----------------");
        System.out.println("list vehicle");
        for (Vehicle vehicle : readAllVehicle(fileName)){
            vehicle.showInformation();
        }
    }
}

package test_m2.controllers;

import test_m2.commons.FileUtils;
import test_m2.commons.StringUtils;
import test_m2.models.*;

import java.util.*;


public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit;

    public static void main(String[] args) {
        MainController.displayMainMenu();
    }

    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static boolean isBackToMenu;

    public static void displayMainMenu() {
        int choose = 0;
        System.out.println("1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information of Customer\n" +
                "5. Add New Booking\n" +
                "6. Show Information of Employee\n" +
                "7. Exit");

        System.out.println("please choose");
        choose = scanner.nextInt();
        do {
            switch (choose) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        } while (choose >= 1 && choose <= 7);
    }



    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showService() {
        int choose = 0;
        do {
            System.out.println("1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit");

            System.out.println("Please choose:");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    isBackToMenu= false;
                    break;
                case 2:
                    showAllService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    showAllService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    showServiceNotDup(VILLA);
                    isBackToMenu = true;
                    break;
                case 5:
                    showServiceNotDup(HOUSE);
                    isBackToMenu = true;
                    break;
                case 6:
                    showServiceNotDup(ROOM);
                    isBackToMenu = true;
                    break;
                case 7:
                    isBackToMenu = true;
                    break;
                case 8:
                    isExit = true;
                    break;

            }
            if (isBackToMenu || isExit) {
                return;
            }
        } while (choose >= 1 && choose <= 5);

    }

    public  static List<Service> readAllServices(String fileName){
        FileUtils.setFullPathFile(fileName);
        List<String>propertiesService = FileUtils.readFile();
        List<Service> listOfServices = new ArrayList<>();
        String[]propertiesElement = null;

        Service services = null;
        ExtraService extraService = null;
        for (String properties : propertiesService) {
            propertiesElement = properties.split(StringUtils.COMMA);
            if (fileName.equals(VILLA)) {
                services = new Villa();

                ((Villa) services).setStandardRoom(propertiesElement[6]);
                ((Villa) services).setOtherDescription(propertiesElement[7]);
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberOfFloors(Integer.parseInt(propertiesElement[9]));

            } else if (fileName.equals(HOUSE)) {
                services = new House();

                ((House) services).setStanderRoom(propertiesElement[6]);
                ((House) services).setOtherDescription(propertiesElement[7]);
                ((House) services).setNumberOfFloor(Integer.parseInt(propertiesElement[8]));

            } else if (fileName.equals(ROOM)) {
                extraService = new ExtraService(propertiesElement[6], propertiesElement[7], Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setExtraservice(extraService);
            }
            services.setId(propertiesElement[0]);
            services.setService(propertiesElement[1]);
            services.setAreaUsed(Double.parseDouble(propertiesElement[2]));
            services.setRentCost(Double.parseDouble(propertiesElement[3]));
            services.setNumberOfPeople(Integer.parseInt(propertiesElement[4]));
            services.setTypeRent(propertiesElement[5]);

            listOfServices.add(services);
        }
        return listOfServices;
    }



    private static void showServiceNotDup(String fileName) {
        Set<String> setOfService = new TreeSet<>();

        System.out.println("---------------");
        System.out.println("list of service not duplicate name ");

        for (Service service:readAllServices( fileName)){
            setOfService.add(service.getService());
        }
        for (String name : setOfService){
            System.out.println(name);
        }

    }

    private static void showAllService(String fileName) {
        System.out.println("-----------");
        System.out.println("list service");
        for (Service service : readAllServices(fileName)){
            service.showInfor();
        }

    }

    private static void addNewService() {
        int choose = 0;
        do {
            System.out.println("1Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit");

            System.out.println("Please choose:");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNewService(VILLA);
                    isBackToMenu  = false;
                    break;
                case 2:
                    addNewService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    addNewService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    isBackToMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;

            }
            if (isBackToMenu || isExit) {
                return;
            }
        } while (choose >= 1 && choose <= 5);

    }


    private static void addNewService(String fileName) {

        scanner.nextLine();
        System.out.println("input Id");
        String id = scanner.nextLine();

        System.out.println("input service name");
        String serviceName = scanner.nextLine();

        System.out.println("input area use");
        double areaUse = scanner.nextDouble();

        System.out.println("input rent cost");
        double rentCost = scanner.nextDouble();

        System.out.println("input number of people");
        int numberOfPeople = scanner.nextInt();

        scanner.nextLine();
        System.out.println("input type rent");
        String typeRent = scanner.nextLine();


        FileUtils.setFullPathFile(fileName);
        if (fileName.equals(VILLA)){
            System.out.println("input standard room");
            String standardRoom = scanner.nextLine();

            System.out.println("input other description");
            String otherDescription = scanner.nextLine();

            System.out.println("input areaPool");
            double areaPool = scanner.nextDouble();

            System.out.println("input number of floor");
            int numberOfFloors = scanner.nextInt();

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople), typeRent,
                                standardRoom, otherDescription, String.valueOf(areaPool), String.valueOf(numberOfFloors)});
        }else  if (fileName.equals(HOUSE)){
            System.out.println("input stander room");
            String standardRoom = scanner.nextLine();

            System.out.println("input other description");
            String otherDescription = scanner.nextLine();

            System.out.println("input number of floor");
            int numberOfFloors = scanner.nextInt();

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople), typeRent,
                    standardRoom, otherDescription, String.valueOf(numberOfFloors)});
        }else if (fileName.equals(ROOM)){
            System.out.println("input extra service");
            String extraServiceName = scanner.nextLine();

            System.out.println("input unit");
            String unit = scanner.nextLine();

            System.out.println("input money");
            double money = scanner.nextDouble();

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople), typeRent,
                    extraServiceName, unit, String.valueOf(money)});

        }


    }
}
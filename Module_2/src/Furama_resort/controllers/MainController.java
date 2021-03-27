package Furama_resort.controllers;

import Furama_resort.commons.FileUtils;
import Furama_resort.commons.StringUtils;
import Furama_resort.commons.Validators;
import Furama_resort.exceptions.EmailException;
import Furama_resort.exceptions.NameException;
import Furama_resort.models.*;

import java.lang.reflect.Field;
import java.util.*;

import static case_study.controllers.MainControllers.addNewCustomer;

public class MainController {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit;
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static String CUSTOMER = "customer";
    private static boolean isbackToMenu;


    public static void main(String[] args) {
        MainController.displayMainMenu();
    }

    public static void displayMainMenu() {
        int choose= 0;
        do {
            System.out.println("------------------------------------ \n"
                    + "1.Add new Services \n"
                    + "2.Show services \n"
                    + "3.Add new customer \n"
                    + "4.Show information of customer \n"
                    + "5.Add new booking \n"
                    + "6.Show informaton of Employee \n"
                    + "7.Exit \n"
                    + "-----------------------------------");

            System.out.println("please choose(1-6)");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    addNewCustomer(CUSTOMER);
                    break;
                case 4:
                    showCustomer(CUSTOMER);
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showBooking();
                    break;
                case 7:
                    isExit= true;
                    break;

            }
            if (isExit== true){
                break;
            }
        }while (choose >=1 && choose <=7);
    }


    private static void showBooking() {

    }

    private static void addNewBooking() {

    }
    private static List<Customer> readAllCustomer(String fileName){
          FileUtils.setFullPathFile(fileName);
          List<String> propertiesCustomer = FileUtils.readFile();
          List<Customer> listOfCustomer = new ArrayList<>();

          String[] arrPropertiesCustomer = null;
          Customer customer = null;
          for (String properties : propertiesCustomer){
              arrPropertiesCustomer = properties.split(StringUtils.COMMA);

              customer = new Customer();
              customer.setFullName(arrPropertiesCustomer[0]);
              customer.setDateOfBirth(arrPropertiesCustomer[1]);
              customer.setGender(arrPropertiesCustomer[2]);
              customer.setIdCard((arrPropertiesCustomer[3]));
              customer.setPhoneNumber(arrPropertiesCustomer[4]);
              customer.setEmail(arrPropertiesCustomer[5]);
              customer.setTypeOfCustomer(arrPropertiesCustomer[6]);
//              customer.setAddress(arrPropertiesCustomer[7]);

              listOfCustomer.add(customer);
          }
          return listOfCustomer;
    }

    private static void showCustomer(String fileName) {
        System.out.println("List customer ----------");
        for (Customer customer : readAllCustomer(fileName)){
            customer.showInfor();
        }
    }

    private static void addNewCustomer(String fileName){
        scanner.nextLine();

        boolean flag;
        String fullName = null;
        do {
            flag = true;
            System.out.println("please input full name");
            fullName = scanner.nextLine();

            try {
                Validators.isValidFullName(fullName);
            } catch (NameException e) {
                flag = false;
                e.printStackTrace();
            }
        }while (!flag);

        System.out.println("please input date of birth");
        String dateOfBirth = scanner.nextLine();

        System.out.println("please input gender");
        String gender = scanner.nextLine();
        System.out.println("please input Id card");
        String idCard= scanner.nextLine();

        String email = null;
        do {
            flag = true;
            System.out.println("please input email");
            email = scanner.nextLine();
            try {
                Validators.isValidEmail(email);
            } catch (EmailException e) {
                flag = false;
                e.printStackTrace();
            }
        }while (!flag);
        System.out.println("please input type of customer");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("please input address");
        String address = scanner.nextLine();

        FileUtils.setFullPathFile(fileName);
        FileUtils.writeFile(new String[]{ fullName, dateOfBirth, gender,idCard,email, typeOfCustomer, address} );
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
            System.out.println("please choose service to add");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    isbackToMenu = false;
                    break;
                case 2:
                    showAllService(HOUSE);
                    isbackToMenu = false;
                    break;
                case 3:
                    showAllService(ROOM);
                    isbackToMenu = false;
                    break;
                case 4:
                    showAllServiceNotDup(VILLA);
                    isbackToMenu = true;
                    break;
                case 5:
                    showAllServiceNotDup(HOUSE);
                    isbackToMenu = true;
                    break;
                case 6:
                    showAllServiceNotDup(ROOM);
                    isbackToMenu = true;
                    break;
                case 7:
                    isbackToMenu = true;
                    break;
                case 8:
                    isExit = true;
                    break;

            }
            if (isbackToMenu || isExit){
                return;
            }
        }while (choose >= 1 && choose <=5);
    }

    public static List<Service> readAllServices(String fileName){
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesService = FileUtils.readFile();
        List<Service> listOfServices = new ArrayList<>();
        String[] propertiesElement = null;

        Service services = null;
        ExtraService extraService = null;
        for (String properties : propertiesService){
            propertiesElement = properties.split(StringUtils.COMMA);
            if (fileName.equals(VILLA)){
                services = new Villa();

                ((Villa) services).setStandardRoom(propertiesElement[6]);
                ((Villa) services).setOtherDescription(propertiesElement[7]);
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberOfFloors(Integer.parseInt(propertiesElement[9]));
            }else if (fileName.equals(HOUSE)){
                services= new House();

                ((House) services).setStandardRoom(propertiesElement[6]);
                ((House) services).setOtherDescription(propertiesElement[7]);
                ((House) services).setNumberOfFloors(Integer.parseInt(propertiesElement[8]));
            }else if (fileName.equals(ROOM)){
                extraService= new ExtraService(propertiesElement[6],propertiesElement[7], Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room)services).setExtraService(extraService);
            }
            services.setId(propertiesElement[0]);
            services.setServiceName(propertiesElement[1]);
            services.setAreUse(Double.parseDouble(propertiesElement[2]));
            services.setRentCost(Double.parseDouble(propertiesElement[3]));
            services.setNumberOfPeople(Integer.parseInt(propertiesElement[4]));
            services.setTypeRent(propertiesElement[5]);

            listOfServices.add(services);
        }
        return listOfServices;

    }

    private static void showAllServiceNotDup(String fileName) {
        Set<String> setOfService = new TreeSet<>();

        System.out.println("---------------------");
        System.out.println("List services not duplicate name ");
        for (Service service : readAllServices(fileName)){
            setOfService.add(service.getServiceName());
        }

        for (String name : setOfService){
            System.out.println(name);
        }
    }

    private static void showAllService(String fileName) {
        System.out.println("---------------------");
        System.out.println("List services");
        for (Service service : readAllServices(fileName)){
            service.showInfor();
        }
    }


    private static void addNewService() {
        int choose = 0;
        do {
            System.out.println("1. Add New Villa \n" +
                    "2. Add New House \n" +
                    "3. Add New Room \n" +
                    "4. Back to menu \n" +
                    "5. Exit");
            System.out.println("please choose service to add");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewService(VILLA);
                    isbackToMenu = false;
                    break;
                case 2:
                    addNewService(HOUSE);
                    isbackToMenu = false;
                    break;
                case 3:
                    addNewService(ROOM);
                    isbackToMenu = false;
                    break;
                case 4:
                    isbackToMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;

            }
            if (isbackToMenu || isExit){
                return;
            }
        }while (choose >= -1 && choose <=5);
    }

    private static void addNewService(String fileName) {

        scanner.nextLine();

        String id = null;
        do {
            System.out.println("please input service id:");
            id = scanner.nextLine();
        }while (Validators.isValidRegex(id, Validators.SERVICE_CODE_REGEX));

        String serviceName = null;
        do {
            System.out.println("please input service name");
            serviceName = scanner.nextLine();
        }while (Validators.isValidRegex(serviceName, Validators.SERVICE_NAME_REGEX));

        double areaUse = 0;
        do {
            System.out.println("please input area use");
            areaUse = scanner.nextDouble();
        }while ((Validators.isMoreThan(areaUse, 30)));

        double rentCost = 0;
        do {
            System.out.println("please input rent cost");
            rentCost = scanner.nextDouble();
        }while (!Validators.isMoreThan(rentCost, 0));

        int numberOfPeople = 0;
        do {
            System.out.println("please input number of people");
            numberOfPeople = scanner.nextInt();
        }while (!Validators.isMoreThan(numberOfPeople,0,20));

        scanner.nextLine();

        String typeRent = null;
        do {
            System.out.println("please input type rent");
            typeRent = scanner.nextLine();
        }while (!Validators.isValidRegex(typeRent, Validators.SERVICE_NAME_REGEX));

        FileUtils.setFullPathFile(fileName);
        if (fileName.equals(VILLA)){


            String standardRoom = null;
            do {
                System.out.println("please input standard room");
                standardRoom = scanner.nextLine();
            }while (!Validators.isValidRegex(typeRent, Validators.SERVICE_NAME_REGEX));

            System.out.println("please input other description ");
            String otherDescription = scanner.nextLine();

            double areaPool = 0;
            do {
                System.out.println("please input are pool");
                areaPool = scanner.nextDouble();
            }while ((Validators.isMoreThan(areaUse, 30)));

            int numberOfFloor = 0;
            do {
                System.out.println("please input number of floor ");
                numberOfFloor = scanner.nextInt();
            }while (!Validators.isMoreThan(numberOfFloor, 0));

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople), String.valueOf(areaPool), typeRent,
                    standardRoom, otherDescription, String.valueOf(numberOfFloor)});
        }else if (fileName.equals(HOUSE)){
            System.out.println("please input standard room");
            String standardRoom = scanner.nextLine();

            System.out.println("please input other description ");
            String otherDescription = scanner.nextLine();

            int numberOfFloor = 0;
            do {
                System.out.println("please input number of floor ");
                numberOfFloor = scanner.nextInt();
            }while (!Validators.isMoreThan(numberOfFloor, 0));
            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople), typeRent,
                    standardRoom, otherDescription, String.valueOf(numberOfFloor)});


        }else if (fileName.equals(ROOM)){
            String extraServiceName= null;
            do {
                System.out.println("please input extra service");
                extraServiceName = scanner.nextLine();
            }while (!Validators.isValidExtraServiceName(extraServiceName));

            System.out.println("please input unit");
            String unit = scanner.nextLine();

            System.out.println("please input money");
            double money = scanner.nextDouble();
            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(numberOfPeople), typeRent,
                    extraServiceName, unit, String.valueOf(money)});

        }
    }


}

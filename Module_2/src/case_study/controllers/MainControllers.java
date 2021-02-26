package case_study.controllers;

import case_study.services.HouseService;
import case_study.services.RoomService;
import case_study.services.VillaService;

import java.util.Scanner;

public class MainControllers {
    public static boolean out = true;



    public static void main(String[] args) {
        displayMainMenu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {


        String choose;
        do {
            System.out.println(
                    "------------------------------------ \n"
                            + "1.Add new Services \n"
                            + "2.Show services \n"
                            + "3.Add new customer \n"
                            + "4.Show information of customer \n"
                            + "5.Add new booking \n"
                            + "6.Show informaton of Employee \n"
                            + "7.Exit \n"
                            + "-----------------------------------"
            );
            System.out.println("Please choose ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addNewServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    addNewCustomer();
                    break;
                case "4":
                    showInformationOfCustomer();
                    break;
                case "5":
                    addNewBooking();
                    break;
                case "6":
                    showInformation();
                    break;


                default:
                    System.out.println("Please choose ");
                    displayMainMenu();
                    break;
            }
        } while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <= 7);
    }


    public static void addNewServices() {
        String choose;
        do {
            System.out.println("1. Add New Villa \n" +
                    "2. Add New House \n" +
                    "3. Add New Room \n" +
                    "4. Back to menu \n" +
                    "5. Exit");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
//                     villaService.addNewVilla();
                    VillaService.addNewVilla();
                    break;
                case "2":
                    HouseService.addNewHouse();
                    break;
                case "3":
                    RoomService.addNewRoom();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                default:
                    out = false;
                    break;
            }
        } while (out);
    }



    public static void showServices() {
        String choose;
        do {
            System.out.println("1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    VillaService.showAllVilla();
                    break;
                case "2":
                    HouseService.showAllHouse();
                    break;
                case "3":
                    RoomService.showAllRoom();
                    break;
//                case "4":
//                    showAllNameVillaNotDuplicate();
//                    break;
//                case "5":
//                    showAllNameHouseNotDuplicate();
//                    break;
//                case "6":
//                    showAllNameNameNotDuplicate();
//                    break;
                case "7":
                    displayMainMenu();
                    break;
                case "8":
                    out = false;
                    break;
            }
        } while (out);
    }
    public static void addNewCustomer(){

    }
    public static void showInformationOfCustomer(){

    }
    public static void addNewBooking(){

    }
    public static void showInformation(){

    }
}

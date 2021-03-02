package b12.Java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager1 {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList;

    static {
        productList = new ArrayList<Product>();
        productList.add(new Product(1, "Redbull", 15000));
        productList.add(new Product(2, "Coca", 13000));
        productList.add(new Product(3, "Pepsi", 10000));
    }

    public static void showProduct() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Id: " + productList.get(i).getId());
            System.out.println("Name: " + productList.get(i).getName());
            System.out.println("Price: " + productList.get(i).getPrice());
        }
    }

    public static void editProduct(){
        System.out.println("enter name of product you want to edit");
        int id = scanner.nextInt();

    }



    public static void removeProduct() {
        System.out.println("Enter id of product you want remove");
        int id = scanner.nextInt();
        productList.remove(id);

        showProduct();
        }


}
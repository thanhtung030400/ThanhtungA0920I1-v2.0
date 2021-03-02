package b12.Java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static b12.Java_collection_framework.bai_tap.ProductManager1.productList;

public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static  boolean isExit;
    public static ArrayList<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        int choose =0;
        do {
            System.out.println("1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "7. thoat");

            System.out.println("chon chuc nang");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    isExit = true;
                    break;

            }
            if (isExit){
            }

        }while (true);

    }

    private static void sortProduct() {

    }

    private static void searchProduct() {
        System.out.println("enter id of product:");
        scanner.nextInt();
        int id = scanner.nextInt();
//        for (int i = 0 ; i < listProduct.size(); i++){
//            if (id.equals(listProduct.get(i).getName())){
//                System.out.println(listProduct.get(i));
//            }
        showProduct();
    }

    private static void showProduct() {
        for(Product product : listProduct){
            System.out.println(product);
        }
    }

    private static void deleteProduct() {
        System.out.println("Enter id of product you want remove");
        int id = scanner.nextInt();
        listProduct.remove(id);
        showProduct();
    }

    private static void editProduct() {
        System.out.println("Enter id of product you want edit ");
        int id = scanner.nextInt();
        showProduct();
    }

    private static void addProduct() {
        System.out.println("Enter id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name of product");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        Product product = new Product(id, name, price);
        listProduct.add(product);
    }
}
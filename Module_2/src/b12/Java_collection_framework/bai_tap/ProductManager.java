package b12.Java_collection_framework.bai_tap;

import java.util.*;


public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static  boolean isExit;
    public static ArrayList<Product> listProduct = new ArrayList<>();
    private static String PRODUCT ="product";

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
                    "6. Sắp xếp sản phẩm tăng dần theo giá\n" +
                    "7. Sắp xếp sản phẩm giảm dần theo giá\n" +
                    "8. thoat");

            System.out.println("chon chuc nang");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    addProduct(PRODUCT);
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
                    sortProductLower();
                    break;
                case 8:
                    isExit = true;
                    break;

            }
            if (isExit){
            }

        }while (true);

    }


    private static void sortProductLower() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getName().compareTo(product2.getName());
            }
        });
        for (Product product : listProduct){
            System.out.println(product);
        }
    }

    private static void sortProduct() {
        Collections.sort(listProduct);
        System.out.println(listProduct);
    }

    private static void searchProduct() {
        System.out.println("Enter name product you want to search");
        scanner.nextLine();
        String nameProduct = scanner.nextLine();
        for (int i = 0 ; i < listProduct.size(); i++){
            if (nameProduct.equals(listProduct.get(i).getName())){
                System.out.println(listProduct.get(i));
            }
        }
    }

    private static void showProduct() {
        List<Product> list = FileUtils.readFile();
        for(Product product : list){
            System.out.println(product.toString());
        }
    }

    private static void deleteProduct() {
        showProduct();
        List<Product> list = FileUtils.readFile();
        System.out.println("Enter id of product you want remove");
        int id = scanner.nextInt();
        list.remove(id);
            FileUtils.writeFile(list,false);

    }

    private static void editProduct() {
        List<Product> list = FileUtils.readFile();
        System.out.println("Enter id of product you want edit ");
        int idProduct = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < listProduct.size(); i++) {
            int price = 0;
            String name = null;
            switch (idProduct) {
                case 1:
                    System.out.println(listProduct.get(i));
                    System.out.println("Enter the name you want edit");
                    name = scanner.nextLine();
                    listProduct.get(i).setName(name);
                    System.out.println(listProduct.get(i));
                case 2:
                    System.out.println("Enter the price you want edit");
                    price = scanner.nextInt();
                    listProduct.get(i).setPrice(price);
                    System.out.println(listProduct.get(i));
            }
            Product product = new Product(name, price);
            listProduct.clear();
            listProduct.add(product);
            FileUtils.writeFile(list, true);
        }
    }
//    CSVReader reader = new CSVReader(new FileReader("old.csv"));
//    CSVWriter writer = new CSVWriter(new FileWriter("new.csv"));
//    String [] nextLine;
//while ((nextLine = reader.readNext()) != null) {
//        List<String> lineAsList = new ArrayList<String>(Arrays.asList(nextLine));
//        // Add stuff using linesAsList.add(index, newValue) as many times as you need.
//        writer.writeNext(lineAsList.toArray());
//    }

    private static void addProduct(String fileName) {
        scanner.nextLine();
        System.out.println("Enter id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name of product");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        Product product = new Product(id,name,price);
        listProduct.clear();
        listProduct.add(product);
        FileUtils.writeFile(listProduct,true);
    }
}

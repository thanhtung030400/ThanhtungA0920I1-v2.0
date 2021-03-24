package b12.Java_collection_framework.bai_tap;

public  class Product implements Comparable<Product>{
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Product product ) {
        if (this.price > product.price) {
            return 1;
        } else if (this.price == product.price) {
            return this.name.compareTo(product.name);
        }else {
            return -1;
        }
    }





}

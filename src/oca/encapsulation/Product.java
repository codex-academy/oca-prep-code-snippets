package oca.encapsulation;

public class Product {

    private int id;

    private String description;

    private double price;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private int qty;

    private static int nextId = 1;

    private String category;

    public Product() {
        createId();
    }

    public Product(String description, double price, String category) {
        this();

        this.description = description;
        this.price = price;
        this.category = category;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {

        if (category.equals("Toiletries") || category.equals("Toys")) {
            this.category = category;
        } else {
            // throw new RuntimeException("We only support Toiletries & Toys");
            System.out.println("Only valid categories are Wine & Toiletries");
        }

    }

    private void createId() {
        id = nextId++;
//        id = id * 100;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

//        if (price > 30) {
//            throw new RuntimeException("That's to high a price!");
//        }

        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

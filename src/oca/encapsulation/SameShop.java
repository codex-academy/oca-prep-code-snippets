package oca.encapsulation;

public class SameShop {
    public static void main(String[] args) {


        Product soap = new Product();

        soap.setDescription("Dove 100g");
        soap.setPrice(7.99);
        soap.setCategory("Toiletries");

//        Product p4 = new Product("Dove 100g", 7.99, "Toiletries");

        Product soap2 = new Product();

        soap2.setDescription("Dove 150g");
        soap2.setPrice(9.99);
        soap2.setCategory("Toiletries");

        Product redWine = new Product();

        redWine.setDescription("Red wine 750ml");
        redWine.setPrice(45.00);
        redWine.setCategory("Toys");


        Product legoBricks = new Product();

        soap.setDescription("Lego bricks");
        soap.setPrice(90.00);
        soap.setCategory("Toys");




        System.out.println(soap2.getId());
        System.out.println(soap.getId());
//        System.out.println(p4.getId());


    }
}

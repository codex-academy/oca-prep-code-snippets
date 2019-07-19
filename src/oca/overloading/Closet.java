package oca.overloading;

class Shoe{
    int size;
    String color;
}

class Socks {
    String size;
    String color;
    String material;
}

class Shirt {

}

public class Closet {

    private final int maxShoes;
    private final int maxSocks;

    int sockCount = 0;
    int shoeCount = 0;

    public Closet (int maxSocks, int maxShoes) {
        this.maxShoes = maxShoes;
        this.maxSocks = maxSocks;
    }

    public boolean add(Shoe shoe) {

        if (shoeCount + 1 <= maxShoes) {
            shoeCount++;
            return true;
        }
        return false;
    }

    public boolean add(Socks socks) {
        if (sockCount + 1 <= maxSocks) {
            sockCount++;
            return true;
        }
        return false;
    }

    public boolean add(Object obj) {
        return false;
    }



    public static void main(String[] args) {

        Closet closet = new Closet(7, 1);

        System.out.println(closet.add(new Socks()));
        System.out.println(closet.add(new Socks()));
        System.out.println(closet.add(new Shoe()));
        System.out.println(closet.add(new Shirt ()));
        System.out.println(closet.add(new Shoe()));

        System.out.println(9999);




    }

}

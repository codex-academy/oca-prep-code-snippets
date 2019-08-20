package oca.cars;


interface ClothingPiece {
    default boolean isDirty(){
        return false;
    }
}

abstract class Shirt implements ClothingPiece {
    private boolean dirty = false;

    abstract int buttonCount();

    public void wear() {
        dirty = true;
    }

    @Override
    public boolean isDirty() {
        return dirty;
    }
}

class ShortSleeveShirt extends Shirt {

    @Override
    int buttonCount() {
        return 0;
    }
}

class LongSleeveShirt extends Shirt {
    @Override
    int buttonCount() {
        return 5;
    }
}


class Trousers implements ClothingPiece {
    public boolean needsBelt() {
        return true;
    }
}

class ShortTrousers extends Trousers {
    @Override
    public boolean needsBelt() {
        return false;
    }
}


class Socks implements ClothingPiece {

}


class Hat {

}

public class AboutClothing {


    public static void main(String[] args) {

        ClothingPiece shirt = new ShortSleeveShirt();
//        ClothingPiece shirt2 = new ShortSleeveShirt();


        System.out.println(shirt instanceof Shirt);
        System.out.println(shirt instanceof LongSleeveShirt);

//        LongSleeveShirt longShirt = (LongSleeveShirt)shirt;

        System.out.println(shirt instanceof ShortSleeveShirt);

//        System.out.println(shirt instanceof Shirt);

        // System.out.println(((Shirt)shirt).buttonCount());
        // System.out.println(((Shirt)shirt).buttonCount());




//        ClothingPiece trousers = new ShortTrousers();
//        ClothingPiece socks = new Socks();
//        ClothingPiece hat = new Hat();

        System.out.println("abc".substring(0,1));
    }

}

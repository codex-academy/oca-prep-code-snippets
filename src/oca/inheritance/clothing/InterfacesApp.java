package oca.inheritance.clothing;

import oca.inheritance.Returnable;
import oca.inheritance.clothing.items.*;

interface Collection {
    public void go();
}

interface Iterable {
    public void go();
}

interface List extends Collection, Iterable {

}

class TheList implements Collection, Iterable {

    @Override
    public void go() {

    }
}





public class InterfacesApp {
    public static void main(String[] args) {


        Clothing shirt = new TheShirt('L', 129.50);
        Clothing trousers = new Trousers();

        shirt.scan();

        Returnable socks = new Socks(false);

        Socks socksTwo;

        socksTwo = (Socks) socks;

        Clothing priceyShirt = new TheShirt('M', 987.00);

        Shirt thePriceyShirt = (Shirt)priceyShirt;

//        Returnable theReturnableShirt = (Shirt)priceyShirt;

        System.out.println( socks instanceof Returnable  );
        System.out.println( socks instanceof Clothing  );

        ((Clothing)socks).getPrice();

        // why is getPrice not available on socks...

        System.out.println(((Clothing)socks).getPrice());;

        trousers.getPrice();

    }
}

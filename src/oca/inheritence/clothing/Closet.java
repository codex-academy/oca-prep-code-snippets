package oca.inheritence;

import java.util.ArrayList;

public class Closet {

    private ArrayList<Clothing> clothes = new ArrayList<>();

    public void addClothing(Clothing clothing) {
        clothes.add(clothing);
    }

    public int sockCount() {
        int sockCount = 0;

        for(Clothing clothing: clothes){
            if (clothing instanceof Socks){
                sockCount++;
            }
        }
        return sockCount;
    }


}

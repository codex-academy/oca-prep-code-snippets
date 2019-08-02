package oca.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingNames {
    public static void main(String[] args) {

        String[] players = {"John", "Joe", "Thamba", "Lindani"};

        // lots of things to add a fifth player...

        List<String> thePlayers = new ArrayList(Arrays.asList(players));
        thePlayers.add("Lihle");

        System.out.println(thePlayers.size());

//        for(String player : thePlayers) {
//            // thePlayers.replaceAll(thePlayers.indexOf(player)); = player.toUpperCase();
//
//        }

        List<String> theUpperCasePlayers = new ArrayList<>();
        for(String player : thePlayers) {
            theUpperCasePlayers.add(player.toUpperCase());
        }

        System.out.println(thePlayers);
        System.out.println(theUpperCasePlayers);

        System.out.println("----------------------");


        thePlayers.replaceAll((currentName) ->  {
            return currentName.toUpperCase();
        });

        thePlayers.forEach((name) -> {
            System.out.print("--------> ");
            System.out.println(name);
        });

        System.out.println(thePlayers);

    }
}

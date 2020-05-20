package gotravel.models;

import java.util.ArrayList;

public class ListOwner {

    private static ArrayList<Owner> listOwner;
    
    public static ArrayList<Owner> instance() {
        if (listOwner == null) {
            listOwner = new ArrayList<>(); 
        }
        return listOwner;
    }

    private ListOwner() {
    }
}

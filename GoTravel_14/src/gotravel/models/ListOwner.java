package gotravel.models;

import java.util.ArrayList;

public class ListOwner {

    private static ArrayList<Propietario> listOwner;
    
    public static ArrayList<Propietario> instance() {
        if (listOwner == null) {
            listOwner = new ArrayList<>(); 
        }
        return listOwner;
    }

    private ListOwner() {
    }
}

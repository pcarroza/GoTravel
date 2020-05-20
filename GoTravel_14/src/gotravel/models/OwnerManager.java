package gotravel.models;

import java.util.ArrayList;

public class OwnerManager {
    
    protected ArrayList<Owner> listaDepropietario;
    
    protected OwnerManager() {
        this.listaDepropietario = ListOwner.instance(); 
    }
    
    public void append(Owner owner) {
        assert owner != null; 
        listaDepropietario.add(owner); 
    }
}

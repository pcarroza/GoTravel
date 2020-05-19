package gotravel.models;

import java.util.ArrayList;

public class OwnerManager {
    
    protected ArrayList<Propietario> listaDepropietario;
    
    protected OwnerManager() {
        this.listaDepropietario = ListOwner.instance(); 
    }
    
    public void append(Propietario owner) {
        assert owner != null; 
        listaDepropietario.add(owner); 
    }
}

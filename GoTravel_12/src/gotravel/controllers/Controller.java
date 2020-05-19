package gotravel.controllers;

import gotravel.models.ListaPropietario;

public abstract class Controller {
    
    protected ListaPropietario listaPropietario;
    
    protected Controller(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario; 
    }
    
    public abstract void control();
}

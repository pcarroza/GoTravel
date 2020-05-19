package gotravel.main;

import java.util.ArrayList;

public class ArregloPropietario {
    
    private ArrayList<Propietario> arregloDepropietario;
    private boolean salir = false; 
    
    public ArregloPropietario() {
        arregloDepropietario = new ArrayList<>();
    }

    public void agregarPropietario(Propietario propietario) {
      arregloDepropietario.add(propietario); 
    }
    
    public void cerrar() {
        salir = true; 
    }
    
    public boolean terminado() {
        return salir; 
    }
}

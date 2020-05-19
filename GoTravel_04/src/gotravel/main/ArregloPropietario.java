package gotravel.main;

public class ArregloPropietario {
    
    private Propietario[] arregloDepropietario;
    private int index = 0;

    public ArregloPropietario() {
        arregloDepropietario = new Propietario[3];
    }

    public void agregarPropietario(Propietario propietario) {
        arregloDepropietario[index] = propietario; 
        index++; 
    }

    public boolean isComplete() {
        return index >= 3; 
    }
}

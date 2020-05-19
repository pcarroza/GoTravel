package gotravel.options;

import gotravel.terminal.Terminal;
import gotravel.models.Telefono;

public abstract class Opcion {
    
    private String title;
    
    public Opcion(String title) {
        this.title = title; 
    }
    
    public void mostrarOpciones() {
        new Terminal().showMessageln(title);
    }
    
    public abstract Telefono ejecutar();
}

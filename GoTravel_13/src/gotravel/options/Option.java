package gotravel.options;

import gotravel.models.Telefono;
import gotravel.terminal.Terminal;

public abstract class Option {
    
    private String title;
    
    public Option(String title) {
        this.title = title; 
    }
    
    public void mostrarOpciones() {
        new Terminal().showMessageln(title);
    }
    
    public abstract Telefono getPhone();
}

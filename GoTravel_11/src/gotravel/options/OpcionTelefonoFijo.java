package gotravel.options;

import gotravel.models.Telefono;
import gotravel.models.TelefonoFijo;

public class OpcionTelefonoFijo extends Opcion {
    
    private TelefonoFijo telefonoFijo; 
    
    public OpcionTelefonoFijo() {
        super("1) Ingresar Número Fijo: ");
        telefonoFijo = new TelefonoFijo(); 
    }

    @Override
    public Telefono ejecutar() {
        telefonoFijo.ingresarNumeroTelefono(); 
        return telefonoFijo; 
    }
    
}

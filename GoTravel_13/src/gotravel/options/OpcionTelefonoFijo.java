package gotravel.options;

import gotravel.models.Telefono;
import gotravel.models.TelefonoFijo;

public class OpcionTelefonoFijo extends Option {
    
    private TelefonoFijo telefonoFijo; 
    
    public OpcionTelefonoFijo() {
        super("1) Ingresar Número Fijo: ");
        telefonoFijo = new TelefonoFijo(); 
    }
    
    @Override
    public Telefono getPhone() {
        return telefonoFijo; 
    }
}

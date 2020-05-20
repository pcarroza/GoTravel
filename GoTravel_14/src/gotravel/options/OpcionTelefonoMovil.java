package gotravel.options;

import gotravel.models.Phone;
import gotravel.models.TelefonoMovil;

public class OpcionTelefonoMovil extends Option {
    
    private TelefonoMovil telefonoMovil; 
    
    public OpcionTelefonoMovil() {
        super("2) Ingrese Número Celular: ");
        telefonoMovil = new TelefonoMovil(); 
    }
   
    @Override
    public Phone getPhone() {
        return telefonoMovil; 
    }
}

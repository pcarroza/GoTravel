package gotravel.options;

import gotravel.models.TelefonoMovil;
import gotravel.models.Telefono;

public class OpcionTelefonoMovil extends Opcion {
    
    private TelefonoMovil telefonoMovil; 
    
    public OpcionTelefonoMovil() {
        super("2) Ingrese Numero Celular: ");
        telefonoMovil = new TelefonoMovil(); 
    }

    @Override
    public Telefono ejecutar() {
        telefonoMovil.ingresarNumeroTelefono();
        return telefonoMovil; 
    }
}

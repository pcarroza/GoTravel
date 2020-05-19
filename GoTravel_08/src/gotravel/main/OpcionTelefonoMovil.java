package gotravel.main;

public class OpcionTelefonoMovil extends Opcion {
    
    private TelefonoMovil telefonoMovil; 
    
    public OpcionTelefonoMovil() {
        super("2) Ingrese Número Celular: ");
        telefonoMovil = new TelefonoMovil(); 
    }

    @Override
    public Telefono ejecutar() {
        telefonoMovil.ingresarNumeroTelefono();
        return telefonoMovil; 
    }
    
}

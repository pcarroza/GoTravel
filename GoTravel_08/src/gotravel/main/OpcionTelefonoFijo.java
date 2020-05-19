package gotravel.main;

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

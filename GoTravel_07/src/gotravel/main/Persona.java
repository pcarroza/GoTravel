package gotravel.main;

public class Persona {
    
    public String nombre; 
    public String apellidoMaterno; 
    public String apellidoPaterno;
    public String rut;
    
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    private void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    private void setRut(String rut) {
        this.rut = rut;
    }
    
    public void ingresarInformacion() {
        Terminal gestorIO = new Terminal(); 
        gestorIO.showMessageln("1) Ingrese Nombre: ");
        setNombre(gestorIO.inputString());
        gestorIO.showMessageln("2) Ingrese Apellido Materno: ");
        setApellidoMaterno(gestorIO.inputString());
        gestorIO.showMessageln("3) Ingrese Apellido Paterno: ");
        setApellidoPaterno(gestorIO.inputString());
        gestorIO.showMessageln("4) Ingrese Rut: ");
        setRut(gestorIO.inputString());
    }
    
}

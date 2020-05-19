package gotravel.main;

public class Persona {
    
    public String nombre; 
    public String apellidoMaterno; 
    public String apellidoPaterno;
    public String rut;
    
    public boolean bucarPropieatio(String nombre) {
        return getNombre().equals(nombre);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public void ingresarInformacion() {
        GestorIO gestorIO = new GestorIO(); 
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

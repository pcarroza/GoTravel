package gotravel.main;

import java.util.Scanner; 

public class Propietario extends Persona {
    
    Scanner scanner = new Scanner(System.in);
    public String codigoPropietario; 
    private Direccion direccion = new Direccion();
    private Fono fono = new Fono(); 
    private Email email = new Email();
    String[] codigoSepultura = new String[3];
    int cantidadSepulturas; 
    String[] nombredelcliente = new String[3]; 
    
    public Propietario(String codigoPropietario, String nombre, String apellidoMaterno, String apellidoPaterno, String rut, String direccion, String numeroDomicilio, String comuna,
                       String fonoResidencial, String celular, String email) {
        this.codigoPropietario = codigoPropietario;
        this.nombre = nombre; 
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.rut = rut; 
    }
    
    public String getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(String codigoPropietario) {
       this.codigoPropietario = codigoPropietario;
    }

    public boolean validarCodigoPropietario(String codigoPropietario) {
        if (this.codigoPropietario.equals(codigoPropietario)) {
            return true; 
        } else {
            return false; 
        }
    }
    
    public void agregarSepultura() {
        System.out.println("Ingrese número de sepulturas a comprar: ");
        cantidadSepulturas = scanner.nextInt();
        System.out.println("Ingrese código de la sepultura: ");
        
        for (int i = 0; i < codigoSepultura.length; i++) {
            System.out.println("Ingrese código de la sepultura: ");
            do {
                try {
                    codigoSepultura[i] = scanner.nextLine();
                    break; 
                } catch (Exception e) {
                    System.out.println("Error de entrada/salida");
                }
                
            } while (true);
        }
        
        for (int i = 0;  i < nombredelcliente.length; i++) {
            do {
                System.out.println("Ingrese nombre del dueño:  ");
                try {
                    codigoSepultura[i] = scanner.nextLine();
                    break; 
                } catch (Exception e) {
                    System.out.println("Error de entrada/salida");
                }
                
            } while(true);
        }
    }
    
    public boolean validarCorreo(String email) {
        return this.email.email == email; 
    }
    
   
    
}

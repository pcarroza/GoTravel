package gotravel.main;

import java.util.Scanner; 

/*Este es el Dijkstra, lo hice basado en los ejercicios resueltos de forma analítica, 
lo pongo a disposición de u

stedes para que lo revicen y en caso de ser necesario optimizarlo, espero que les 
sirva de algo, casi todas sus l
ineas están comentadas, cualquier error comentármelo y buscaremos la solución.
*/
public class Propietario {
    
    
    Scanner scanner = new Scanner(System.in);
    // Numero de propietario. 
    public String codPro; 
    
    // Datos personales 
    public String nombre; 
    public String apellidoMaterno; 
    public String apellidoPaterno;
    public String rut; 
    
    // domicilio.
    public String direccion; 
    public String numeroDomicilio; 
    public String comuna; 
    
    //numeros de telefonos. 
    public String fonoResidencial; 
    public String celular;
    public String email;  // email.
 
    String[] codigo_sepultura = new String[3];
    int cantidadSepulturas; 
    String[] nombredelcliente = new String[3]; 
    
    
    
    // Constructor
    public Propietario(String codPro_1, String nombre, String apellidoMaterno, String apellidoPaterno, String rut, String direccion, String numeroDomicilio, String comuna,
                       String fonoResidencial, String celular, String email) {
        codPro = codPro_1;
        this.nombre = nombre; 
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.rut = rut; 
        this.direccion = direccion; 
        this.numeroDomicilio =numeroDomicilio;
        this.comuna = comuna; 
        this.fonoResidencial = fonoResidencial; 
        this.celular = celular; 
        this.email = email; 
    }
    
    // Esta linea escrita por Pablo en 23 diciembre de 2045. 
    public String getCodigoPropietario() {
        return codPro;
    }

    public void setCodigoPropietario(String codPro_1) {
       codPro = codPro_1;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(String numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getFonoResidencial() {
        return fonoResidencial;
    }

    public void setFonoResidencial(String fonoResidencial) {
        this.fonoResidencial = fonoResidencial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean validarEmail(String email_2) {
        if (email.equals(email_2)) { return true;}
        else {
        return false; }
    }
    
    public boolean validarCodigoP(String a) {
        if (codPro.equals(a)) {
            return true; 
        } else {
            return false; 
        }
    }
    
    public void agregarSepultura() {
        System.out.println("Ingrese número de sepulturas a comprar: ");
        cantidadSepulturas = scanner.nextInt();
        
        for (int i = 0; i < codigo_sepultura.length; i++) {
            System.out.println("Ingrese código de la sepultura: ");
            do {
                try {
                    codigo_sepultura[i] = scanner.nextLine();
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
                    codigo_sepultura[i] = scanner.nextLine();
                    break; 
                } catch (Exception e) {
                    System.out.println("Error de entrada/salida");
                }
                
            } while(true);
        }
    }
    
    public boolean verificarFono(String telefono_3) {
      
        if (fonoResidencial.equals(telefono_3)) {
            return true; 
        }
        return false;
        
    }
    
    public boolean celular(String telefono_3) {
       
        if (this.celular.equals(telefono_3)) {
            return true; 
        }
        return false;
        
    }
    
}

package gotravel.main;

import java.util.Scanner;

public class GoTravel {

    Scanner scanner = new Scanner(System.in);
    Propietario[] arregloDepropietario = new Propietario[3];
    Propietario propietario;
    int index = 0; 
    
    public void agregarPropietario() {
        do {
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            try {
                System.out.println("Ingresar codigo de propietario");
                String codPro = scanner.nextLine();
                System.out.println("Ingresar nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingresar apellido: ");
                String apellidoMaterno = scanner.nextLine();
                System.out.println("Ingresar apellido paterno: ");
                String apellidoPaterno = scanner.nextLine();
                System.out.println("Ingresar rut ");
                String rut = scanner.nextLine();
                System.out.println("Ingresar direccion");
                String direccion = scanner.nextLine();
                System.out.println("Ingresar numero de casa: ");
                String numeroDomicilio = scanner.nextLine();
                System.out.println("Ingresar comuna: ");
                String comuna = scanner.nextLine();
                System.out.println("Ingresar fono residencial: ");
                String fonoResidencial = scanner.nextLine(); 
                System.out.println("Ingresar celular: ");
                String celular = scanner.nextLine();
                System.out.println("Ingresar correo: ");
                String email = scanner.nextLine();
                
                propietario = new Propietario(codPro, nombre, apellidoMaterno, apellidoPaterno, rut, direccion, numeroDomicilio, comuna, fonoResidencial, celular, email); 
                
                arregloDepropietario[index] = propietario; 
                index++; 
                
                if (index > 2) {
                    break; 
                }
                
            } catch (Exception e) {
                System.out.println("Error de entrada y salida");
            }
        } while (true);
    }

    public static void main(String[] args) {
        GoTravel goTravel = new GoTravel(); 
        goTravel.agregarPropietario();
    }
}

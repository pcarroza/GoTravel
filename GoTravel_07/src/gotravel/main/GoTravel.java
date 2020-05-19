package gotravel.main;

public class GoTravel {

    private ArregloPropietario arregloPropieatrio;
    
    public GoTravel() {
        arregloPropieatrio = new ArregloPropietario();
    }
    
    public void run() {
        do {
            Propietario propietario = new Propietario();
            propietario.ingresarInformacionPropietario();
            arregloPropieatrio.agregarPropietario(propietario);
            String respuesta = new DialogoStringLimitado("¿Desea agregar otro propietario? ").read();
            if (!(respuesta.equals("Y") || respuesta.equals("y"))) {
                arregloPropieatrio.cerrar();
            }
        } while (!arregloPropieatrio.terminado());
    }

    public static void main(String[] args) {
        new GoTravel().run();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    }
}

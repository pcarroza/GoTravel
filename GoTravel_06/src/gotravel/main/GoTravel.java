package gotravel.main;

public class GoTravel {

    private ArregloPropietario arregloPropieatrio;
    private GestorIO gestorIO = new GestorIO();
            
    public GoTravel() {
        arregloPropieatrio = new ArregloPropietario();
    }

    public void ejecutar() {
        do {
            String respuesta; 
            boolean ok = false;
            Propietario propietario = new Propietario();
            propietario.ingresarInformacionPropietario();
            arregloPropieatrio.agregarPropietario(propietario);
            gestorIO.showMessageln("¿Desea agregar otro propietario? [y | n]");
            do {
                respuesta = gestorIO.inputString(); 
                if (respuesta.equals("n") || respuesta.equals("N")) {
                    arregloPropieatrio.cerrar();
                    ok = true; 
                } else if (respuesta.equals("y") || respuesta.equals("Y")) {
                    ok = true; 
                } else {
                    gestorIO.showMessageln("ERROR. LA RESPUESTA DEBE ESTAR ENTRE [n | y] ");
                }
            } while (!ok);
        } while (!arregloPropieatrio.terminado());
    }

    public static void main(String[] args) {
        new GoTravel().ejecutar();
      
    }
}

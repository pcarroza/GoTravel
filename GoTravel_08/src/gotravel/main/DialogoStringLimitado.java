package gotravel.main;

public class DialogoStringLimitado {

    private YesNoDialog respuesta; 
    
    private String title;

    public DialogoStringLimitado(String title) {
        respuesta = new YesNoDialog(); 
        this.title = title;
    }

    public String read() {
        Terminal gestorIO = new Terminal();
        boolean right;
        String respuesta;
        do {
            gestorIO.showMessageln(title + this.respuesta);
            respuesta = gestorIO.inputString();
            right = this.respuesta.isIncludes(respuesta);
            if (!right) {
                gestorIO.showMessageln("ERROR. EL CARACTER DEBE SER" + this.respuesta);
            }
        } while (!right);
        return respuesta;
    }
}

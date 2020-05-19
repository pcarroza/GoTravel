package gotravel.terminal;

import gotravel.utils.YesNoDialog;

public class DialogoStringLimitado {

    private YesNoDialog respuesta; 
    
    private String title;

    public DialogoStringLimitado(String title) {
        respuesta = new YesNoDialog(); 
        this.title = title;
    }

    public String read() {
        Terminal gestorIO = new Terminal();
        boolean ok;
        String respuesta;
        do {
            gestorIO.showMessageln(title + this.respuesta);
            respuesta = gestorIO.inputString();
            ok = this.respuesta.isIncludes(respuesta);
            if (!ok) {
                gestorIO.showMessageln("ERROR. El caracter debe ser" + this.respuesta);
            }
        } while (!ok);
        return respuesta;
    }
}

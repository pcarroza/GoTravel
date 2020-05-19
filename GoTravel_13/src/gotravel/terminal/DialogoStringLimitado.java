package gotravel.terminal;

import gotravel.utils.YesNoDialog;

public class DialogoStringLimitado {

    private YesNoDialog respuesta;
    
    private Terminal gestorIO;
    
    private String title;

    public DialogoStringLimitado(String title) {
        respuesta = new YesNoDialog(); 
        gestorIO = new Terminal();
        this.title = title;
    }

    public String read() {
        boolean right;
        String answer;
        do {
            gestorIO.showMessageln(title + this.respuesta);
            answer = gestorIO.inputString();
            right = this.respuesta.isIncludes(answer);
            if (!right) {
                gestorIO.showMessageln("ERROR. EL CARACTER DEBE SER" + this.respuesta);
            }
        } while (!right);
        return answer;
    }
}

package gotravel.main;

public class DialogoStringLimitado {

    private String[] ARRAY_OF_POSSIBLE_ANSWERS = {"y", "Y", "N", "n"};
    
    private String title;

    public DialogoStringLimitado(String title) {
        this.title = title;
    }

    public boolean isIncludes(String character) {
        assert character != null;
        for (String characters : ARRAY_OF_POSSIBLE_ANSWERS) {
            if (characters.equals(character)) {
                return true;
            }
        }
        return false;
    }

    public boolean isY(String character) {
        assert character != null;
        return "Y".equals(character) || "y".equals(character);
    }

    public String read() {
        Terminal gestorIO = new Terminal();
        boolean ok;
        String respuesta;
        do {
            gestorIO.showMessageln(title + "[y | n]");
            respuesta = gestorIO.inputString();
            ok = isIncludes(respuesta);
            if (!ok) {
                gestorIO.showMessageln("ERROR. El caracter debe ser y o n");
            }
        } while (!ok);
        return respuesta;
    }

}

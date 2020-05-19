package gotravel.utils;

import gotravel.terminal.Terminal;

public class LimitedStringDialog {
    
    private Terminal terminal;
    
    private String title;

    public LimitedStringDialog(String title) {
        terminal = new Terminal();
        this.title = title;
    }

    public String read() {
        boolean right;
        String answer;
        do {
            terminal.showMessageln(title + "[Y | N]");
            answer = terminal.inputString();
            right = AnswerDialogYesNo.instance().isIncludes(answer);
            if (!right) {
                terminal.showMessageln("ERROR. EL CARACTER DEBE SER" + " [Y | N]");
            }
        } while (!right);
        return answer;
    }
}



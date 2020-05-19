package gotravel.terminal;

import gotravel.utils.ClosedInterval;

public class DialogoIntegerLimitado {

    private ClosedInterval closedInterval;
    
    private Terminal terminal;
    
    private String title;

    public DialogoIntegerLimitado(String title, int minimun, int maximun) {
        closedInterval = new ClosedInterval(minimun, maximun);
        terminal = new Terminal();
        this.title = title;
    }

    public int read() {
        boolean right = false;
        int value;
        do {
            terminal.showMessageln(title + closedInterval);
            value = terminal.inputInteger();
            if (!closedInterval.isInclued(value)) {
                terminal.showMessageln("ERROR. EL VALOR DEBE ESTAR ENTRE " + closedInterval);
            } else {
                right = true;
            }
        } while (!right);
        return value;
    }
}

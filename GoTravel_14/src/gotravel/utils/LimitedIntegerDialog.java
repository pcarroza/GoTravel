package gotravel.utils;

import gotravel.terminal.Terminal;

public class LimitedIntegerDialog {

    private ClosedInterval closedInterval;
    
    private Terminal terminal;
    
    private String title;

    public LimitedIntegerDialog(String title, int minimun, int maximun) {
        closedInterval = new ClosedInterval(minimun, maximun);
        terminal = new Terminal();
        this.title = title;
    }

    public LimitedIntegerDialog(String title, int maximun) {
        this(title, 1, maximun);
    }

    public int read() {
        boolean right = false;
        assert right == false;
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

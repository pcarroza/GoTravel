package gotravel.utils;

import gotravel.main.Terminal;

public class DialogoIntegerLimitado {

    private ClosedInterval closedInterval;
    private Terminal gestorIO;
    private String title;

    public DialogoIntegerLimitado(String title, int minimun, int maximun) {
        closedInterval = new ClosedInterval(minimun, maximun);
        gestorIO = new Terminal();
        this.title = title;
    }

    public int read() {
        boolean right = false;
        int value;
        do {
            gestorIO.showMessageln(title + closedInterval);
            value = gestorIO.inputInteger();
            if (!closedInterval.isInclued(value)) {
                gestorIO.showMessageln("ERROR. EL VALOR DEBE ESTAR ENTRE " + closedInterval);
            } else {
                right = true;
            }
        } while (!right);
        return value;
    }
}

package gotravel.main;

public class DialogoIntegerLimitado {

    private int minimun;
    
    private int maximun;
    
    private String title;

    public DialogoIntegerLimitado(String title, int minimun, int maximun) {
        this.minimun = minimun;
        this.maximun = maximun;
        this.title = title;
    }

    public int read() {
        Terminal gestorIO = new Terminal();
        boolean ok = false;
        int value;
        do {
            gestorIO.showMessageln(title + "[" + maximun + " , " + minimun + "]");
            value = gestorIO.inputInteger();
            if (!(value >= minimun && value <= maximun)) {
                gestorIO.showMessageln("ERROR. El valor debe estar entre " + "[" + maximun + " , " + minimun + "]");
            } else {
                ok = true;
            }
        } while (!ok);
        return value;
    }

}

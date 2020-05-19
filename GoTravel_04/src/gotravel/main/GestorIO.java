package gotravel.main;

import java.util.Scanner;

public class GestorIO {

    private static Scanner scanner;

    public GestorIO() {
        scanner = new Scanner(System.in);
    }

    public void showMessageln(String text) {
        assert text != null;
        System.out.println(text);
    }

    public void showMessageln(int data) {
        showMessageln(Integer.toString(data));
    }

    public String inputString() {
        String data = null;
        try {
            data = scanner.nextLine();
        } catch (Exception e) {
            this.showMessageln("ERROR de entrada/salida");
        }
        return data;
    }

    public int inputInteger() {
        int data = 0;
        try {
            data = Integer.parseInt(this.inputString());
        } catch (NumberFormatException e) {
            this.showMessageln("ERROR de entrada/salida");
        }
        return data;
    }
}

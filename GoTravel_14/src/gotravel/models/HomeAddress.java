package gotravel.models;

import gotravel.terminal.Terminal;

public class HomeAddress {

    public String nameOfTheStreet;
    
    public String numberOfHouse;
    
    public String commune;
    
    public String city;

    public void ingresarDireccion(String[] form) {
        nameOfTheStreet = form[0];
        numberOfHouse = form[1];
        commune = form[2];
        city = form[3];
    }
    
    public void showAddressInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("Calle            :" + nameOfTheStreet);
        gestorIO.showMessageln("Número de Casa   :" + numberOfHouse);
        gestorIO.showMessageln("Comuna           :" + commune);
        gestorIO.showMessageln("Ciudad           :" + city);
    }
}

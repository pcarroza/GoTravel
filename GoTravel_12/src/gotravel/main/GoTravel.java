package gotravel.main;

import gotravel.controllers.Controller;
import gotravel.controllers.Logic;
import gotravel.options.Menu;

public class GoTravel {
    
    private Logic logic; 

    public GoTravel() {
        logic = new Logic();
    }

    public void run() {
        Controller controller; 
        do {
            new Menu().showMenu();
            controller = logic.getController();
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new GoTravel().run();
    }
}

package gotravel.main;

import gotravel.controllers.Controller;
import gotravel.localcontroller.Logic;
import gotravel.view.View;

public class GoTravel {
    
    private Logic logic;
    
    private View view; 

    public GoTravel() {
        logic = new Logic();
        view = new View(); 
    }

    public void run() {
        Controller controller; 
        do {
            view.showMenu();
            controller = logic.getController(view.getIndex());
            if (controller != null) {
                view.interact(controller);
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new GoTravel().run();
    }
}

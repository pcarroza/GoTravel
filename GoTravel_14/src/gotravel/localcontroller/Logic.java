package gotravel.localcontroller;

import gotravel.controllers.Controller;
import gotravel.utils.ClosedInterval;

public class Logic {

    private LocalStartController startController;
    
    public Logic() {
      startController = new LocalStartController();
    }

    public Controller getController(int index) {
        assert new ClosedInterval(Constant.LIMIT_MAXIMUN_OF_OPTIONS).isInclued(index);
        return startController.getController(index);
    }
}

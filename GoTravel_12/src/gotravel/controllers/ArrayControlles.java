package gotravel.controllers;

import gotravel.utils.ClosedInterval;

public class ArrayControlles {

    private Controller[] controllers;
    
    private int index = 0; 

    public ArrayControlles(int NUMBER_OF_CONTROLLERS) {
        assert NUMBER_OF_CONTROLLERS == Constant.NUMBER_OF_CONTROLLERS;
        controllers = new Controller[NUMBER_OF_CONTROLLERS];
    }
    
    public void append(Controller controller) {
        assert controller != null;
        assert new ClosedInterval(Constant.LIMIT_MINIMUN_OF_ARRAY, 
                                  Constant.LIMIT_MAXIMUM_OF_ARRAY).isInclued(index); 
        controllers[index] = controller; 
        index++; 
        if (index > Constant.NUMBER_OF_CONTROLLERS) {
            index = 0; 
        }
    }

    public Controller getController(int index) {
        return controllers[index - 1];
    }
}

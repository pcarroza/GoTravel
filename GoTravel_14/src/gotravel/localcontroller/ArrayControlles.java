package gotravel.localcontroller;

import gotravel.utils.ClosedInterval;

public class ArrayControlles {

    private LocalController[] controllers;
    
    private int index = 0; 

    public ArrayControlles(int NUMBER_OF_CONTROLLERS) {
        assert NUMBER_OF_CONTROLLERS == Constant.NUMBER_OF_CONTROLLERS;
        controllers = new LocalController[NUMBER_OF_CONTROLLERS];
    }
    
    public void append(LocalController controller) {
        assert controller != null;
        assert new ClosedInterval(Constant.LIMIT_MINIMUN_OF_ARRAY, 
                                  Constant.LIMIT_MAXIMUM_OF_ARRAY).isInclued(index); 
        controllers[index] = controller; 
        index = index + 1; 
        if (index > Constant.NUMBER_OF_CONTROLLERS) {
            index = 0; 
        }
    }

    public LocalController getController(int index) {
        assert new ClosedInterval(Constant.LIMIT_MAXIMUN_OF_OPTIONS).isInclued(index);
        return controllers[index - 1];
    }
}

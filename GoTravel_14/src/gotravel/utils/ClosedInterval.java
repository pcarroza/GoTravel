package gotravel.utils;

public class ClosedInterval {

    private int minimum;
    
    private int maximum;

    public ClosedInterval(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    
    public ClosedInterval(int maximum) {
        this(1, maximum);
    }

    public boolean isContained(int value) {
        return value >= minimum && value <= maximum;
    }

    @Override
    public String toString() {
        return "[" + minimum + " - " + maximum + "]:";
    }
}



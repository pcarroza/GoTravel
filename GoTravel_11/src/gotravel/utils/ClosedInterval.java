package gotravel.utils;

public class ClosedInterval {

    private int minimun;
    private int maximun;

    public ClosedInterval(int minimun, int maximun) {
        this.minimun = minimun;
        this.maximun = maximun;
    }

    public boolean isInclued(int value) {
        return value >= minimun && value <= maximun; 
    }

    @Override
    public String toString() {
        return "[" + minimun + " - " + maximun + "]:";
    }
}

package org.openjfx.model.vo;

public class Lønnskrav {

    private int min;
    private int max;

    public Lønnskrav(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Lønnskrav{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}

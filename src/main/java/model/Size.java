package model;

public class Size {
    private int legth;
    private int height;
    private int perimitr;

    public Size() {
    }

    public Size(int legth, int height) {
        this.legth = legth;
        this.height = height;
    }

    public int getLegth() {
        return legth;
    }

    public int getHeight() {
        return height;
    }

    public int getPerimitr(int legth, int height) {
        return perimitr = 2*(legth + height);
    }

    public static int setPerimitr(Object o){
        int perimetr = 0;
        return perimetr;
    }
}

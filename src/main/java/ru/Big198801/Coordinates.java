package ru.Big198801;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coordinates getCoordinates() {
        return  new Coordinates(this.x, this.y);
    }
    public int getXCoordinates() {
        return this.x;
    }
    public int getYCoordinates() {
        return this.y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

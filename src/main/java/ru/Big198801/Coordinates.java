package ru.Big198801;

public class Coordinates {
    private int[] coordinates;

    public int[] getCoordinates() {
        return  coordinates;
    }

    public void setCoordinates(int x, int y) {
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public Coordinates(int x, int y) {
        coordinates = new int[]{x, y};
    }
}

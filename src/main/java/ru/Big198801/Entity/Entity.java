package ru.Big198801.Entity;

import ru.Big198801.Coordinates;
import ru.Big198801.Sprites;

public abstract class Entity {
  //  private String name;
   // private String spriteForm;
    private Coordinates coordinates;
    private static boolean  isEatable;


    public Entity(Coordinates coordinates ,boolean isEatable) {
        this.coordinates = coordinates;
        this.isEatable = isEatable;
    }

    public  void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
    public boolean isEatable() {
        return isEatable;
    }


}

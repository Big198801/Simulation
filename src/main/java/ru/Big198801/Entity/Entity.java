package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public abstract class Entity {
    public String name;
    public String spriteForm;
    public Coordinates coordinates;
    public boolean isEatable;


    public Entity(String name, String spriteForm, Coordinates coordinates, boolean isEatable) {
        this.name = name;
        this.spriteForm = spriteForm;
        this.coordinates = coordinates;
        this.isEatable = isEatable;
    }

}

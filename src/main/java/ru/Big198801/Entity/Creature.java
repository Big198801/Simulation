package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public abstract class Creature extends Entity {
    private int moveSpeed;
    private int healthPoints = 100;


    public Creature(String name, String spriteForm, Coordinates coordinates, boolean isEatable, int moveSpeed, int healthPoints) {
        super(name, spriteForm, coordinates, isEatable);
        this.moveSpeed = moveSpeed;
        this.healthPoints = healthPoints;
    }

    public abstract void makeMove();
}

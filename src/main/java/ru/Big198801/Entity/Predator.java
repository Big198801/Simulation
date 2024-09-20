package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public class Predator extends Creature {
    @Override
    public void makeMove() {

    }

    public Predator(String name, String spriteForm, Coordinates coordinates, boolean isEatable, int moveSpeed, int healthPoints) {
        super(name, spriteForm, coordinates, isEatable, moveSpeed, healthPoints);
    }
}

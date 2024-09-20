package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public class Herbivore extends Creature {


    public Herbivore(String name, String spriteForm, Coordinates coordinates, boolean isEatable, int moveSpeed, int healthPoints) {
        super(name, spriteForm, coordinates, isEatable, moveSpeed, healthPoints);
    }

    @Override
    public void makeMove() {

    }
}

package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public class Predator extends Creature {
    private int attackPower;


    public Predator(Coordinates coordinates, boolean isEatable, int moveSpeed, int healthPoints, String spriteForm, int attackPower) {
        super(coordinates, isEatable, moveSpeed, healthPoints, spriteForm);
        this.attackPower = attackPower;
    }

    public void attackHerbivore(Herbivore herbivore) {
        herbivore.setHP(herbivore.getHP() - this.attackPower);
    }

    @Override
    public int getHP() {
        return super.getHP();
    }

    @Override
    public int getMoveSpeed() {
        return super.getMoveSpeed();
    }

    @Override
    public boolean isEatable() {
        return super.isEatable();
    }

    @Override
    public void makeMove() {
        //TODO
    }

    @Override
    public void setHP(int healthPoints) {
        super.setHP(healthPoints);
    }

    @Override
    public void setMoveSpeed(int moveSpeed) {
        super.setMoveSpeed(moveSpeed);
    }

    @Override
    public Coordinates getCoordinates() {
        return super.getCoordinates();
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        super.setCoordinates(coordinates);
    }

}

package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public class Herbivore extends Creature {


    public Herbivore(Coordinates coordinates, boolean isEatable, int moveSpeed, int healthPoints, String sprite) {
        super(coordinates, isEatable, moveSpeed, healthPoints, sprite);

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
    public String getSpriteForm() {
        return super.getSpriteForm();
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

    @Override
    public void makeMove() {
        //TODO
    }

    public void findGrass(){
        //TODO
    }

}

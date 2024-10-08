package ru.Big198801.Entity;

import ru.Big198801.Coordinates;

public abstract class Creature extends Entity {
    private int moveSpeed;
    private int HP;
    private String spriteForm;


    public Creature(Coordinates coordinates, boolean isEatable, int moveSpeed, int healthPoints, String spriteForm ) {
        super(coordinates, isEatable);
        this.moveSpeed = moveSpeed;
        this.HP = healthPoints;
        this.spriteForm = spriteForm;

    }

    public abstract void makeMove();

    public int getHP() {
        return HP;
    }

    public void setHP(int healthPoints) {
        this.HP = HP;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
    public boolean isEatable() {
        return super.isEatable();
    }

    public String getSpriteForm() {
        return spriteForm;
    }
}

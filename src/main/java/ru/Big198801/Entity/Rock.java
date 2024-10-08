package ru.Big198801.Entity;

import ru.Big198801.Coordinates;
import ru.Big198801.Sprites;

public class Rock extends Entity {
    private static final String SPRITE_FORM = Sprites.STONE.getSpriteForm();



    public Rock(Coordinates coordinates, boolean isEatable) {
        super(coordinates, isEatable);
    }

    public static String getSpriteForm() {
        return SPRITE_FORM;
    }

    @Override
    public Coordinates getCoordinates() {
        return super.getCoordinates();
    }

    @Override
    public boolean isEatable() {
        return super.isEatable();
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        super.setCoordinates(coordinates);
    }
}

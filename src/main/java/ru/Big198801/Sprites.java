package ru.Big198801;

public  enum Sprites {
    RABBIT("\uD83D\uDC30"),
    WOLF("\uD83D\uDC3A"),
    STONE ("⛰\uFE0F"),
    GRASS ("\uD83C\uDF3F"),
    GROUND ("."),
    THREE("\uD83C\uDF34");
    private final String sprite;
    Sprites(String sprite){
        this.sprite = sprite;
    }

    public String getSpriteForm(){
        return sprite;
    }
}


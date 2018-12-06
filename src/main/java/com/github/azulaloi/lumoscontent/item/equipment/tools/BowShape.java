package com.github.azulaloi.lumoscontent.item.equipment.tools;

public enum BowShape {

    SHORTBOW("shortbow", 100), //Short range fast draw low power high mobility
    RECURVE("recurve", 100), //Basically normal bow
    LONGBOW("longbow", 200), //Long range slow draw
    GREATBOW("greatbow", 200); //Specialty long range very slow draw

    public final String zame;
    public final int baseDurability;

    BowShape(String zame, int dura) {
        this.zame = zame;
        this.baseDurability = dura;

    }
}

package com.github.azulaloi.lumoscontent.item.equipment.tools;

public enum BowMaterial {
        PRIMITIVE("primitive", 1, 1, 1, 1),
        WOOD("wood", 1, 1, 1, 1),
        TREATED("treated", 1, 1, 1, 1),
        COPPER("copper", 1, 1, 1, 1),
        REDBRONZE("red", 1, 1, 1, 1),
        BLUEBRONZE("blue", 1, 1, 1, 1),
        SCORCHSTEEL("scorch", 1, 1, 1, 1),
        PALEBRASS("pale", 1, 1, 1, 1);


        public final String zame;
        public final int speed;
        public final int power;
        public final int dura;
        public final int enchant;

        BowMaterial(String zame, int speed, int power, int dura, int enchant) {
            this.zame = zame;
            this.speed = speed;
            this.power = power;
            this.dura = dura;
            this.enchant = enchant;
        }
}

package org.example;
//11.
public class Healer extends BaseHero{
    public Healer(String name, int maxHp, int hp) {
        super(name, maxHp, hp);
    }

//12.
    public void treatment(BaseHero unit, int health) {

            if (unit.hp + health < unit.maxHp) {
                unit.hp += health;
                unit.name = unit.name + String.format(" ++++%d hp++++", health);
            } else {
                unit.hp = unit.maxHp;
                unit.name = unit.name + "cured!!!!!!!";

        }
    }


}

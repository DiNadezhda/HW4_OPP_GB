package OPP.Lesson4.Warriors;

import OPP.Lesson4.Weapons.meleeWeapon.Melee;
import OPP.Lesson4.shields.Shield;

public class Infantryman extends Warrior<Melee, Shield>{

    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    public Infantryman(String name, int healthPoint, Melee weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}

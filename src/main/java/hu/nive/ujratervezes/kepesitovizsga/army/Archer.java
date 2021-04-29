package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        setHitPoints(50);
        setDamage(20);
        setProtection(false);
    }

    @Override
    public int doDamage() {
        return getDamage();
    }
}

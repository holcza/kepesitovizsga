package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield;

    public Swordsman(boolean protection) {
        setHitPoints(100);
        setDamage(10);
        setProtection(protection);
        shield = true;
    }

    @Override
    public int doDamage() {
        return getDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        if (shield) {
            shield = false;
            return;
        } else {
            super.sufferDamage(damage);
        }

    }
}

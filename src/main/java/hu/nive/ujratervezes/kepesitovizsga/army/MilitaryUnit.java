package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;

    private int damage;

    private boolean protection;

    public int getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isProtection() {
        return protection;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setProtection(boolean protection) {
        this.protection = protection;
    }

    public abstract int doDamage();

    public void sufferDamage(int damage) {
        if (protection) {
            this.hitPoints -= damage / 2;
        } else {
            this.hitPoints -= damage;
        }
    }


}

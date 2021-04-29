package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int numberOfDamages;

    public HeavyCavalry() {
        setHitPoints(150);
        setDamage(20);
        setProtection(true);
    }


    @Override
    public int doDamage() {
        int doDamage;
        if (numberOfDamages == 0) {
            doDamage = getDamage() * 3;
        } else {
            doDamage = getDamage();
        }
        numberOfDamages++;
        return doDamage;
    }
}

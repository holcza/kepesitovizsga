package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> removeMilitaryUnits = new ArrayList<>();
        for (MilitaryUnit mu : militaryUnits) {
            mu.sufferDamage(damage);
            if (mu.getHitPoints() < 25) {
                removeMilitaryUnits.add(mu);
            }
        }
        militaryUnits.removeAll(removeMilitaryUnits);
    }

    public int getArmyDamage() {
        int sum = 0;
        for (MilitaryUnit mu : militaryUnits) {
            sum += mu.doDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}

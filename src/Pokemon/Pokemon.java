package Pokemon;

import java.util.List;

public abstract class Pokemon {

    private final String name;
    private final int lvl;
    private int hp;
    private final String food;
    private final String sound;

    public Pokemon(String name, int lvl, int hp, String food, String sound) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    // method that formulates a neat string for printing attack info
    public void printAttack(String attackerName, String defenderName, String abilityName) {
        System.out.println(attackerName + " attacks " + defenderName + " with " + abilityName + ".");
    }

    public void printAfterAttackUpdate (Pokemon defender, int damage) {
        System.out.println(defender.getName() + " loses " + damage + " hp.");
        System.out.println(defender.getName() + " has " + defender.getHp() +  " hp left.");
    }

    // returns the multiplier for an attack depending on whether an attack is weak or ressistant to it
    public double checkEffectiveness(String typeMove, Pokemon defender) {

        // if opponent is extra weak the pokemon deals 400% dmg
        if (defender.getDoubleWeaknesses().contains(typeMove)) {
            return 4;
        } else if (defender.getWeaknesses().contains(typeMove)) {  //200 % extra dmg
            return 2;
        } else if (defender.getRessistances().contains(typeMove)) { //50% less dmg on resistance
            return 0.5;
        } else { // if not weak nor resistant attack will deal normal dmg
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    // abstract method that handles returning the type
    public abstract  String getType();
    // sets up returning weaknesses and resistances for the checkEffectiveness method
    public abstract List<String> getDoubleWeaknesses();
    public abstract List<String> getWeaknesses();
    public abstract List<String> getRessistances();

    public void setHp(int hp) {
        this.hp = hp;
    }
}

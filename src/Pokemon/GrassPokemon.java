package Pokemon;

import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final String type = "grass";
    private final List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leaveblade", "leechseed");
    private final List<String> doubleWeaknesses = Arrays.asList("fire");
    private final List<String> weaknesses = Arrays.asList("electric");
    private final List<String> ressistances = Arrays.asList("grass");

    public GrassPokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);

    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Leaf Storm");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(6 * checkEffectiveness("grass", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Solar Beam");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(10 * checkEffectiveness("grass", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Leech Seed");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(2 * checkEffectiveness("grass", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // adds the dmg to the hp of the attacker
        name.setHp(name.getHp() + damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
        System.out.println(name.getName() + " healed " + damage + " hp.");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left.");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Leave Blade");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(8 * checkEffectiveness("grass", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }

    @Override
    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public List<String> getDoubleWeaknesses() {
        return doubleWeaknesses;
    }

    @Override
    public List<String> getWeaknesses() {
        return weaknesses;
    }

    @Override
    public List<String> getRessistances() {
        return ressistances;
    }
}
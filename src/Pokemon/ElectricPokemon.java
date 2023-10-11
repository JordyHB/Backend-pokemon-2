package Pokemon;

import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final String type = "electric";
    private final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volt tackle");
    private final List<String> doubleWeaknesses = Arrays.asList("grass");
    private final List<String> weaknesses = Arrays.asList("water");
    private final List<String> ressistances = Arrays.asList("electric");

    public ElectricPokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);

    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Thunderpunch");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(6 * checkEffectiveness("electric", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }
    public void electroBall(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Electroball");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(4 * checkEffectiveness("electric", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }
    public void thunder(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("electric")) {
            System.out.println("The thunder has healed the enemy " + enemy.getName() + " for 10 hp.");
            enemy.setHp(enemy.getHp() + 10);
        } else {
            printAttack(name.getName(), enemy.getName(), "Thunder");
            // checks resistances and sets the dmg accordingly
            int damage = (int) Math.round(8 * checkEffectiveness("electric", enemy));
            enemy.setHp(enemy.getHp() - damage);
            // method neatly prints the result of the attack.
            printAfterAttackUpdate(enemy, damage);
        }
    }
    public void voltTackle(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Volt Tackle");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(10 * checkEffectiveness("electric", enemy));
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
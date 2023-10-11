package Pokemon;

import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final String type = "fire";
    private final List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");
    private final List<String> doubleWeaknesses = Arrays.asList("water");
    private final List<String> weaknesses = Arrays.asList("electric");
    private final List<String> ressistances = Arrays.asList("fire");

    public FirePokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);

    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Firelash");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(6 * checkEffectiveness("fire", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Flamethrower");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(4 * checkEffectiveness("fire", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Pyroball");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(8 * checkEffectiveness("fire", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Inferno");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(10 * checkEffectiveness("fire", enemy));
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

package Pokemon;

import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type = "water";
    private final List<String> attacks = Arrays.asList("hydrocanon", "raindance", "hydropump", "surf");
    private final List<String> doubleWeaknesses = Arrays.asList("electric");
    private final List<String> weaknesses = Arrays.asList("fire");
    private final List<String> ressistances = Arrays.asList("water");

    public WaterPokemon(String name, int lvl, int hp, String food, String sound) {
        super(name, lvl, hp, food, sound);

    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Hydro Canon");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(10 * checkEffectiveness("water", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }
    public void rainDance(Pokemon name, Pokemon enemy) {
        // handles edge cases of type interaction
        if (enemy.getType().equals("grass")) {
            System.out.println("The rain healed" + enemy.getName() + " for 10 hp.");
            enemy.setHp(enemy.getHp() + 10);
        } else if (enemy.getType().equals("electric")) {
            System.out.println("The rain has no effect on " + enemy.getName() + ".");
        } else {
            printAttack(name.getName(), enemy.getName(), "Rain Dance");
            // checks resistances and sets the dmg accordingly
            int damage = (int) Math.round(2 * checkEffectiveness("water", enemy));
            enemy.setHp(enemy.getHp() - damage);
            // method neatly prints the result of the attack.
            printAfterAttackUpdate(enemy, damage);
        }
    }
    public void hydroPump(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Hydro Pump");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(8 * checkEffectiveness("water", enemy));
        enemy.setHp(enemy.getHp() - damage);
        // method neatly prints the result of the attack.
        printAfterAttackUpdate(enemy, damage);
    }
    public void surf(Pokemon name, Pokemon enemy) {
        printAttack(name.getName(), enemy.getName(), "Surf");
        // checks resistances and sets the dmg accordingly
        int damage = (int) Math.round(6 * checkEffectiveness("water", enemy));
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
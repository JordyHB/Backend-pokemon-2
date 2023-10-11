package Trainers;

import Pokemon.*;
import java.util.List;

public class PokemonTrainer {

    private final String name;
    private final List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}

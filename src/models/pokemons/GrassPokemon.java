package models.pokemons;

import models.pokemons.utils.Attack;
import models.pokemons.utils.TypePokemon;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int health, Attack[] attacks) {
        super(name, health, TypePokemon.GRASS, attacks);
    }

    @Override
    public float calculateAdvantage(Pokemon enemy) {
        if (enemy instanceof WaterPokemon) {
            return 1.3f; // Ventaja contra Pokémon de Agua
        }
        return 1.0f; // Daño normal
    }
}
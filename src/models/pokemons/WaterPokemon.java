package models.pokemons;

import models.pokemons.utils.Attack;
import models.pokemons.utils.TypePokemon;

public class WaterPokemon extends Pokemon {
    /**
     * constructor de la clase abstracta pokemon
     *
     * @param name    nombre del pokemon
     * @param health  salud del pokemon
     * @param attacks ataques del pokemon
     */
    public WaterPokemon(String name, int health, Attack[] attacks) {
        super(name, health, TypePokemon.WATER, attacks);
    }

    @Override
    public float calculateAdvantage(Pokemon enemy) {
        if (enemy instanceof FirePokemon) {
            return 1.3f;
        }
        return 1f;
    }
}

package models.pokemons;

import models.pokemons.utils.Attack;
import models.pokemons.utils.TypePokemon;

public class FirePokemon extends Pokemon {
    /**
     * constructor de la clase abstracta pokemon
     *
     * @param name    nombre del pokemon
     * @param health  salud del pokemon
     * @param attacks ataques del pokemon
     */
    public FirePokemon(String name, int health, Attack[] attacks) {
        super(name, health, TypePokemon.FIRE, attacks);
    }

    /**
     * calcula la ventaja que tiene el pokemon hacia otro dependiendo del tipo
     *
     * @param enemy el pokemon enemigo que se va calcular si se le tiene alguna ventaja hacia el
     * @return float
     */
    @Override
    public float calculateAdvantage(Pokemon enemy) {
        if (enemy instanceof GrassPokemon) {
            return 1.3f;
        }
        return 1f;
    }
}

package models.pokemons;

import models.pokemons.utils.Attack;
import models.pokemons.utils.TypePokemon;


public class FlyingPokemon extends Pokemon {
    public FlyingPokemon(String name, int health, Attack[] attacks) {
        super(name, health,TypePokemon.FLYING, attacks);
    }


    @Override
    public float calculateAdvantage(Pokemon enemy) {
        if(enemy instanceof GrassPokemon){
            return 1.3f;
        }
        return 1;
    }
}

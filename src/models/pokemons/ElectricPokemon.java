package models.pokemons;
import models.pokemons.utils.Attack;
import models.pokemons.utils.TypePokemon;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, int health, Attack[] attacks) {
        super(name, health, TypePokemon.ELECTRIC, attacks);
    }

    @Override
    public float calculateAdvantage(Pokemon enemy) {
        if (enemy instanceof WaterPokemon || enemy instanceof FlyingPokemon) {
            return 1.3f;
        }
        return 1;


    }

}

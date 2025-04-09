package utils;

import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;

public class PokemonFactory {
    //metodo que crea y devuelve todos los pokemones predefinidos disponibles
    public static Pokemon[] loadAvailablePokemons() {
        return new Pokemon[]{
                new Pokemon("Charmander", 100, TypePokemon.FIRE, new Attack[]{
                        Attack.FLAMETHROWER, Attack.FIRE_BLAST, Attack.TACKLE, Attack.DOUBLE_KICK
                }),
                new Pokemon("Squirtle", 100, TypePokemon.WATER, new Attack[]{
                        Attack.WATER_GUN, Attack.TACKLE, Attack.DOUBLE_KICK, Attack.QUICK_ATTACK
                }),
                new Pokemon("Bulbasaur", 100, TypePokemon.GRASS, new Attack[]{
                        Attack.VINE_WHIP, Attack.SOLAR_BEAM, Attack.RAZOR_LEAF, Attack.TACKLE
                }),
                new Pokemon("Pikachu", 90, TypePokemon.ELECTRIC, new Attack[]{
                        Attack.THUNDERBOLT, Attack.THUNDER, Attack.SHOCK_WAVE, Attack.QUICK_ATTACK
                }),
                new Pokemon("Arcanine", 110, TypePokemon.FIRE, new Attack[]{
                        Attack.FIRE_BLAST, Attack.FLAMETHROWER, Attack.QUICK_ATTACK, Attack.TACKLE
                }),
                new Pokemon("Scyther", 100, TypePokemon.GRASS, new Attack[]{
                        Attack.LEAF_BLADE, Attack.SLASH, Attack.DOUBLE_KICK, Attack.TACKLE
                }),
                new Pokemon("Electabuzz", 95, TypePokemon.ELECTRIC, new Attack[]{
                        Attack.THUNDERBOLT, Attack.THUNDER, Attack.SHOCK_WAVE, Attack.QUICK_ATTACK
                })

        };
    }



}

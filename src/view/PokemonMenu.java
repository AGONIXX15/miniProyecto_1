package view;

import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;
import java.util.Scanner;


public class PokemonMenu {




    //mostrar pokemones disponibles
    public static void showAllPokemons(Pokemon[] pokemons) {
        System.out.println("\n📋 Lista de Pokémon disponibles:");
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println((i + 1) + ". " + pokemons[i].getName() + " - Tipo: " + pokemons[i].getType());
        }
    }

    //Mostrar los ataques de un Pokémon específico
    public static void showPokemonAttacks(Pokemon pokemon) {
        System.out.println("\n💥 Ataques de " + pokemon.getName() + ":");
        for (Attack atk : pokemon.getAttacks()) {
            System.out.println("- " + atk.getName() + " | Poder: " + atk.getPower() + " | Tipo: " + atk.getTypeDamage());
        }
    }
}
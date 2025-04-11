package view;

import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;
import java.util.Scanner;


public class PokemonMenu {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String CYAN_BOLD = "\u001B[1;96m";
    public static final String WHITE_BOLD = "\u001B[1;97m";
    public static final String GREEN = "\u001B[32m";


    //mostrar pokemones disponibles
    public static void showAllPokemons(Pokemon[] pokemons) {
        System.out.println(WHITE_BOLD + "\n📋 Lista de Pokémon disponibles:"+ RESET);
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println(RED+(i + 1) + WHITE_BOLD + ". " + pokemons[i].getName() +  " - Tipo: " + pokemons[i].getType()+RESET);
        }
    }

    //Mostrar los ataques de un Pokémon específico
    public static void showPokemonAttacks(Pokemon pokemon) {
        System.out.println(WHITE_BOLD + "\n💥 Ataques de " + GREEN + pokemon.getName() + ":");
        int index = 0;
        for (Attack atk : pokemon.getAttacks()) {
            System.out.println(RED+(index + 1) + WHITE_BOLD + ". -" + atk.getName() + " | Poder: " + atk.getPower() + " | Tipo: " + atk.getTypeDamage()+RESET);
            index++;
        }
    }
}
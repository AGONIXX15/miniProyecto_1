package utils;

import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;
import java.util.Scanner;


public class PokemonFactory {
    //metodo que crea y devuelve todos los pokemones predefinidos disponibles
    public static Pokemon[] loadAvailablePokemons() {
        return new Pokemon[]{
                new Pokemon("Charmander", 100, TypePokemon.FUEGO, new Attack[]{
                        Attack.FLAMETHROWER, Attack.FIRE_BLAST, Attack.TACKLE, Attack.DOUBLE_KICK
                }),
                new Pokemon("Squirtle", 100, TypePokemon.AGUA, new Attack[]{
                        Attack.WATER_GUN, Attack.TACKLE, Attack.DOUBLE_KICK, Attack.QUICK_ATTACK
                }),
                new Pokemon("Bulbasaur", 100, TypePokemon.PLANTA, new Attack[]{
                        Attack.VINE_WHIP, Attack.SOLAR_BEAM, Attack.RAZOR_LEAF, Attack.TACKLE
                }),
                new Pokemon("Pikachu", 90, TypePokemon.ELECTRICO, new Attack[]{
                        Attack.THUNDERBOLT, Attack.THUNDER, Attack.SHOCK_WAVE, Attack.QUICK_ATTACK
                }),
                new Pokemon("Arcanine", 110, TypePokemon.FUEGO, new Attack[]{
                        Attack.FIRE_BLAST, Attack.FLAMETHROWER, Attack.QUICK_ATTACK, Attack.TACKLE
                }),
                new Pokemon("Scyther", 100, TypePokemon.PLANTA, new Attack[]{
                        Attack.LEAF_BLADE, Attack.SLASH, Attack.DOUBLE_KICK, Attack.TACKLE
                }),
                new Pokemon("Electabuzz", 95, TypePokemon.ELECTRICO, new Attack[]{
                        Attack.THUNDERBOLT, Attack.THUNDER, Attack.SHOCK_WAVE, Attack.QUICK_ATTACK
                })

        };
    }

    public static Pokemon createPokemonFromZero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del Pokémon: ");
        String namePokemon = sc.nextLine();

        System.out.print("Salud: ");
        int salud = Integer.parseInt(sc.nextLine());

        System.out.println("Tipo de Pokémon:");
        for (TypePokemon type : TypePokemon.values()) {
            System.out.println("- " + type);
        }
        System.out.print("Elige el tipo: ");
        TypePokemon typepokemon = TypePokemon.valueOf(sc.nextLine().toUpperCase());

        Attack[] attacks = new Attack[4];

        for (int i = 0; i < attacks.length; i++) {
            System.out.println("----- Ataque " + (i + 1) + " -----");
            System.out.print("Nombre del ataque: ");
            String nameAttack = sc.nextLine();

            System.out.print("Poder del ataque: ");
            short power = (short) Integer.parseInt(sc.nextLine());


            System.out.println("Tipo de daño del ataque:");
            TypeDamage[] type = TypeDamage.values();
            for (int j = 0; j < type.length; j++) {
                System.out.println((j + 1) + ". " + type[j]);
            }
            System.out.print("Elige una opción (número): ");
            int optionType = Integer.parseInt(sc.nextLine());
            TypeDamage typeAttack = type[optionType - 1];

            attacks[i] = new Attack(nameAttack, power, typeAttack);
        }


        return new Pokemon(namePokemon, salud, typepokemon, attacks);
    }



}

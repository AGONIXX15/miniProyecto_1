package models;
import models.pokemon.Pokemon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sebastian Devia
 */

public class Trainer {
    /**
     * atributos: NombreEntrenador,Equipo
     */
    public String nameTrainer;
    public Pokemon[] pokemons;
    private Pokemon[] team;

    public Trainer(String nameTrainer, Pokemon[] pokemons) {
        this.nameTrainer = nameTrainer;
        this.pokemons = pokemons;
        this.team = new Pokemon[3];
    }

    public String getNameTrainer() {
        return nameTrainer;
    }

    public void setNameTrainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public void getTeam() {
        System.out.println("Tu equipo de batalla es: ");
        for (int i = 0; i < team.length; i++) {
            System.out.println( team[i].getName());

        }
    }

    public void setTeam(String[] team) {
        team = team;
    }


    /**
     * Metodo para eligir un pokemon de batalla
    * @return el pokemon escogido
     */
    public Pokemon SelectPokemon() {
        Scanner sc = new Scanner(System.in);
        //mostramos los pokemones
        for (int i = 0; i < pokemons.length; i++) {

            System.out.printf("%d. %s \n", i + 1, pokemons[i]);

        }
        System.out.print("Selecciona un pokemon para combatir: ");
        int PokemonChosen = sc.nextInt()-1;
        return pokemons[PokemonChosen];

    }
    public void addTeam(){
        for (int i = 0; i < pokemons.length; i++) {
            team[i] = SelectPokemon();
        }
    }
}
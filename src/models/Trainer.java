package models;
import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import java.util.Random;
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
    public Pokemon[] team;


    public Trainer(String nameTrainer, Pokemon[] pokemons) {
        this.nameTrainer = nameTrainer;
        this.pokemons = pokemons;
        this.team = new Pokemon[3];
    }

    public Trainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
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
            System.out.println(team[i].showInfo());
        }
    }

    public void setTeam(Pokemon[] team) {
        this.team = team;
    }


    public Pokemon SelectPokemon() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pokemons.length; i++) {

            if (pokemons[i] != null) {
                System.out.printf("%d. %s \n", i + 1, pokemons[i].showInfo());
            }
        }
        System.out.print("Selecciona tu equipo de batalla (3 pokemons): ");
        int PokemonChosen = sc.nextInt() - 1;

        if (PokemonChosen >= 0 && PokemonChosen < pokemons.length && pokemons[PokemonChosen] != null) {
            Pokemon selected = pokemons[PokemonChosen];
            selected = pokemons[PokemonChosen];
            pokemons[PokemonChosen] = null; // Lo elimina
            return selected;
        } else {
            System.out.println("Selección inválida, intenta de nuevo.");
            return SelectPokemon();
        }

    }

    public void addTeam() {
        for (int i = 0; i <3; i++) {
            team[i] = SelectPokemon();
        }
    }

    public boolean checkTeam(Pokemon pokemon) {
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null && team[i].getName().equals(pokemon.getName())) {
                return true;
            }
        }
        return false;
    }

    public void randomTeam() {
        Random r = new Random();
        int count = 0;

        while (count < 3) {
            int index = r.nextInt(pokemons.length);
            if (!checkTeam(pokemons[index])) {
                team[count] = pokemons[index];
                count++;
            }
        }
    }

    public void setAvailablePokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }


}

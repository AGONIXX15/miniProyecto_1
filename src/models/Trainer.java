package models;
import models.pokemon.Pokemon;
import java.util.Scanner;
import java.util.Random;



/**
 * @author Sebastian Devia
 */

public class Trainer {
    /**
     * atributos: Nombre,Entrenador,Equipo
     */
    public String nameTrainer;
    public Pokemon[] pokemons;
    public Pokemon[] team;

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

    /**
     * Metodo para ver el equipo selecionado
     */
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
            if (pokemons[i] != null) {
                System.out.printf("%d. %s \n", i + 1, pokemons[i]);
            }



        }
        System.out.print("Selecciona un pokemon para combatir: ");
        int PokemonChosen = sc.nextInt()-1;
        Pokemon select = pokemons[PokemonChosen];
        pokemons[PokemonChosen] = null;
        return select;

    }

    /**
     * Metodo para agregar pokemones al equipo
     */
    public void addTeam(){
        for (int i = 0; i < pokemons.length; i++) {
            team[i] = SelectPokemon();
        }
    }

    /**
     *
     * @param pokemon
     * @return returna verdadero si el pokemon se encuentra repetido
     */
    public boolean checkTeam(Pokemon pokemon) {

        for (int i = 0; i < team.length; i++) {
            if (team[i] != null && team[i].getName().equals(pokemon.getName())) {
                return true;
            }
        }
        return false;

    }

    /**
     *Metodo para selecionar un equipo random
     */
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
}



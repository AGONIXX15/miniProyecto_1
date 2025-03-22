package models;
import models.pokemons.Pokemon;
import java.util.Scanner;

/**
 * @author Sebastian Devia
 */

public class Trainer {
    /**
     * atributos: NombreEntrenador,Equipo
     */
    public String nameTrainer;
    private Pokemon[] team;

    public Trainer(String nameTrainer, Pokemon[] team) {
        this.nameTrainer = nameTrainer;
        team = team;
    }

    public String getNameTrainer() {
        return nameTrainer;
    }

    public void setNameTrainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public Pokemon[] getTeam() {
        return team;
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
        for (int i = 0; i < team.length; i++) {
            System.out.printf("%d .%s \n", i + 1, team[i]);

        }
        System.out.print("Selecciona un pokemon para combatir: ");
        int PokemonChosen = sc.nextInt()-1;
        return team[PokemonChosen];

    }
}
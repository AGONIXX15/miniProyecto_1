package view;

import models.Trainer;
import models.pokemon.Pokemon;
import models.Trainer;
import java.util.Scanner;

public class TrainerMenu {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String CYAN_BOLD = "\u001B[1;96m";
    public static final String WHITE_BOLD = "\u001B[1;97m";
    public static final String GREEN = "\u001B[32m";


    private static final Scanner scanner = new Scanner(System.in);
    private static Trainer trainer1, trainer2;


    public static Trainer[] enterCoaches() {
        System.out.print(WHITE_BOLD + "\nIngrese el nombre del " + GREEN + "Entrenador 1: " + RESET);
        String coach1 = scanner.nextLine();
        trainer1 = new Trainer(coach1);  // Asignar equipo después del nombre


        System.out.print(WHITE_BOLD + "\nIngrese el nombre del " + GREEN + "Entrenador 2: " + RESET);
        String coach2 = scanner.nextLine();
        trainer2 = new Trainer(coach2);  // Asignar equipo después del nombre


        System.out.println(GREEN + "\n✅ Entrenadores registrados correctamente." + RESET);

        return new Trainer[]{trainer1, trainer2};  // Devolver ambos entrenadores
    }





    //mostrar equipo
    public static void showTeam(Trainer trainer) {
        System.out.println("\nEquipo de " + trainer.getNameTrainer() + ":");
        trainer.getTeam();
    }

    // seleccionar pokemon para la batalla
    public static Pokemon selectPokemonBattle(Trainer trainer) {
        return trainer.SelectPokemon();
    }

    //metodo equipo aletorio
    public static void RandomTeamPokemons(Trainer trainer) {
        trainer.randomTeam();
        System.out.println(WHITE_BOLD + "\nEquipo de " + GREEN + trainer.getNameTrainer() +WHITE_BOLD + ":");
        trainer.getTeam();
    }

}


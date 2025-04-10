package view;

import models.Trainer;
import models.pokemon.Pokemon;

import java.util.Scanner;

public class TrainerMenu {

    private static final Scanner scanner = new Scanner(System.in);
    private static Trainer trainer1, trainer2;


    public static Trainer[] enterCoaches() {
        System.out.print("\nIngrese el nombre del Entrenador 1: ");
        String coach1 = scanner.nextLine();
        trainer1 = new Trainer(coach1);  // Asignar equipo después del nombre


        System.out.print("Ingrese el nombre del Entrenador 2: ");
        String coach2 = scanner.nextLine();
        trainer2 = new Trainer(coach2);  // Asignar equipo después del nombre


        System.out.println("\nEntrenadores registrados correctamente.");

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
}


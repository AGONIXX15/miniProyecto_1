package view;

import models.Trainer;
import models.pokemon.Pokemon;
import utils.PokemonFactory;
import java.util.Scanner;

import static view.TrainerMenu.RandomTeamPokemons;
import static view.TrainerMenu.enterCoaches;



public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static Trainer trainer1, trainer2;
    private static final Pokemon[] loadAvailablePokemons  = utils.PokemonFactory.loadAvailablePokemons();

    public static void main() {
        int opcion;

        do {
            System.out.print("_________________________________________________________________________");
            System.out.println("\n        ========= 🎮\uD83D\uDD25 MENÚ DE SIMULADOR POKÉMON 🎮\uD83D\uDD25 =========");
            System.out.println("_________________________________________________________________________");
            System.out.println("1. Ingresar entrenadores");
            System.out.println("2. Seleccionar equipo Pokémon");
            System.out.println("3. Iniciar batalla");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Trainer[] trainers = enterCoaches();
                    trainer1 = trainers[0];
                    trainer2 = trainers[1];
                    break;
                case 2:

                    if (trainer1 == null || trainer2 == null) {
                        System.out.println("⚠️ Primero debes registrar a los entrenadores.");
                    } else {
                        System.out.println("Es hora de elegir los equipos para la gran batalla!");
                        System.out.println("\n¿Cómo deseas seleccionar los equipos?");
                        System.out.println("1. Elegir Pokémon desde la lista predefinida 🗂️");
                        System.out.println("2. Crear Pokémon personalizados desde cero ✍️");
                        System.out.println("3.Crear un equipo aleatorio 😎");
                        System.out.print("Selecciona una opción: ");
                        int subOpcion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        Pokemon[] disponibles = PokemonFactory.loadAvailablePokemons();

                        switch (subOpcion) {
                            case 1:


                                // Asignar lista al entrenador
                                trainer1.setAvailablePokemons(disponibles);
                                System.out.println("Equipo de entrenador: " + trainer1.getNameTrainer());
                                trainer1.addTeam();
                                // Mostrar el equipo
                                System.out.println("Equipo de " + trainer1.getNameTrainer() + ":");
                                trainer1.getTeam();


                                trainer2.setAvailablePokemons(disponibles);
                                System.out.println("Equipo de entrenador: " + trainer2.getNameTrainer());
                                trainer2.addTeam();
                                // Mostrar el equipo
                                System.out.println("Equipo de " + trainer2.getNameTrainer() + ":");
                                trainer2.getTeam();
                                break;
                            case 2:
                                // Crear los Pokémon personalizados
                                System.out.println("\n🔧 Crear Pokémon personalizados:");
                                break;
                            case 3:
                                //crear equipo aletorio
                                trainer1.setAvailablePokemons(disponibles);
                                RandomTeamPokemons(trainer1);

                                trainer2.setAvailablePokemons(disponibles);
                                RandomTeamPokemons(trainer2);
                                break;

                            default:
                                System.out.println("⚠️ Opción inválida.");
                        }
                    }



                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo del simulador...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }





    }






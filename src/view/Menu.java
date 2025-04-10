package view;

import battle.BattleTrainer;
import models.Trainer;
import models.pokemon.Pokemon;
import utils.PokemonFactory;
import java.util.Scanner;

import static view.TrainerMenu.RandomTeamPokemons;
import static view.TrainerMenu.enterCoaches;



public class Menu {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String CYAN_BOLD = "\u001B[1;96m";
    public static final String WHITE_BOLD = "\u001B[1;97m";




    private static final Scanner scanner = new Scanner(System.in);
    private static Trainer trainer1, trainer2;
    private static final Pokemon[] loadAvailablePokemons  = utils.PokemonFactory.loadAvailablePokemons();

    public static void main() {
        int opcion;

        do {
            System.out.print(RED + "_________________________________________________________________________" + RESET);
            System.out.println(WHITE_BOLD + "\n        ========= 🎮\uD83D\uDD25 MENÚ DE SIMULADOR POKÉMON 🎮\uD83D\uDD25 =========" + RESET);
            System.out.println(RED + "_________________________________________________________________________" + RESET);
            System.out.println(RED + "1. " + WHITE_BOLD + "Ingresar entrenadores" + RESET);
            System.out.println(RED + "2. " + WHITE_BOLD + "Seleccionar equipo Pokémon" + RESET);
            System.out.println(RED + "3. " + WHITE_BOLD + "Iniciar batalla" + RESET);
            System.out.println(RED + "4. " + WHITE_BOLD + "Salir" + RESET);
            System.out.print(RED + "Selecciona una opción: " + RESET);

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
                                System.out.println("Equipo de entrenador: " + CYAN_BOLD + trainer1.getNameTrainer() + RESET);
                                trainer1.addTeam();
                                // Mostrar el equipo
                                System.out.println("Equipo de " + CYAN_BOLD + trainer1.getNameTrainer() + ":" + RESET);
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
                                // Entrenador 1
                                System.out.println(CYAN_BOLD + "\n" + trainer1.getNameTrainer() + ", crea tus 3 Pokémon:" + RESET);
                                Pokemon[] team1 = new Pokemon[3];
                                for (int i = 0; i < 3; i++) {
                                    System.out.println(WHITE_BOLD + "\n➡️ Pokémon " + (i + 1) + ":" + RESET);
                                    team1[i] = PokemonFactory.createPokemonFromZero();
                                }
                                trainer1.setTeam(team1);

                                // Entrenador 2
                                System.out.println(CYAN_BOLD + "\n" + trainer2.getNameTrainer() + ", crea tus 3 Pokémon:" + RESET);
                                Pokemon[] team2 = new Pokemon[3];
                                for (int i = 0; i < 3; i++) {
                                    System.out.println(WHITE_BOLD + "\n➡️ Pokémon " + (i + 1) + ":" + RESET);
                                    team2[i] = PokemonFactory.createPokemonFromZero();
                                }
                                trainer2.setTeam(team2);

                                // Mostrar equipos
                                System.out.println("\n✅ Equipos creados:");
                                System.out.println(WHITE_BOLD + "Equipo de " + trainer1.getNameTrainer() + ":" + RESET);
                                trainer1.getTeam();

                                System.out.println(WHITE_BOLD + "\nEquipo de " + trainer2.getNameTrainer() + ":" + RESET);
                                trainer2.getTeam();
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
                    // implementation of battle
                    if (trainer1 == null || trainer2 == null) {
                        System.out.println("por favor antes de comenzar ingresa a los entrenadores.");
                    }

                    if(!trainer1.hasTeam()){
                        System.out.println("antes de comenzar ingresa el equipo del entrenador " + trainer1.getNameTrainer());
                    }

                    if(!trainer2.hasTeam()){
                        System.out.println("antes de comenzar ingresa el equipo del entrenador " + trainer2.getNameTrainer());
                    }
                    BattleTrainer battleTrainer = new BattleTrainer(trainer1,trainer2);
                    battleTrainer.combat();

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






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
    public static final String GREEN = "\u001B[32m";




    private static final Scanner scanner = new Scanner(System.in);
    private static Trainer trainer1, trainer2;
    private static final Pokemon[] loadAvailablePokemons  = utils.PokemonFactory.loadAvailablePokemons();

    public static void main() {
        int opcion;

        do {
            System.out.print(RED + "____________________________________________________________________________________" + RESET);
            System.out.println(WHITE_BOLD + "\n                                                                                   "+RED+" |"+RESET+"\n" +
                    WHITE_BOLD+"  ____        _        _ _             _____      _                                 "+RED+"|"+RESET+"\n" +
                    WHITE_BOLD+" |  _ \\      | |      | | |           |  __ \\    | |                                "+RED+"|"+RESET+"\n" +
                    WHITE_BOLD+" | |_) | __ _| |_ __ _| | | __ _      | |__) |__ | | _____ _ __ ___   ___  _ __     "+RED+"|"+RESET+"\n" +
                    WHITE_BOLD+" |  _ < / _` | __/ _` | | |/ _` |     |  ___/ _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\    "+RED+"|"+RESET+"\n" +
                    WHITE_BOLD+" | |_) | (_| | || (_| | | | (_| |     | |  | (_) |   <  __/ | | | | | (_) | | | |   "+RED+"|"+RESET+"\n" +
                    WHITE_BOLD+" |____/ \\__,_|\\__\\__,_|_|_|\\__,_|     |_|   \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|   "+RED+"|"+RESET+"\n" +
                    "                                                                                    "+RED+"|"+RESET +
                    "                                                                                 "+RED+"|" + RESET);
            System.out.println(RED + "____________________________________________________________________________________|" + RESET);
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
                        System.out.println(RED+"⚠️ Primero debes registrar a los entrenadores.");
                    } else {
                        System.out.println(WHITE_BOLD +"Es hora de elegir los equipos para la gran batalla!"+RESET);
                        System.out.println(WHITE_BOLD+"\n¿Cómo deseas seleccionar los equipos?"+RESET);
                        System.out.println(RED+"1."+WHITE_BOLD + " Elegir Pokémon desde la lista predefinida 🗂️"+RESET);
                        System.out.println(RED+"2."+WHITE_BOLD + " Crear Pokémon personalizados desde cero ✍️"+RESET);
                        System.out.println(RED+"3."+WHITE_BOLD + " un equipo aleatorio 😎"+RESET);
                        System.out.print(RED + "Selecciona una opción: "+RESET);
                        int subOpcion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        Pokemon[] disponibles = PokemonFactory.loadAvailablePokemons();

                        switch (subOpcion) {
                            case 1:


                                // Asignar lista al entrenador
                                trainer1.setAvailablePokemons(disponibles);
                                System.out.println(WHITE_BOLD +"Equipo de entrenador: " + GREEN + trainer1.getNameTrainer() + RESET);
                                trainer1.addTeam();
                                // Mostrar el equipo
                                System.out.println(WHITE_BOLD +"Equipo de " + GREEN + trainer1.getNameTrainer() + ":" + RESET);
                                trainer1.getTeam();


                                trainer2.setAvailablePokemons(disponibles);
                                System.out.println(WHITE_BOLD + "\nEquipo de entrenador: " + GREEN + trainer2.getNameTrainer() + RESET);
                                trainer2.addTeam();
                                // Mostrar el equipo
                                System.out.println(WHITE_BOLD +"Equipo de " + GREEN + trainer2.getNameTrainer() + ":"+RESET);
                                trainer2.getTeam();

                                break;

                            case 2:
                                // Crear los Pokémon personalizados
                                System.out.println(WHITE_BOLD + "\n🔧 Crear Pokémon personalizados:"+RESET);
                                // Entrenador 1
                                System.out.println(GREEN + "\n" + trainer1.getNameTrainer() + ", crea tus 3 Pokémon:" + RESET);
                                Pokemon[] team1 = new Pokemon[3];
                                for (int i = 0; i < 3; i++) {
                                    System.out.println(WHITE_BOLD + "\n➡️ Pokémon " + (i + 1) + ":" + RESET);
                                    team1[i] = PokemonFactory.createPokemonFromZero();
                                }
                                trainer1.setTeam(team1);

                                // Entrenador 2
                                System.out.println(GREEN + "\n" + trainer2.getNameTrainer() + ", crea tus 3 Pokémon:" + RESET);
                                Pokemon[] team2 = new Pokemon[3];
                                for (int i = 0; i < 3; i++) {
                                    System.out.println(WHITE_BOLD + "\n➡️ Pokémon " + (i + 1) + ":" + RESET);
                                    team2[i] = PokemonFactory.createPokemonFromZero();
                                }
                                trainer2.setTeam(team2);

                                // Mostrar equipos
                                System.out.println(WHITE_BOLD+ "\n✅ Equipos creados:"+RESET);
                                System.out.println(WHITE_BOLD + "Equipo de " + CYAN_BOLD + trainer1.getNameTrainer() + ":" + RESET);
                                trainer1.getTeam();

                                System.out.println(WHITE_BOLD + "\nEquipo de " + CYAN_BOLD + trainer2.getNameTrainer() + ":" + RESET);
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
                                System.out.println(RED+"⚠️ Opción inválida."+RESET);
                        }
                    }



                    break;
                case 3:
                    // implementation de batalla
                    if (trainer1 == null || trainer2 == null) {
                        System.out.println(RED+"⚠️  Por favor, ingresa primero a los entrenadores."+RESET);
                    } else if (!trainer1.hasTeam() || !trainer2.hasTeam()) {
                        System.out.println(RED+"⚠️  Por favor, ingresa los equipos para los entrenadores " + trainer1.getNameTrainer() + " y " + trainer2.getNameTrainer()+RESET);
                    }  else {

                        BattleTrainer battleTrainer = new BattleTrainer(trainer1, trainer2);

                        battleTrainer.combat();
                    }

                    break;
                case 4:
                    System.out.println(CYAN_BOLD + "✌️ Saliendo del simulador..."+RESET);
                    break;
                default:
                    System.out.println(RED+"⚠️ Opción no válida, intenta de nuevo."+RESET);
            }
        } while (opcion != 4);

        scanner.close();
    }





    }






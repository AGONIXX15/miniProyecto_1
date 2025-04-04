package view;

import models.Trainer;
import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;


import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static Trainer trainer1, trainer2;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== 🎮\uD83D\uDD25 MENÚ DE SIMULADOR POKÉMON 🎮\uD83D\uDD25 ===");
            System.out.println("1. Ingresar entrenadores");
            System.out.println("2. Seleccionar equipo Pokémon");
            System.out.println("3. Iniciar batalla");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    EnterCoach();
                    break;
                case 2:

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

    public static void EnterCoach() {
        System.out.print("\nIngrese el nombre del Entrenador 1: ");
        String coach1 = scanner.nextLine();

        // Crear equipo antes de instanciar el entrenador
        Pokemon[] team1 = SelectTeam();
        trainer1 = new Trainer(coach1, team1);

        scanner.nextLine();  //Limpia el buffer

        System.out.print("Ingrese el nombre del Entrenador 2: ");
        String coach2 = scanner.nextLine();

        Pokemon[] team2 = SelectTeam();
        trainer2 = new Trainer(coach2,team2);

        System.out.println("\nEntrenadores registrados correctamente.");
    }

    public static Pokemon[] SelectTeam() {
        System.out.println("Selecciona tu equipo pokemon: ");
        System.out.println("Pokemones available: ");

        //Crear ataques predefinidos
        Attack[] ataquesPikachu = {
                new Attack("Impactrueno", (short)40, TypeDamage.SPECIAL),
                new Attack("Rayo", (short)90, TypeDamage.SPECIAL)
        };

        Attack[] ataquesCharizard = {
                new Attack("Lanzallamas", (short)90, TypeDamage.SPECIAL),
                new Attack("Garra Dragón", (short)80, TypeDamage.PHYSICAL)
        };

        Attack[] ataquesBlastoise = {
                new Attack("Hidrobomba", (short)110, TypeDamage.SPECIAL),
                new Attack("Cabezazo", (short)75, TypeDamage.PHYSICAL)
        };

        Attack[] ataquesVenusaur = {
                new Attack("Rayo Solar", (short)120, TypeDamage.SPECIAL),
                new Attack("Hoja Afilada", (short)55, TypeDamage.PHYSICAL)
        };

        Attack[] ataquesPidgeot = {
                new Attack("Ataque Aéreo", (short)60, TypeDamage.PHYSICAL),
                new Attack("Tornado", (short)40, TypeDamage.SPECIAL)
        };

        Pokemon pikachu = new Pokemon("pikachu",100,TypePokemon.FIRE,ataquesPikachu);
        Pokemon charizard = new Pokemon("Charizard",100,TypePokemon.FIRE,ataquesCharizard);
        Pokemon blastoise = new Pokemon("Blastoise",100,TypePokemon.FIRE,ataquesBlastoise);
        Pokemon venusaur = new Pokemon("Venusaur",100,TypePokemon.FIRE,ataquesVenusaur);

        Pokemon[] available = {pikachu, charizard, blastoise, venusaur};


        //Mostrar los Pokémon available
        for (int i = 0; i < available.length; i++) {
            System.out.println((i + 1) + ". " + available[i].getName() );
        }

        //Permitir seleccion de hasta 3 Pokémon
        Pokemon[] team = new Pokemon[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Elige el Pokémon " + (i + 1) + " (1-" + available.length + "): ");
            int choice;
            while (true) {
                choice = scanner.nextInt() - 1;

                if (choice >= 0 && choice < available.length) {
                    break;
                } else {
                    System.out.print("Selección inválida. Intenta de nuevo: ");
                }
            }
            team[i] = available[choice];
        }

        return team;



    }





}
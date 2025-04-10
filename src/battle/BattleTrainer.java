package battle;

import models.Trainer;
import models.pokemon.Pokemon;
import view.PokemonMenu;

import java.util.Scanner;

public class BattleTrainer {
    private Trainer player1, player2;

    public BattleTrainer(Trainer player1, Trainer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean trainerHasLost(Trainer trainer) {
        for(Pokemon pokemon: trainer.team){
            if(pokemon.isAlive()){
                return false;
            }
        }
        return true;
    }

    public Pokemon choosePokemon(Trainer trainer) {
        Scanner sc = new Scanner(System.in);
        boolean condition;
        int index;
        do {
            PokemonMenu.showAllPokemons(trainer.team);
            System.out.println("por favor escoje uno de los pokemones disponibles:");
            index = Integer.parseInt(sc.nextLine())-1;
            condition = !(index >= 0 && index < trainer.team.length);
        }while(condition);
        Pokemon pokemon = trainer.team[index];
        return pokemon;
    }

    public void combat() {
        while (!trainerHasLost(player1) && !trainerHasLost(player2)) {
            Pokemon pokemon1 = choosePokemon(player1);
            Pokemon pokemon2 = choosePokemon(player2);
            BattlePokemon battlePokemon = new BattlePokemon(pokemon1, pokemon2);
            battlePokemon.combat();
        }

        if (trainerHasLost(player1)){
            System.out.printf("%s lost the battle", player1.getNameTrainer());
        } else {
            System.out.printf("%s won the battle", player1.getNameTrainer());
        }

        if (trainerHasLost(player2)){
            System.out.printf("%s lost the battle", player2.getNameTrainer());
        } else {
            System.out.printf("%s won the battle", player2.getNameTrainer());
        }
    }
}

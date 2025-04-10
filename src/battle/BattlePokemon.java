package battle;

import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import view.PokemonMenu;

import java.util.Scanner;

public class BattlePokemon {
    Pokemon pokemon1, pokemon2;

    public BattlePokemon(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public Attack selectAttack(Pokemon pokemon) {
        Scanner sc = new Scanner(System.in);
        boolean condition = false;
        int index;
        do {
            PokemonMenu.showPokemonAttacks(pokemon);
            index = Integer.parseInt(sc.nextLine())-1;
            condition = !(index >= 0 && index < pokemon.getAttacks().length);
        }while(condition);
        return pokemon.getAttacks()[index];
    }

    public void combat(){
        // comienza el que menos vida actual tiene
        int turn = (pokemon1.getHealth() >= pokemon2.getHealth()) ? 1 : 0;
        while(pokemon1.isAlive() && pokemon2.isAlive()){
            if (turn % 2 == 0) {
                Attack attack = selectAttack(pokemon1);
                pokemon1.makeDamage(pokemon2, attack);
            } else {
                Attack attack = selectAttack(pokemon2);
                pokemon2.makeDamage(pokemon1, attack);
            }
            // se autoincrementa para poder intercalar los turnos
            turn++;
        }

        if(pokemon1.isAlive()){
            System.out.printf("%s win the battle pokemon!\n", pokemon1.getName());
        } else {
            System.out.printf("%s lost the battle pokemon!\n", pokemon1.getName());
        }

        if(pokemon2.isAlive()){
            System.out.printf("%s win the battle pokemon!\n", pokemon2.getName());
        } else  {
            System.out.printf("%s lost the battle pokemon!\n", pokemon2.getName());
        }
    }
}

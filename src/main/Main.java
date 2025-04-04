package main;
import models.Trainer;
import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;


public class Main {
    public static void main(String[] args) {
        Attack attack = new Attack("atacar", (short) 2000,TypeDamage.PHYSICAL);
        Attack attack1[] = {attack};

        Pokemon pokemon0 = new Pokemon("pikachu",100, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon1 = new Pokemon("Charmander",70, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon2 = new Pokemon("Bulbasur",70, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon[] = {pokemon0,pokemon1,pokemon2};
        Trainer trainer = new Trainer("sebastian",pokemon);

        trainer.addTeam();
        trainer.getTeam();
    }
}


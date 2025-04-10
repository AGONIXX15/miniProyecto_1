package main;
import models.Trainer;
import models.pokemon.Pokemon;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.utils.TypePokemon;
import view.Menu;

public class Main {
    public static void main(String[] args) {

        Attack ataque1 = new Attack("Llamarada", (short)110, TypeDamage.SPECIAL);
        Attack ataque2 = new Attack("Terremoto", (short)100, TypeDamage.PHYSICAL);
        Pokemon w1 = new Pokemon("squirtle",100, TypePokemon.WATER, new Attack[]{ataque1,ataque2});
        Pokemon pikachu = new Pokemon("pikachu", 100, TypePokemon.ELECTRIC, new Attack[]{ataque1});
        //w1.makeDamage(pikachu,ataque1);


        Attack attack = new Attack("atacar", (short) 2000,TypeDamage.PHYSICAL);
        Attack attack1[] = {attack};

        Pokemon pokemon0 = new Pokemon("pikachu",100, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon1 = new Pokemon("Charmander",70, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon2 = new Pokemon("Bulbasur",70, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon3 = new Pokemon("gato",100, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon4 = new Pokemon("perro",70, TypePokemon.ELECTRIC,attack1);
        Pokemon pokemon5 = new Pokemon("perra",70, TypePokemon.ELECTRIC,attack1);


        Pokemon pokemon[] = {pokemon0,pokemon1, pokemon2};
        Pokemon pokemon_1[]={pokemon3,pokemon4,pokemon5};

        Trainer trainer = new Trainer("sebastian",pokemon);
        Trainer trainer1 = new Trainer("sebastian",pokemon_1);
        //trainer.randomTeam();
        //trainer1.addTeam();

        //trainer.getTeam();
        //trainer1.getTeam();
        Menu menu = new Menu();
        menu.main();




    }
}


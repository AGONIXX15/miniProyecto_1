package main;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.Pokemon;
import models.pokemon.utils.TypePokemon;

public class Main {
    public static void main(String[] args) {
        Attack ataque1 = new Attack("Llamarada", (short)110, TypeDamage.SPECIAL);
        Attack ataque2 = new Attack("Terremoto", (short)100, TypeDamage.PHYSICAL);
        Pokemon w1 = new Pokemon("squirtle",100, TypePokemon.WATER, new Attack[]{ataque1,ataque2});
        Pokemon pikachu = new Pokemon("pikachu", 100, TypePokemon.ELECTRIC, new Attack[]{ataque1});
        w1.makeDamage(pikachu,ataque1);
        System.exit(0);
    }
}


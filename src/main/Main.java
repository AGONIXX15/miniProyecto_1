package main;
import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;
import models.pokemon.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        Attack ataque1 = new Attack("Llamarada", (short)110, TypeDamage.SPECIAL);
        Attack ataque2 = new Attack("Terremoto", (short)100, TypeDamage.PHYSICAL);
        WaterPokemon w1 = new WaterPokemon("squirtle",100, new Attack[]{ataque1,ataque2});
        WaterPokemon w2 = new WaterPokemon("popo",100, new Attack[]{ataque1,ataque2});
        w1.useAttack(w2, ataque1);

    }
}


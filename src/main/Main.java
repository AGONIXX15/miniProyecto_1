package main;
import models.pokemons.utils.Attack;
import models.pokemons.utils.TypeDamage;

public class Main {
    public static void main(String[] args) {
        Attack ataque1 = new Attack("Llamarada", (short)110, TypeDamage.SPECIAL);
        Attack ataque2 = new Attack("Terremoto", (short)100, TypeDamage.PHYSICAL);

        ataque1.showInfo();
        ataque2.showInfo();
    }
}


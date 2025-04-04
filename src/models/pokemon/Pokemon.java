package models.pokemon;

import models.pokemon.utils.Attack;
import models.pokemon.utils.TypePokemon;

import java.util.Arrays;

public class Pokemon {
    private String name;
    private TypePokemon type;
    private Attack[] attacks;
    private int health;


    /**
     * constructor de la clase abstracta pokemon
     *
     * @param name    nombre del pokemon
     * @param health  salud del pokemon
     * @param type    tipo del pokemon
     * @param attacks ataques del pokemon
     */
    public Pokemon(String name, int health, TypePokemon type, Attack[] attacks) {
        this.name = name;
        this.health = health;
        this.type = type;
        this.attacks = attacks;
    }




    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePokemon getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void getAttacks() {

    }

    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }

    public void setType(TypePokemon type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Nombre = " + name +
                ", Tipo = " + type +
                ", Salud = " + health ;
    }
}


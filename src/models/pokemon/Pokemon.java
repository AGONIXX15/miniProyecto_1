package models.pokemon;

import models.pokemon.utils.Attack;
import models.pokemon.utils.TypePokemon;

import java.util.Arrays;

public class Pokemon {
    private String name;
    private TypePokemon type;
    private Attack[] attacks;
    private int healthMax;
    private int health;


    /**
     * constructor de la clase abstracta pokemon
     *
     * @param name    nombre del pokemon
     * @param healthMax  salud maxima del pokemon
     * @param type    tipo del pokemon
     * @param attacks ataques del pokemon
     */
    public Pokemon(String name, int healthMax, TypePokemon type, Attack[] attacks) {
        this.name = name;
        this.healthMax = healthMax;
        this.health = healthMax;
        this.type = type;
        this.attacks = attacks;
    }




    public String getName() {
        return name;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
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

    public Attack[] getAttacks() {
        return attacks;
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







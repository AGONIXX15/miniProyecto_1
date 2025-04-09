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

    public void cure(int health){
        this.health = Math.min(this.health + health, this.healthMax);
        System.out.printf("%s ha sido curado hasta %d\n", this.name, this.health);
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health-damage);
        System.out.printf("%s recibio %d de daño \n", name, damage);
        System.out.printf("%s tiene una vida de %d \n", name, health);
        if (health == 0){
            System.out.printf("%s ha sido derrotado...\n", name);
        }
    }

    public boolean hasAdvantage(Pokemon enemy){
       if(Arrays.binarySearch(type.strong, enemy.toString()) >= 0){
            return true;
        }
        return false;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void makeDamage(Pokemon enemy, Attack attack){
        float advantage = (hasAdvantage(enemy)) ? 1.3f : 1;
        if(advantage > 1){
            System.out.println("el ataque ha sido efectivo!!");
        }
        int damage = (int) advantage * attack.getPower();
        System.out.printf("%s realizo %s hacia %s con un daño de %d\n",name, attack.getName(), enemy.getName(),damage);
        enemy.takeDamage(damage);
    }
    @Override
    public String toString() {
        return
                "Nombre = " + name +
                        ", Tipo = " + type +
                        ", Salud = " + health ;
    }
}







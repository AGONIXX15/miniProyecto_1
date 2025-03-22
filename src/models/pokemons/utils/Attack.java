package models.pokemons.utils;

public class Attack {
    private String name;          // Nombre del ataque
    private short power;            // Poder del ataque
    private TypeDamage typeDamage;      // Tipo de ataque (FISICO o ESPECIAL

    public Attack(String name, short power, TypeDamage typeDamage) {
        this.name = name;
        this.power = power;
        this.typeDamage = typeDamage;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public TypeDamage getTypeDamage() {
        return typeDamage;
    }

    public void setTypeDamage(TypeDamage typeDamage) {
        this.typeDamage = typeDamage;
    }



    public void showInfo() {
        System.out.println("Ataque: " + name);
        System.out.println("Poder: " + power);
        System.out.println("Tipo de Daño: " + typeDamage);

    }
}


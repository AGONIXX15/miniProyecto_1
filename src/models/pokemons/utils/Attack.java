package models.pokemons.utils;

public class Attack {
    private String name;          // Nombre del ataque
    private short power;            // Poder del ataque
    private TypeDamage typeDamage;      // Tipo de ataque (FISICO o ESPECIAL
    private TypeAttack typeAttack;

    public Attack(String name, short power, TypeDamage typeDamage, TypeAttack typeAttack) {
        this.name = name;
        this.power = power;
        this.typeDamage = typeDamage;
        this.typeAttack = typeAttack;
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

    public TypeAttack getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(TypeAttack typeAttack) {
        this.typeAttack = typeAttack;
    }

    public void showInfo() {
        System.out.println("Ataque: " + name);
        System.out.println("Poder: " + power);
        System.out.println("Tipo de Daño: " + typeDamage);
        System.out.println("Tipo de Ataque: " + typeAttack);
    }
}


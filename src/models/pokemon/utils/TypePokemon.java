package models.pokemon.utils;

public enum TypePokemon {
    ELECTRIC(new String[]{"WATER","FLYING"}),
    FIRE(new String[]{"GRASS"}),
    WATER(new String[]{"FIRE"}),
    GRASS(new String[]{"GRASS"}),
    FLYING(new String[]{"GRASS"});

    public String[] strong;
    TypePokemon(String[] strong) {
        this.strong = strong;
    }

    String[] getStrong() {
        return strong;
    }
}
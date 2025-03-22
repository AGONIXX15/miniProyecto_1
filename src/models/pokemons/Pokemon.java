package models.pokemons;
import models.pokemons.utils.Attack;
import models.pokemons.utils.TypePokemon;

/**
 * @author Sebastian Rubio
 */
public abstract class Pokemon {
    protected String name;
    protected TypePokemon type;
    protected Attack[] attacks;
    protected int health;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    /**
     * constructor de la clase abstracta pokemon
     *
     * @param name nombre del pokemon
     * @param health salud del pokemon
     * @param type tipo del pokemon
     * @param attacks ataques del pokemon
     */
    public Pokemon(String name, int health, TypePokemon type, Attack[] attacks) {
        this.name = name;
        this.health = health;
        this.type = type;
        this.attacks = attacks;
    }

    /**
     * usa el ataque contra el enemigo
     * @author Sebastian Rubio
     * @param enemy pokemon enemigo
     * @param attack ataque usado contra el pokemon enemigo
     */
    public void useAttack(Pokemon enemy, Attack attack){
        float advantage = this.calculateAdvantage(enemy);
        int damage = (int) (attack.getPower() * advantage);

        System.out.printf("%s uso el ataque %s en %s\n",this.name, attack.getName(), enemy.getName());
        if (advantage > 1f){
            System.out.println("es super efectivo!!");
        } else if (advantage < 1f){
            System.out.println("no es muy efectivo...");
        }
        enemy.takeDamage(damage);
    }

    /**
     * metodo que calcula la nueva vida segun el daño recibido
     * @param damage daño recibido hacia el pokemon
     */
    public void takeDamage(int damage){
        this.health = Math.max(0, this.health - damage);
        System.out.printf("%s recibio %d de daño! vida restante: %d\n", this.name, damage, this.health);
        if (this.isDefeated()){
            System.out.printf("%s ha sido derrotado!", this.name);
        }
    }

    /**
     * verifica si el pokemon aun tiene salud
     * @return boolean
     */
    public Boolean isDefeated(){
        return this.health == 0;
    }

    /**
     * calcula la ventaja que tiene el pokemon hacia otro dependiendo del tipo
     * @param enemy el pokemon enemigo que se va calcular si se le tiene alguna ventaja hacia el
     * @return float
     */
    public abstract float calculateAdvantage(Pokemon enemy);

}

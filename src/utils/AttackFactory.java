package utils;

import models.pokemon.utils.Attack;
import models.pokemon.utils.TypeDamage;

public class AttackFactory {
    public static final Attack THUNDERBOLT = new Attack("Rayo", (short)40, TypeDamage.SPECIAL);
    public static final Attack FIRE_BLAST = new Attack("Llamarada", (short) 60, TypeDamage.SPECIAL);
    public static final Attack FLAMETHROWER = new Attack("Lanzallamas", (short) 50, TypeDamage.SPECIAL);
    public static final Attack WATER_GUN = new Attack("Pistola de Agua", (short) 35, TypeDamage.SPECIAL);
    public static final Attack THUNDER = new Attack("Trueno", (short) 60, TypeDamage.SPECIAL);
    public static final Attack RAZOR_LEAF = new Attack("Hoja Afilada", (short) 40, TypeDamage.PHYSICAL);
    public static final Attack VINE_WHIP = new Attack("Látigo Cepa", (short) 30, TypeDamage.PHYSICAL);
    public static final Attack SOLAR_BEAM = new Attack("Rayo Solar", (short) 65, TypeDamage.SPECIAL);
    public static final Attack TACKLE = new Attack("Placaje", (short) 20, TypeDamage.PHYSICAL);
    public static final Attack DOUBLE_KICK = new Attack("Doble Patada", (short) 30, TypeDamage.PHYSICAL);
    public static final Attack SHOCK_WAVE = new Attack("Onda Trueno", (short) 35, TypeDamage.SPECIAL);
    public static final Attack QUICK_ATTACK = new Attack("Ataque Rápido", (short) 30, TypeDamage.PHYSICAL);
    public static final Attack LEAF_BLADE = new Attack("Cuchilla de Hoja", (short) 45, TypeDamage.PHYSICAL);
    public static final Attack SLASH = new Attack("Cuchillada", (short) 40, TypeDamage.PHYSICAL);

    public static Attack[] loadAvailableAttacks() {
        return new Attack[] {
                FIRE_BLAST,
                FLAMETHROWER,
                WATER_GUN,
                THUNDER,
                RAZOR_LEAF,
                VINE_WHIP,
                SOLAR_BEAM,
                TACKLE,
                DOUBLE_KICK,
                SHOCK_WAVE,
                QUICK_ATTACK,
                LEAF_BLADE,
                SLASH
        };
    }
}
